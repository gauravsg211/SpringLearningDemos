package com.bbby.edd.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbby.edd.dto.EmployeeManagerList;
import com.bbby.edd.dto.ManagerEmployeeListDto;
import com.bbby.edd.dto.OfficeDto;
import com.bbby.edd.entity.Employee;
import com.bbby.edd.entity.Manager;
import com.bbby.edd.exception.ManagerIdNotFoundException;
import com.bbby.edd.repo.EmployeeRepository;
import com.bbby.edd.repo.ManagerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class OfficeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ManagerRepository managerRepository;
	
	@PostMapping("/addemployee")
	public ResponseEntity<?> addUser(@RequestBody Employee employee){
		Employee emp=employeeRepository.addEmployee(employee);
		return ResponseEntity.ok(emp);
		
	}
	
	@PostMapping("/addmanager")
	public ResponseEntity<?> addManager(@RequestBody Manager manager){
		Manager mng=managerRepository.addManager(manager);
		return ResponseEntity.ok(mng);
		
	}
	
	@PostMapping("/addNewManagerAndEmployee")
	public ResponseEntity<?> addUser(@RequestBody OfficeDto office){
		managerRepository.addNewManagerAndEmployee(office);
		return ResponseEntity.ok(office);
		
	}
	
	@GetMapping("/getemployee")
	public ResponseEntity<?> getEmployee(){
		List<Employee> list=employeeRepository.getEmployee();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/getemployee/{empId}")
	public ResponseEntity<?> getEmployee(@PathVariable int empId){
		Employee employee=employeeRepository.getEmployeeById(empId);
		return ResponseEntity.ok(employee);
		
	}
	
	@GetMapping("/getmanager/{mngId}")
	public ResponseEntity<?> getManager(@PathVariable int mngId){
		Manager manager=managerRepository.getManagerById(mngId);
		return ResponseEntity.ok(manager);
		
	}
	
	@GetMapping("/getmanager")
	public ResponseEntity<?> getManager(){
		List<Manager> list=managerRepository.getManager();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/getEmployeesByManagerId")
	public ResponseEntity<?>getEmployeesByManager(){
		ManagerEmployeeListDto list=managerRepository.getEmployeesByManagerId();
		return ResponseEntity.ok(list);
		
	}
	
	@DeleteMapping("/deleteEmployee/{empId}")
	public ResponseEntity<?>deleteEmployee(@PathVariable int empId){
		employeeRepository.deleteEmployee(empId);
		String msg=String.format("Employee with id:%s deleted",empId);
		return ResponseEntity.ok(msg);
		
	}
	
	

}
