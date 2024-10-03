package com.raghava;

import java.sql.SQLException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.raghava.controller.StudentController;
import com.raghava.model.Student;

@SpringBootApplication
public class BootProj03RealTimeDiApplicationTest {

	public static void main(String[] args) {
		
		
	ApplicationContext cxt = 	SpringApplication.run(BootProj03RealTimeDiApplicationTest.class, args);
	
	   StudentController scxt=   cxt.getBean("scontroller",StudentController.class);
	        
		
		
			
			try { List<Student> ls = scxt.getDetails("ABC High School", "XYZ International") ;
			    ls.stream()
			      .filter(student -> student.getSname().toUpperCase().charAt(0) >= 'A' && student.getSname().toUpperCase().charAt(0) <= 'K')
			      .forEach(student -> {
			          System.out.println("----- Student Details -----");
			          System.out.println("Student ID: " + student.getSid());
			          System.out.println("Student Name: " + student.getSname());
			          System.out.println("Father's Name: " + student.getFaname());
			          System.out.println("Standard: " + student.getStandard());
			          System.out.println("Corona Result: " + student.getCoronaresult());
			          System.out.println("---------------------------");
			      });
			} catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}


