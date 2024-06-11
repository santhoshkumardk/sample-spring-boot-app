package com.example.sample_spring_boot_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@GetMapping(value = "/index")
	public String get() {
		return "Hellow world!!";
	}
}
