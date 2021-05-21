package com.example.PojoToXml.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private String name;
	private String age;
	private String city;
	private String salary;
	private Car cars;


}
