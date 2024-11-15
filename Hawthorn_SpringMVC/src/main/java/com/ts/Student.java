package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// Controller + ResponseBody = RestApi (RestController)

//@Controller

@RestController // use this instead of @Controller and @ResponseBody
public class Student {
// this is Api1

	@GetMapping("/std") // it is use to get data ()inside this request parameter

//@ResponseBody this annotation is used to send the value to postman

	public /* @ResponseBody */String std() {

		return ("Hello how are you"); // here the logic of api write

	}

//Api2
	@GetMapping("/std2")
	public String std2() {
		return ("I am st2");
	}

}
