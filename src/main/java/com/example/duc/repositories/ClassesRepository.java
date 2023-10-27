package com.example.duc.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.example.duc.entity.Classes;

public class ClassesRepository {
	EntityManager entityManager;
	
	public ClassesRepository() {
		entityManager = Persistence.createEntityManagerFactory("thick").createEntityManager();
	}
	
	public Classes save(Classes cl) {
        EntityTransaction transaction =entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(cl);
            transaction.commit();
        } catch(Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
            return null;
        }
        return cl;
    }
}
