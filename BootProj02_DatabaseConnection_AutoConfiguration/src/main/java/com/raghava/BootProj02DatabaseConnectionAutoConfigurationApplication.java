package com.raghava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.raghava.sbeans.DBConnection;

@SpringBootApplication
public class BootProj02DatabaseConnectionAutoConfigurationApplication {

	public static void main(String[] args) throws Exception {
		
	ApplicationContext ctx= 	SpringApplication.run(BootProj02DatabaseConnectionAutoConfigurationApplication.class, args);
	
DBConnection dbc=	ctx.getBean("dbc",DBConnection.class);


System.out.println(dbc.getCount());
	}

}
