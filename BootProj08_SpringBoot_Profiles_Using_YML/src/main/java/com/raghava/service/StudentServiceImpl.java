package com.raghava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghava.dao.StudentDAO;
import com.raghava.model.Student;
@Service("studentservice")
public class StudentServiceImpl implements StudentService {
    
	@Autowired
	private StudentDAO sdao;
	
	public List<Student> list;
	@Override
	public List<Student> fetchDetails(String schname1, String schname2) throws Exception {
		// TODO Auto-generated method stub
		
		 list = sdao.getDetails(schname1, schname2);
		return list;
	}

}
