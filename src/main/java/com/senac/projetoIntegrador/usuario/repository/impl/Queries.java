package com.senac.projetoIntegrador.usuario.repository.impl;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Queries {
	private String getUsuarioById = """
				SELECT * FROM usuario WHERE Id = ?;
			""";

	public String getGetUsuarioById() {
		return getUsuarioById;
	}

	public void setGetUsuarioById(String getUsuarioById) {
		this.getUsuarioById = getUsuarioById;
	}
}
