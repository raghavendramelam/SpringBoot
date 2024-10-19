package com.raghava.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(" this is from testrunner implementing commandlinerunner");
		
		System.out.println(" get the command liine arguments "+Arrays.toString(args));
	}

}
