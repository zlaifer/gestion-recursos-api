package com.claro.gestionrecursosapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claro.gestionrecursosapi.domain.PersonaService;
import com.claro.gestionrecursosapi.entity.PersonaEntity;

@RestController
@RequestMapping("/api/v1/persona")
public class PersonaController {

	@Autowired
	private PersonaService service;
	
	@GetMapping
	public ResponseEntity<Iterable<PersonaEntity>> GET() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public Optional<PersonaEntity> GET(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PostMapping
	public PersonaEntity POST(@RequestBody PersonaEntity entity) {
		return service.save(entity);
	}
	
	@PutMapping
	public PersonaEntity PUT(@RequestBody PersonaEntity entity) {
		return service.save(entity);
	}
	
	@DeleteMapping
	public ResponseEntity<String> DELETE(@RequestBody PersonaEntity entity) {
		
		if (!service.findById(entity.getId()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
		
		service.delete(entity);
		return ResponseEntity.ok("Registro eliminado correctamente");
	}
	
}
