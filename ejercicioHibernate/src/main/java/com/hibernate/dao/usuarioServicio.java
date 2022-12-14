package com.hibernate.dao;

import java.util.List;

public interface usuarioServicio {
	
public void insertarUsuario(usuario usuario);
	
	
	public List<usuario> buscarTodos();

}
