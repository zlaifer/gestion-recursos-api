package com.claro.gestionrecursosapi.empleado.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claro.gestionrecursosapi.domain.ICrudService;
import com.claro.gestionrecursosapi.empleado.entity.EmpleadocontrolEntity;
import com.claro.gestionrecursosapi.empleado.repository.IEmpleadoControlRepository;

@Service
public class EmpleadoControlService implements ICrudService<EmpleadocontrolEntity, Integer> {

	@Autowired
	private IEmpleadoControlRepository repository;
	
	@Override
	public EmpleadocontrolEntity save(EmpleadocontrolEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<EmpleadocontrolEntity> saveAll(Iterable<EmpleadocontrolEntity> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<EmpleadocontrolEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<EmpleadocontrolEntity> findAll() {
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
	public void delete(EmpleadocontrolEntity entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<EmpleadocontrolEntity> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
	}
}
