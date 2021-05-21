package com.example.office.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.office.entity.Manager;
import com.example.office.entity.Employee;

import com.example.office.dto.EmployeeModelDTO;
import com.example.office.repository.EmployeeRepository;
@Service
public class EmployeeService {
	
    @Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ManagerService managerService;

	 public List<Employee> getAllEmployees() {
		 
	        return employeeRepository.findAll();
	    }
	 
	
	 public EmployeeModelDTO  addEmployee(EmployeeModelDTO employeeModelDTO) {
			Manager m=new Manager(managerService.getManagerById(employeeModelDTO.getManagerId()));

	
           Employee emp=new Employee(employeeModelDTO);
            emp.setManager(m);
			return new EmployeeModelDTO(employeeRepository.save(emp)).setEmployeeModelDTO(emp);
			

}
}