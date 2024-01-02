package com.mgmoura.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/sprint")
public class Sprint {
	
	@PostMapping
	public void post() {
		
	}
	
	@GetMapping
	public void get() {
		
	}

}
