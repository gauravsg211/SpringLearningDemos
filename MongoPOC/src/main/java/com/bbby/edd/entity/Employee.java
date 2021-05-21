package com.bbby.edd.entity;
import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class Employee{
	
	
	@Id
	private int id;
	private String name;
	private String city;
	private int age;
	
	private int managerId;
	
}
