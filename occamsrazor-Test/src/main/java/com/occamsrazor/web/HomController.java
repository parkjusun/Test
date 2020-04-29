package com.occamsrazor.web;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootConfiguration
@Controller
public class HomController {
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
}
