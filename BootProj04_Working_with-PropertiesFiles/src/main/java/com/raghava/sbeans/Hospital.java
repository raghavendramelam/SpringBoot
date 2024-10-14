package com.raghava.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hsptl")
@Data
@PropertySource("classpath:input.properties")
public class Hospital {
	
	@Value("${hsptl.name}")
	public String Hname;
	@Value("${bpcheck.price}")
	public int bpcheckprice;
	@Value("${sugarcheck.price}")
	public int sugarcheckprice;
	@Value("${bodycheckup.price}")
	public int bodycheckupprice;
	@Value("${os.name}")
	public String OSname;
	
	// working with SPEL (Spring expression Language)
	
	@Value("#{${bpcheck.price} + ${sugarcheck.price} + ${bodycheckup.price}}")
	public int totalprice;
	
	

}
