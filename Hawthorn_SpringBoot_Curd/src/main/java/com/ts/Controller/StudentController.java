package com.ts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ts.Model.Student;
import com.ts.Service.StudentServices;

//this is an controller file (Api file here api are Written eg.@getMapping("/parameter"))
@RestController
public class StudentController {
	@Autowired
	StudentServices ss;

	@GetMapping("/std")
	public Student getStudent(@RequestParam("name") String name) {
		return ss.getStudent(name);

	}

}
