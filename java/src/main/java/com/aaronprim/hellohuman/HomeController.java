package com.aaronprim.hellohuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@RequestMapping("/")
    public String hello() {
            return "Hello Human!";
	}
	
	@RequestMapping("/{name}")
	public String helloName(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	@RequestMapping("/{name}/{lastName}")
	public String helloLastName(@PathVariable("name") String name, @PathVariable("lastName") String last) {
		return "Hello " + name + " " + last;
	}
}
	

