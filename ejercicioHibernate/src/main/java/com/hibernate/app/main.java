package com.hibernate.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.hibernate.dao.usuario;
import com.hibernate.impl.consultas;

@Controller
public class main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		consultas consulta = (consultas) context.getBean(consultas.class);
		consulta.insertarUnUsuario(new usuario(11,"Juan", "Bada",21,"juan@gmail.com"));
		System.out.println("Lista usuarios: " + consulta.buscarTodosUsuarios());

	}

}
