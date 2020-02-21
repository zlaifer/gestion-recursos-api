package com.claro.gestionrecursosapi.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claro.gestionrecursosapi.ui.repository.VistaUsuarioRepository;

@Service
public class VistaUsuarioService {
	
	@Autowired
	private VistaUsuarioRepository repository;
	
	public List<Object[]> findAll(String nombrevista) {
		return repository.findAll(nombrevista);
	}
	
}
