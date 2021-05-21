package com.example.PojoToXml.controller;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PojoToXml.model.Car;
import com.example.PojoToXml.model.Employee;
import com.example.PojoToXml.model.EmployeeDto;
import com.example.PojoToXml.model.EmployeeXml;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {

	@PostMapping("/hit")
	public String MapPojoToXml(@RequestBody EmployeeDto emp) {

		EmployeeXml employeeXml = new EmployeeXml();
		List<EmployeeXml.Employee> EmployeeList = new ArrayList<>();

		for (Employee em : emp.getEmployee()) {

			final EmployeeXml.Cars cars = new EmployeeXml.Cars();
			final EmployeeXml.Employee employee = new EmployeeXml.Employee();
			employee.setAge(em.getAge());
			cars.setModel(em.getCars().getModel());
			cars.setName(em.getCars().getName());
			employee.setCity(em.getCity());
			employee.setName(em.getName());
			employee.setSalary(em.getSalary());
			employee.setCars(cars);
			EmployeeList.add(employee);

		}

		employeeXml.setEmployee(EmployeeList);
		createXmlFile(employeeXml);

		try {
			String XmlString = (String) convertXmlToString(employeeXml);
			log.info("{}", XmlString);

		}

		catch (JAXBException e) {
			log.error("{}", e);
		}

		return "request recieved";

	}

	private Object convertXmlToString(EmployeeXml employeeXml) throws JAXBException {
		JAXBContext jaxbcontent = JAXBContext.newInstance(EmployeeXml.class);
		Marshaller jaxbMarshaller = jaxbcontent.createMarshaller();
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(employeeXml, sw);
		return sw.toString();

	}

	private void createXmlFile(EmployeeXml employeeXml) {

		try {
			JAXBContext jaxbcontent = JAXBContext.newInstance(EmployeeXml.class);
			Marshaller jaxbMarshaller = jaxbcontent.createMarshaller();
			File file = new File("C:\\Users\\ba53156\\Desktop\\Code31\\file.xml");
			jaxbMarshaller.marshal(employeeXml, file);
			jaxbMarshaller.marshal(employeeXml, System.out);
		} catch (JAXBException e) {

		}

	}
	
	@GetMapping("/convert")
	public ResponseEntity<EmployeeDto> XmlTojson() {
		
		try {
		
//	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//	    Document doc = dBuilder.parse(fXmlFile);
//	    doc.getDocumentElement().normalize();
		File fXmlFile = new File("C:\\Users\\ba53156\\Desktop\\Code31\\file.xml");
		JAXBContext jc = JAXBContext.newInstance(EmployeeXml.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        EmployeeXml sc = (EmployeeXml) unmarshaller.unmarshal(fXmlFile);
        EmployeeDto emp=new EmployeeDto();
        List<Employee> emp1= sc.getEmployee().stream().map(mapping()).collect(Collectors.toList());
        
        
        emp.setEmployee(emp1);
        JsonFromObject(emp);
		return ResponseEntity.ok(emp);
		}
		catch(Exception e) {
			log.error("{}",e);
			return null;
		}
			
	}

	private Function<EmployeeXml.Employee,Employee> mapping(){
		return e->{
		Employee employee=new Employee();
		
		
			employee.setName(e.getName());
			employee.setCity(e.getCity());
			employee.setSalary(e.getSalary());
			employee.setAge(e.getAge());
			Car car=new Car();
			car.setModel(e.getCars().getModel());
			car.setName(e.getCars().getName());
			employee.setCars(car);
		
		
		
		return employee;

	};

	}
	
	private void JsonFromObject(EmployeeDto employeeDto) throws JsonProcessingException {
		ObjectMapper objectMapper=new ObjectMapper();
		log.info("{}",objectMapper.writeValueAsString(employeeDto));
		
	}

}
