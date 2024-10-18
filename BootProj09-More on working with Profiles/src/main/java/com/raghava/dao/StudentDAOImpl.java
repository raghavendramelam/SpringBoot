package com.raghava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.raghava.model.Student;
@Repository("sturepo")
@Profile({"dev","uat","default","prod"})
public class StudentDAOImpl implements StudentDAO {
	private static final String GET_CORONASTUDENT_DETAILS="SELECT STUDENT_ID ,STUDENT_NAME,FATHER_NAME,CORONA_RESULT FROM STUDENTS"
			+ " WHERE SCHOOL_NAME IN(?,?) ORDER BY STUDENT_NAME";
	@Autowired
	public DataSource ds;
	
public StudentDAOImpl(DataSource ds) {
	System.out.println(" DS class name"+ds.getClass());
}

	@Override
	public List<Student> getDetails(String schname1, String schname2) throws SQLException {
	    List<Student> list = new ArrayList<>(); // Initialize list here

	    try (Connection conn = ds.getConnection();
	         PreparedStatement ps = conn.prepareStatement(GET_CORONASTUDENT_DETAILS)) {

	        ps.setString(1, schname1);
	        ps.setString(2, schname2);
	        
	        try (ResultSet rs = ps.executeQuery()) {
	            while (rs.next()) {
	                Student st = new Student();
	                st.setSid(rs.getInt(1)); // Assuming the first column is STUDENT_ID
	                st.setSname(rs.getString(2)); // Second column
	                st.setFaname(rs.getString(3)); // Third column
	             //   st.setStandard(rs.getString(3)); // Fourth column
	                st.setCoronaresult(rs.getString(4)); // Fifth column

	                list.add(st);
	            }
	        }
	    }
	    return list; // Return the populated list
	}



	
	
	}


