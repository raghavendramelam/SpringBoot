package com.raghava.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hsptl")
@Data
@ConfigurationProperties(prefix="hsptl")
public class Hospital {
	
	@Value("ramesh")
	private String name;
	private String location;
	private int bill;
	private String custname;
	private String custdisease;
	private String custage;

	
	private String[] favcolors;
	
	private List<String>  jobs;
	
	private Set<Integer> patientsid;
	
	private Map<String,Integer> billingdetails;
	
	private Employee employeedetails;
}
