package com.bbby.edd.dto;
import com.bbby.edd.entity.Manager;

import lombok.Data;

@Data
public class OfficeDto {
	
	AddEmployeeDto employee;
	Manager manager;

}
