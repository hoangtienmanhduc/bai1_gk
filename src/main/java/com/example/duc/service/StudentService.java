package com.example.duc.service;

import java.util.List;
import java.util.Optional;

import com.example.duc.entity.Student;
import com.example.duc.repositories.StudentRepository;

public class StudentService {
	private StudentRepository studentRepository;
	
	public StudentService() {
		studentRepository = new StudentRepository();
	}
	
	public List<Student> getAll() {
        return studentRepository.findAll();
    }
	
}
