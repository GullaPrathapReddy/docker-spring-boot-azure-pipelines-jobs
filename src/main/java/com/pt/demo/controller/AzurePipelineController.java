package com.pt.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzurePipelineController {

	@RequestMapping("/saysome")
	public String getHome() {
		return "Say Hi Hello";
	}
	
}
