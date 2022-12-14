package com.hibernate.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.dao.usuario;
import com.hibernate.dao.usuarioServicioImpl;


@Component
public class consultas {
	
	//La etiqueta autowired nos permite hacer inyección de dependencia de la clase PedidoServicioImpl.
	@Autowired
	private usuarioServicioImpl usi;
	
	//La etiqueta Transactional automatiza la gestión de la transacción.
	@Transactional
	public void insertarUnUsuario(usuario usuario) {
		usi.insertarUsuario(usuario);
	}
	
	@Transactional
	public void insertarListaUsuarios(Collection<usuario> colUsuarios) {
		for (usuario usuario : colUsuarios) {
			usi.insertarUsuario(usuario);
		}
	}
	
	@Transactional
	public List<usuario> buscarTodosUsuarios() {
		return usi.buscarTodos();
	}

}
