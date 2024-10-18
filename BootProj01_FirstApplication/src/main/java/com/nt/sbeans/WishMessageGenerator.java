package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator {
	@SuppressWarnings("unused")
	@Autowired
	private LocalDateTime ldt;
	
	public WishMessageGenerator() {
	System.out.println(" Wish message generator constructor");
	}

	public String Greeting(String user) {
		return " Hello Mr."+user+"the time is "+LocalDateTime.now();
	}

}
