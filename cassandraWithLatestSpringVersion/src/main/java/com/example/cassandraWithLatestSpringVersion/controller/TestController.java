package com.example.cassandraWithLatestSpringVersion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	

	
	@Autowired
	CassandraTemplate cassandraTemplate ;
	
	@GetMapping("/test")
	public List<GeoLookUpTable> test() {
		
		List<GeoLookUpTable>p=cassandraTemplate.select("select * from geolookuptabl", GeoLookUpTable.class);
		System.out.println("Api triggered");
		return p;
		
		
	}
	
	

}
