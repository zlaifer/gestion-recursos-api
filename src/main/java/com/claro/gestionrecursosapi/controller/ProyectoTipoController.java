package com.claro.gestionrecursosapi.controller;

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

import com.claro.gestionrecursosapi.domain.ProyectoTipoService;
import com.claro.gestionrecursosapi.entity.ProyectoTipoEntity;
import com.claro.gestionrecursosapi.model.RespuestaBase;
import com.claro.gestionrecursosapi.model.RespuestaCustomizada;

@RestController
@RequestMapping("/api/v1/proyectotipo")
public class ProyectoTipoController {

	@Autowired
	private ProyectoTipoService service;

	@GetMapping
	public ResponseEntity<RespuestaBase> buscarTodo() {
		try {
			Iterable<ProyectoTipoEntity> listasPersonas = service.findAll();
			RespuestaCustomizada<Iterable<ProyectoTipoEntity>> respuesta = new RespuestaCustomizada<>();

			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listasPersonas);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<RespuestaBase> buscarPorId(@PathVariable Integer id) {
		try {
			Optional<ProyectoTipoEntity> personaEntity = service.findById(id);
			RespuestaCustomizada<ProyectoTipoEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(personaEntity.get());
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public ResponseEntity<RespuestaBase> crear(@RequestBody ProyectoTipoEntity entity) {
		try {
			ProyectoTipoEntity personaEntity = service.save(entity);
			
			RespuestaCustomizada<ProyectoTipoEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.CREATED.value());
			respuesta.setMensaje("ProyectoTipo creado");
			respuesta.setData(personaEntity);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.CONFLICT.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.CONFLICT);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<RespuestaBase> actualizar(@PathVariable Integer id, @RequestBody ProyectoTipoEntity entity) {
		try {
			ProyectoTipoEntity personaEntity = service.save(entity);
			RespuestaCustomizada<ProyectoTipoEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("ProyectoTipo actualizado");
			respuesta.setData(personaEntity);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.CONFLICT.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.CONFLICT);
		}
		/*} catch (NoExisteExcepcion e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}*/
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<RespuestaBase> eliminar(@PathVariable Integer id) {

		try {
			service.delete(service.findById(id).get());
			RespuestaBase respuesta = new RespuestaBase();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Se elimino registro");
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}

	}
}
