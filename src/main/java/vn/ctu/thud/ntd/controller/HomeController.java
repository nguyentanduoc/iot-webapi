package vn.ctu.thud.ntd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String sayHello() {
		return "HomeController";
	}
	
}
