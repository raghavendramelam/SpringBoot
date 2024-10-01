package com.raghava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.raghava.model.Student;
import com.raghava.service.StudentService;

@Controller("scontroller")
public class StudentController {
	@Autowired
	private StudentService ss;

	
public	List<Student> ls;

    public List<Student> getDetails(String schname1,String schname2) throws Exception{
    	
    	ls= ss.fetchDetails(schname1, schname2);
    	return ls;
    }
}
