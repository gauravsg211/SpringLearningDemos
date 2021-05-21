package com.example.SimpleRedisPoc.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SimpleRedisPoc.model.Employee;
import com.example.SimpleRedisPoc.model.ResponseDto;
import com.example.SimpleRedisPoc.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/redis/employee")
public class EmployeeController {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService service;
	
	
	@PostMapping
	public ResponseDto save(@RequestBody final Employee employee) {
		LOG.info("Saving the new employee to the redis.");
		if (!ObjectUtils.isEmpty(service.findById(employee.getId()))) {

			return saveOrUpdateEmployee("Successfully Updated. Employee with id= " + employee.getId(), employee,"UPDATED");

		} else {

			return saveOrUpdateEmployee("Successfully added. Employee with id= " + employee.getId(), employee,"CREATED");

		}
	}

	private ResponseDto saveOrUpdateEmployee(String ResponseMessage, Employee employee,String mode) {
		ResponseDto responseDto = new ResponseDto();
		service.save(employee);
		responseDto.setStatus("Success");
		responseDto.setResponseMessage(ResponseMessage);
		responseDto.setEmployee(employee);
		responseDto.setMode(mode);
		return responseDto;
	}

	
	@GetMapping("/getall")
	public Map<String, Employee> findAll() {
		LOG.info("Fetching all employees from the redis.");
		final Map<String, Employee> employeeMap = service.findAll();
		return employeeMap;
	}

	@Cacheable(value = "Employee", key = "#id")
    @GetMapping("/get/{id}")
	public Employee findById(@PathVariable("id") final String id) {
		LOG.info("Fetching employee with id= " + id);
		return service.findById(id);
	}

	@CacheEvict(value = "Employee", key = "#id")
	@DeleteMapping("/delete/{id}")
	public Map<String, Employee> delete(@PathVariable("id") final String id) {
		LOG.info("Deleting employee with id= " + id);
		service.delete(id);
		return findAll();
	}
	
	
}
