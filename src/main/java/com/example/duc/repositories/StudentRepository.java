package com.example.duc.repositories;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.example.duc.entity.Student;

public class StudentRepository {
	EntityManager entityManager;
	
	public StudentRepository() {
		entityManager = Persistence.createEntityManagerFactory("thick").createEntityManager();
	}
	
	public List<Student> findAll() {
        String sql = "from Student" ;
        List<Student> lst = entityManager.createQuery(sql).getResultList();
        return lst;
    }
}
