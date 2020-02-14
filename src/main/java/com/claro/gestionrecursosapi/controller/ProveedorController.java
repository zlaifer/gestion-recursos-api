package com.claro.gestionrecursosapi.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claro.gestionrecursosapi.domain.ProveedorService;
import com.claro.gestionrecursosapi.entity.ProveedorEntity;
import com.claro.gestionrecursosapi.model.RespuestaBase;
import com.claro.gestionrecursosapi.model.RespuestaProveedor;

@RestController
@RequestMapping("/api/v1/proveedor")
public class ProveedorController {
	

	@Autowired
	private ProveedorService service;
	
	@GetMapping
	public ResponseEntity<RespuestaBase> GET() {
		
		Iterable<ProveedorEntity> resultQuery = service.findAll();
		if(((Collection<?>)resultQuery).size()>0) {
			RespuestaProveedor respuestaProveedor = new RespuestaProveedor();
			respuestaProveedor.setCodigoEstatus(100);
			respuestaProveedor.setMensaje("Exitoso");
			respuestaProveedor.setData(resultQuery);
			return ResponseEntity.ok(respuestaProveedor);
		}else {
			RespuestaProveedor proveedoresResponse = new RespuestaProveedor();
			proveedoresResponse.setCodigoEstatus(102);
			proveedoresResponse.setMensaje("No existen datos");
			return ResponseEntity.status(HttpStatus.CONFLICT).body(proveedoresResponse);
		}
	}	
		
	
	@GetMapping("/{id}")
	public Optional<ProveedorEntity> GET(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PostMapping
	public ProveedorEntity POST(@RequestBody ProveedorEntity entity) {
		return service.save(entity);
	}
	
	@PutMapping
	public ProveedorEntity PUT(@RequestBody ProveedorEntity entity) {
		return service.save(entity);
	}
	
	@DeleteMapping
	public ResponseEntity<RespuestaBase> DELETE(@RequestBody ProveedorEntity entity) {
		RespuestaProveedor respuestaProveedor = new RespuestaProveedor();
		
		service.delete(entity);
		/*
		if (!service.findById(entity.getId()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        */
		
		respuestaProveedor.setCodigoEstatus(200);
		respuestaProveedor.setMensaje("Se elimino registro");		
		return ResponseEntity.ok(respuestaProveedor);
	}
}
