package com.claro.gestionrecursosapi.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.claro.gestionrecursosapi.ui.service.VistaUsuarioService;

@RestController
@RequestMapping("/api/v1/ui")
public class VistaUsuarioController {
	
	@Autowired
	private VistaUsuarioService service;
	
	@GetMapping
	public List<Object[]> findAll(@RequestParam String v) {
		return service.findAll(v);
	}
	
}
