package com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

/*Con la etiqueta component decimos que esta clase se puede añadir al contenedor IoC 
para hacer inyección de dependencias.*/

@Component
public class usuarioServicioImpl implements usuarioServicio {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertarUsuario(usuario usuario) {
		em.persist(usuario);

	}

	@Override
	public List<usuario> buscarTodos() {

		return em.createQuery("SELECT usuario FROM usuario").getResultList();
		
	}

}
