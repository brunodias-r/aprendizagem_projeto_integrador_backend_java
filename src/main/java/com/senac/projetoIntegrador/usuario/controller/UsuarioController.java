package com.senac.projetoIntegrador.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.projetoIntegrador.usuario.dto.UsuarioDto;
import com.senac.projetoIntegrador.usuario.service.IUsuarioService;

@RestController
@RequestMapping(value = "/usuario", produces = "application/json")
public class UsuarioController {
	@Autowired
	IUsuarioService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioDto> retrieveUsuario(@PathVariable String id){
		UsuarioDto usuario = service.getUsuario(id);
		return new ResponseEntity<UsuarioDto>(usuario, HttpStatus.OK);
	}
}
