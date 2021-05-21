package com.bbby.edd.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Manager {
	
	@Id
	private int id;
	
	 private String name;
	 private String city;
	 private double salary;
	 private int phone;

	

}
