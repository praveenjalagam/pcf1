package com.nttdata.hrservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String getMsg() {
		
		return "First PCF and Jemkin Integrating Project";
	}

}
