package com.ts.Service;

import java.util.Arrays;
import java.util.List;
import com.ts.Model.Student;
import org.springframework.stereotype.Service;

//Service file (Business logic Write here ) it is  an business logic file
@Service // this Annotation is used to create object at Class level
public class StudentServices {

	public Student getStudent(String name) {

		Student s1 = new Student(1, "Rahul", "Pune");
		Student s2 = new Student(2, "Chagan", "Nagpure");
		Student s3 = new Student(3, "Jagtap", "Jalgaon");

		List<Student> students = Arrays.asList(s1, s2, s3);

		for (Student student : students) {
			if (student.getName().equals(name)) {
				return student;

			}

		}
		return new Student();

	}

}
