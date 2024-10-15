package com.raghava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.raghava.sbeans.Hospital;

@SpringBootApplication

public class BootProj05WorkingWithPropertiesFilesApplicationTest {

	public static void main(String[] args) {
	
		
	ApplicationContext  ctx=	SpringApplication.run(BootProj05WorkingWithPropertiesFilesApplicationTest.class, args);
	
Hospital hsp = 	 ctx.getBean( "hsptl",Hospital.class);

System.out.println(hsp);

((ConfigurableApplicationContext) ctx).close();
	}

}
