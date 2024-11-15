package com.ts.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.Model.User;

//controller file
@RestController
public class UserController {
	@GetMapping("/usr")
	public User usr() {

		return new User(1, "Ram", "Jalgaon");
	}

	// adding list of users
	@GetMapping("/usrs")
	public List<User> usrs() {
		User u1 = new User(2, "Sham", "Pune");
		User u2 = new User(3, "Gagan", "Pune");
		User u3 = new User(4, "Chagan", "Nashik");
		List<User> users = Arrays.asList(u1, u2, u3);
		return users;
	}

//query parameters

	// 1.@PathVariale

	@GetMapping("/hello/{nm}")
	public String hello(@PathVariable("nm") String name) {
		return "Hello" + name;
		// TODO Auto-generated method stub

	}
	// localhost:8080/Hawthorn_SpringMVC2/hello/Ramu

//----------------------------------------------------------------------------------------------------

	// 2.@RequestBody

	@GetMapping("/hello2")
	public String oo(@RequestParam("fnm") String fname) {
		return "Hello" + fname;
		// TODO Auto-generated method stub

	}
	// localhost:8080/Hawthorn_SpringMVC2/hello2?fnm=Shankar

//------------------------------------------------------------------------------------------------------

	// 3.@RequestBody

	@GetMapping("/user")
	public String user(@RequestBody User user) {
		return "you have added " + user.getName();
		// TODO Auto-generated method stub

	}

}