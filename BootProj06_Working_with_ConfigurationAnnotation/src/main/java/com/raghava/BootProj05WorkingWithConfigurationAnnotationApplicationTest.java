package com.raghava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.raghava.sbeans.Hospital;

@SpringBootApplication
public class BootProj05WorkingWithConfigurationAnnotationApplicationTest {

	public static void main(String[] args) {
		
	ApplicationContext ctx = 	SpringApplication.run(BootProj05WorkingWithConfigurationAnnotationApplicationTest.class, args);
	
Hospital hsptl2=	ctx.getBean("hsptl",Hospital.class);
System.out.println(hsptl2);
((ConfigurableApplicationContext) ctx).close();
	}

}
