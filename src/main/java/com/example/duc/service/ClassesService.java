package com.example.duc.service;

import com.example.duc.entity.Classes;
import com.example.duc.repositories.ClassesRepository;

public class ClassesService {
	private ClassesRepository classesRepository;
	
	public ClassesService() {
		classesRepository = new ClassesRepository();
	}
	
	public Classes save(Classes cl) {
		return classesRepository.save(cl);
	}
}
