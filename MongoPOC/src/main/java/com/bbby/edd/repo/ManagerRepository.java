package com.bbby.edd.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.bbby.edd.dto.EmployeeDetails;
import com.bbby.edd.dto.EmployeeManagerList;
import com.bbby.edd.dto.ManagerEmployeeListDto;
import com.bbby.edd.dto.OfficeDto;
import com.bbby.edd.entity.Employee;
import com.bbby.edd.entity.Manager;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ManagerRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public void addNewManagerAndEmployee(OfficeDto office) {
		Employee employee=new Employee();
		employee.setAge(office.getEmployee().getAge());
		employee.setCity(office.getEmployee().getCity());
	    employee.setName(office.getEmployee().getName());
		Manager manager = office.getManager();
		employee.setManagerId(manager.getId());
		mongoTemplate.insert(employee);
		mongoTemplate.insert(manager);

	}

	public Manager getManagerById(int mngId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(mngId));
		log.debug("Query Created :: " + query.toString());
		Manager manager = mongoTemplate.findOne(query, Manager.class);
		return manager;
	}

	public List<Manager> getManager() {
		List<Manager> list = mongoTemplate.findAll(Manager.class);
		return list;

	}

	public Manager addManager(Manager manager) {
		return mongoTemplate.insert(manager);
	}

	public ManagerEmployeeListDto getEmployeesByManagerId() {

		ManagerEmployeeListDto managerEmployeeListDto = new ManagerEmployeeListDto();

		List<Manager> list = mongoTemplate.findAll(Manager.class);
		List<EmployeeManagerList> list1 = new ArrayList<>();
		for (Manager manager : list) {
			Query query = new Query();
			query.addCriteria(Criteria.where("managerId").is(manager.getId()));
			List<Employee> employeeList = mongoTemplate.find(query, Employee.class);
			EmployeeManagerList employeeManagerList = new EmployeeManagerList();
			employeeManagerList.setManagerId(manager.getId());
			employeeManagerList.setManagerName(manager.getName());
			List<EmployeeDetails> EmployeeNames = employeeList.stream().map(mapping()).collect(Collectors.toList());
			employeeManagerList.setEmployeeList(EmployeeNames);
			list1.add(employeeManagerList);

		}

		managerEmployeeListDto.setEmployeeManagerList(list1);
		return managerEmployeeListDto;

	}
	
	private static final  Function<Employee,EmployeeDetails> mapping(){
		return e->{
			
			EmployeeDetails employeeDetails=new EmployeeDetails();
			
			employeeDetails.setId(e.getId());
			employeeDetails.setName(e.getName());
		
		return employeeDetails;

	};

	}

}
