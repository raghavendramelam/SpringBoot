package com.raghava.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(2)
public class TestRunner2 implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(" this is from testrunner2 class implementing Applicationrunner");
		System.out.println(" command line option arguments "+args.getOptionNames());
		System.out.println(" command line option arguments "+args.getNonOptionArgs());
	}

}
