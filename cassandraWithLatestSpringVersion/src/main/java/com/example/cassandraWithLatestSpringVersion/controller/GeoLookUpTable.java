package com.example.cassandraWithLatestSpringVersion.controller;

import java.math.BigDecimal;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "geolookuptabl")
public class GeoLookUpTable {

	
	private static final long serialVersionUID = 1L;
	public GeoLookUpTable(String tozipcode, double miles, String fromzipcode, String facility, String facilitytype) {
		super();
		this.tozipcode = tozipcode;
		this.miles = miles;
		this.fromzipcode = fromzipcode;
		this.facility = facility;
		this.facilitytype = facilitytype;
	}
	
	public GeoLookUpTable() {
		
	}
	@PrimaryKeyColumn(ordinal = 0,type = PrimaryKeyType.PARTITIONED)
	private String tozipcode;
	public String getTozipcode() {
		return tozipcode;
	}
	public void setTozipcode(String tozipcode) {
		this.tozipcode = tozipcode;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	public String getFromzipcode() {
		return fromzipcode;
	}
	public void setFromzipcode(String fromzipcode) {
		this.fromzipcode = fromzipcode;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public String getFacilitytype() {
		return facilitytype;
	}
	public void setFacilitytype(String facilitytype) {
		this.facilitytype = facilitytype;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@PrimaryKeyColumn(ordinal = 1,type = PrimaryKeyType.CLUSTERED)
	private double miles;
	@PrimaryKeyColumn(ordinal = 4,type = PrimaryKeyType.CLUSTERED)
	private String fromzipcode;
	@PrimaryKeyColumn(ordinal = 5,type = PrimaryKeyType.CLUSTERED)
	private String facility;
	@PrimaryKeyColumn(ordinal = 3,type = PrimaryKeyType.CLUSTERED)
	private String facilitytype;
}
