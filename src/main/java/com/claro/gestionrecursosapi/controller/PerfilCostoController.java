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

import com.claro.gestionrecursosapi.model.RespuestaBase;
import com.claro.gestionrecursosapi.model.RespuestaCustomizada;
import com.claro.gestionrecursosapi.perfil.domain.PerfilCostoService;
import com.claro.gestionrecursosapi.perfil.entity.PerfilcostoEntity;

@RestController
@RequestMapping("/api/v1/perfilcosto")
public class PerfilCostoController {

	@Autowired
	private PerfilCostoService service;

	@GetMapping
	public ResponseEntity<RespuestaBase> buscarTodo() {
		try {
			Iterable<PerfilcostoEntity> listaPerfilesCosto = service.findAll();
			RespuestaCustomizada<Iterable<PerfilcostoEntity>> respuesta = new RespuestaCustomizada<>();

			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listaPerfilesCosto);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<RespuestaBase> buscarPorId(@PathVariable Integer id) {
		try {
			Optional<PerfilcostoEntity> perfilCostoEntity = service.findById(id);
			RespuestaCustomizada<PerfilcostoEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(perfilCostoEntity.get());
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/estado/{estado}")
	public ResponseEntity<RespuestaBase> buscarContengaEstado(@PathVariable String estado) {
		try {
			Iterable<PerfilcostoEntity> listadoPefilCosto = service.findByEstadoContains(estado);
			RespuestaCustomizada<Iterable<PerfilcostoEntity>> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listadoPefilCosto);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/perfil/{perfil}")
	public ResponseEntity<RespuestaBase> buscarPorPefil(@PathVariable int perfil) {
		try {
			Iterable<PerfilcostoEntity> listadoPefilCosto = service.findByPerfil(perfil);
			RespuestaCustomizada<Iterable<PerfilcostoEntity>> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listadoPefilCosto);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/perfilnivel/{perfilnivel}")
	public ResponseEntity<RespuestaBase> buscarPorPefilNivel(@PathVariable int perfilnivel) {
		try {
			Iterable<PerfilcostoEntity> listadoPefilCosto = service.findByPerfilNivel(perfilnivel);
			RespuestaCustomizada<Iterable<PerfilcostoEntity>> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listadoPefilCosto);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/lineasproducto/{lineasproducto}")
	public ResponseEntity<RespuestaBase> buscarPorLineasProducto(@PathVariable int lineasproducto) {
		try {
			Iterable<PerfilcostoEntity> listadoPefilCosto = service.findByLineasProducto(lineasproducto);
			RespuestaCustomizada<Iterable<PerfilcostoEntity>> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listadoPefilCosto);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/perfiltipo/{perfiltipo}")
	public ResponseEntity<RespuestaBase> buscarPorPerfilTipo(@PathVariable int perfiltipo) {
		try {
			Iterable<PerfilcostoEntity> listadoPefilCosto = service.findByPerfilTipo(perfiltipo);
			RespuestaCustomizada<Iterable<PerfilcostoEntity>> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Consulta exitosa");
			respuesta.setData(listadoPefilCosto);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.OK);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.NOT_FOUND.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public ResponseEntity<RespuestaBase> crear(@RequestBody PerfilcostoEntity entity) {
		try {
			PerfilcostoEntity perfilCostoEntity = service.save(entity);
			RespuestaCustomizada<PerfilcostoEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.CREATED.value());
			respuesta.setMensaje("Perfil creado");
			respuesta.setData(perfilCostoEntity);
			return new ResponseEntity<RespuestaBase>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			RespuestaBase respuestaBase = new RespuestaBase(HttpStatus.CONFLICT.value(), e.getMessage());
			return new ResponseEntity<RespuestaBase>(respuestaBase, HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<RespuestaBase> actualizar(@RequestBody PerfilcostoEntity entity) {
		try {
			PerfilcostoEntity perfilCostoEntity = service.save(entity);
			RespuestaCustomizada<PerfilcostoEntity> respuesta = new RespuestaCustomizada<>();
			respuesta.setCodigoEstatus(HttpStatus.OK.value());
			respuesta.setMensaje("Perfil actualizado");
			respuesta.setData(perfilCostoEntity);
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
