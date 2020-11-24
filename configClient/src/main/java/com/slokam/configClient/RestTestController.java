package com.slokam.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

	 @Value("${mykey}")
	 private String value;
	
	 @GetMapping("test")
	 public String test() {
		 return "Data is "+value;
	 }
}
