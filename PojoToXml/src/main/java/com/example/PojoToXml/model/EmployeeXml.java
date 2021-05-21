package com.example.PojoToXml.model;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "Employees")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "employee"        
    })

public class EmployeeXml {
	
	@XmlElement(name = "Employee", required = true)
    private List<EmployeeXml.Employee> employee;
	
	public List<EmployeeXml.Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(List<EmployeeXml.Employee> employee) {
		this.employee = employee;
	}



	@XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "name", "age", "city", "salary", "cars" })
    public static class Employee{

	@XmlElement(name = "cars", required = true)
	protected EmployeeXml.Cars cars;
	@XmlElement(name = "name", required = true)
	protected String name;
	@XmlElement(name = "age")
	protected String age;
	@XmlElement(name = "city")
	protected String city;
	@XmlElement(name = "salary")
	protected String salary;
	public EmployeeXml.Cars getCars() {
		return cars;
	}

	public void setCars(EmployeeXml.Cars cars) {
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	}

	

	/**
	 * Gets the value of the cars property.
	 * 
	 * @return possible object is {@link ExceptionRequest.cars }
	 * 
	 */

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "name", "model"})
	public static class Cars {

		@XmlElement(name = "name")
		protected String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		@XmlElement(name = "model")
		protected String model;

	}

}
