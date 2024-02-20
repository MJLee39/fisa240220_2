package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("getdata")
	public String getData() {
		System.out.println("****get****");
		return "get";
	}
}
