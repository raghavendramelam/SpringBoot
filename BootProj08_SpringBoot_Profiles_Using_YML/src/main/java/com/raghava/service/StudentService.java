package com.raghava.service;

import java.util.List;

import com.raghava.model.Student;

public interface StudentService {
	
	public abstract List<Student>  fetchDetails(String schname1,String schname2) throws Exception;

}
