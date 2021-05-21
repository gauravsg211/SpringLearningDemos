package com.bbby.edd.repo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.bbby.edd.dto.ManagerEmployeeListDto;
import com.bbby.edd.entity.Employee;
import com.bbby.edd.entity.Manager;
import com.bbby.edd.exception.ManagerIdNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmployeeRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public Employee addEmployee(Employee employee) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(employee.getManagerId()));
		log.debug("Query Created :: " + query.toString());

		if (ObjectUtils.isEmpty(mongoTemplate.findOne(query, Manager.class))) {
			throw new ManagerIdNotFoundException("Manager Id not present");
		}
		Employee resultEmployee = mongoTemplate.insert(employee);
		log.debug("added user :: " + resultEmployee.toString());
		return resultEmployee;
	}

	public List<Employee> getEmployee() {
		List<Employee> list = mongoTemplate.findAll(Employee.class);
		return list;

	}

	public Employee getEmployeeById(int empId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(empId));
		log.debug("Query Created :: " + query.toString());
		Employee employee = mongoTemplate.findOne(query, Employee.class);
		return employee;

	}

	public void deleteEmployee(int empId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(empId));
		mongoTemplate.remove(query, Employee.class);
	}

}
