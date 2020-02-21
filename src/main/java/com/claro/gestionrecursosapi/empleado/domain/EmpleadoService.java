package com.claro.gestionrecursosapi.empleado.domain;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.claro.gestionrecursosapi.domain.ICrudService;
import com.claro.gestionrecursosapi.empleado.entity.EmpleadoEntity;
import com.claro.gestionrecursosapi.empleado.repository.IEmpleadoRepository;

@Service
@Validated
public class EmpleadoService implements ICrudService<EmpleadoEntity, Integer> {
	
	private IEmpleadoRepository repository;

	@Override
	public EmpleadoEntity save(EmpleadoEntity empleado) {
		return repository.save(empleado);
	}

	@Override
	public Iterable<EmpleadoEntity> saveAll(Iterable<EmpleadoEntity> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Iterable<EmpleadoEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void delete(EmpleadoEntity entity) {
		repository.delete(entity);
		
	}

	@Override
	public void deleteAll(Iterable<EmpleadoEntity> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public Optional<EmpleadoEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}
	
	public EmpleadoEntity findByCodPersona(Integer codpersona) {
		return repository.findByCodPersona(codpersona);
	}
	
	public EmpleadoEntity findByUsuarioclaro(String usuarioClaro) {
		return repository.findByusuarioclaro(usuarioClaro);
	}

}
