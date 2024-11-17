package com.ts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.Model.Student;

// Repository file (Database Connectivity file) this file helps to connect with database
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
