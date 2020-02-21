package com.claro.gestionrecursosapi.ui.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class VistaUsuarioRepository {
	
	@PersistenceContext
    private EntityManager em;
	
	public List<Object[]> findAll(String nombrevista) {
		Query q = em.createNativeQuery("SELECT * FROM " + nombrevista);
		List<Object[]> resultado = q.getResultList();
		return resultado;
	}
	
}
