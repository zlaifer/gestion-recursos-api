package com.claro.gestionrecursosapi.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claro.gestionrecursosapi.usuario.domain.UsuarioService;
import com.claro.gestionrecursosapi.usuario.entity.UsuarioEntity;

@Service
public class SeguridadApplication {
	
	@Autowired
	private UsuarioService usuarioService;
	
	public Integer iniciarSesion(UsuarioEntity entity) {
		UsuarioEntity usuario = usuarioService.findByUsuario(entity.getUsuario());
		
		if (usuario == null)
			return 0;
		
		if (usuario.getClave().equals(entity.getClave()))
			return usuario.getId();
		else
			return 0;
	}
	
	public UsuarioEntity findByUsuario(String usuario) {
		return usuarioService.findByUsuario(usuario);
	}
	
}
