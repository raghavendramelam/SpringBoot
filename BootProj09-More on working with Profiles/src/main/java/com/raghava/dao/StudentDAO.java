package com.raghava.dao;

import java.util.List;

import com.raghava.model.Student;

public interface StudentDAO {
	
	public abstract List<Student> getDetails(String schname1,String schname2 ) throws Exception;

}
