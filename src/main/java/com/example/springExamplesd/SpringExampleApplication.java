package com.example.springExamplesd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

	
	
	@RequestMapping(value = "/id", params = "id", method = RequestMethod.GET)
	@ResponseBody
	public String getBarBySimplePathWithExplicitRequestParam(
	  @RequestParam("id") long id) {
	    return "Get a specific Bar with id=" + id;
	}
	
	 @RequestMapping(value = "/personId")              
	  String getId(@RequestParam String personId){
	    System.out.println("ID is "+personId);  
	    return "Get ID from query string of URL without value element";  
	  }

}
