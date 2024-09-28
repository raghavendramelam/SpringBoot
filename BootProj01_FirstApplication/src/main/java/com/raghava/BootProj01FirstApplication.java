package com.raghava;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.raghava.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01FirstApplication {
	

	
    public BootProj01FirstApplication() {
	System.out.println(" Boot proj constructor");
	}

	@Bean("ldt")
    LocalDateTime gettime() {
		
		System.out.println(" localdatetime bean pre instantiantion happening");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		
ApplicationContext ctx =		SpringApplication.run(BootProj01FirstApplication.class, args);

String[] beanNames = ctx.getBeanDefinitionNames();
for (String beanName : beanNames) {
    System.out.println(beanName);
}

    WishMessageGenerator wmg1 =    ctx.getBean("wmg",WishMessageGenerator.class);
    
    System.out.println(wmg1.Greeting("raghava"));
	}

}
