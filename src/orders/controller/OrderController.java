package com.demo.openshift.orders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@GetMapping
	public String welcome(){
		
		return "Welcome to the openshift";
		
	}

}
