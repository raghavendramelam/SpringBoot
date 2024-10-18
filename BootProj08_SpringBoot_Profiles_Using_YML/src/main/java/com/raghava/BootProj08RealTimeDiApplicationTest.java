package com.raghava;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.raghava.controller.StudentController;
import com.raghava.model.Student;

@SpringBootApplication
@Profile({"dev","uat"})
public class BootProj08RealTimeDiApplicationTest {

	public static void main(String[] args) {
		
		
		
	ApplicationContext cxt = 	SpringApplication.run(BootProj08RealTimeDiApplicationTest.class, args);
	
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
	
	@Bean("c3p0")
    @Profile("prod")  // Only create this bean in the "dev" profile
    public ComboPooledDataSource createc3p0() throws Exception {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver"); // MySQL driver
        cpds.setJdbcUrl("jdbc:mysql:///Spring");
        cpds.setUser("root");
        cpds.setPassword("raghava@17");
        cpds.setMinPoolSize(5);
        cpds.setMaxPoolSize(20);
        cpds.setMaxIdleTime(300);
        return cpds;
    }
		
	}


