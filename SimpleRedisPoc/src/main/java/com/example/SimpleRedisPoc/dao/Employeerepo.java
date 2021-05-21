package com.example.SimpleRedisPoc.dao;

import java.util.Map;

import com.example.SimpleRedisPoc.model.Employee;


public interface Employeerepo{

	void save(Employee employee);
	
	Employee findById(String id);
	
	Map<String, Employee> findAll();
	
	void delete(String id);
}
