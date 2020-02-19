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

import com.claro.gestionrecursosapi.domain.PerfilService;
import com.claro.gestionrecursosapi.entity.PerfilEntity;
import com.claro.gestionrecursosapi.model.RespuestaBase;
import com.claro.gestionrecursosapi.model.RespuestaCustomizada;

@RestController
@RequestMapping("/api/v1/perfil")
public class PerfilController {
	@Autowired
	private PerfilService service;

	@GetMapping
	public ResponseEntity<RespuestaBase> buscarTodo() {
		try {
			Iterable<PerfilEntity> listaPerfiles = service.findAll();
			RespuestaCustomizada<Iterable<PerfilEntity>> respuesta = new RespuestaCustomizada<>();

			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listaPerfiles);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<RespuestaBase> buscarPorId(@PathVariable Integer id) {
		try {
			Optional<PerfilEntity> perfilEntity = service.findById(id);
			RespuestaCustomizada<PerfilEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(perfilEntity.get());
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/estado/{estado}")
	public ResponseEntity<RespuestaBase> buscarContengaEstado(@PathVariable String estado) {
		try {
			Iterable<PerfilEntity> listadoPefil = service.findByEstadoContains(estado);
			RespuestaCustomizada<Iterable<PerfilEntity>> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listadoPefil);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/nombre/{nombre}")
	public ResponseEntity<RespuestaBase> buscarContengaNombre(@PathVariable String nombre) {
		try {
			Iterable<PerfilEntity> listadoPefil = service.findByNombreContains(nombre);
			RespuestaCustomizada<Iterable<PerfilEntity>> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listadoPefil);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<RespuestaBase> crear(@RequestBody PerfilEntity entity) {
		try {
			PerfilEntity perfilEntity = service.save(entity);
			RespuestaCustomizada<PerfilEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.CREATED.value());
			respuesta.setMensaje("Perfil creado");
			respuesta.setData(perfilEntity);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.CONFLICT.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.CONFLICT);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<RespuestaBase> actualizar(@PathVariable Integer id, @RequestBody PerfilEntity entity) {
		try {
			PerfilEntity perfilEntity = service.save(entity);
			RespuestaCustomizada<PerfilEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Perfil actualizado");
			respuesta.setData(perfilEntity);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.CONFLICT.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.CONFLICT);
		}
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
