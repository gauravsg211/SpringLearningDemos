package com.bbby.edd.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeManagerList {
	
	private int managerId;
	private String managerName;
	List<EmployeeDetails> employeeList;
	

}
