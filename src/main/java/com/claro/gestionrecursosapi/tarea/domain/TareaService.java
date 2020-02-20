package com.claro.gestionrecursosapi.tarea.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.claro.gestionrecursosapi.domain.ICrudService;
import com.claro.gestionrecursosapi.tarea.entity.TareaEntity;
import com.claro.gestionrecursosapi.tarea.repository.ITareaRepository;

@Service
@Validated
public class TareaService implements ICrudService<TareaEntity, Integer> {

	@Autowired
	private ITareaRepository repository;
	
	@Override
	public TareaEntity save(TareaEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<TareaEntity> saveAll(Iterable<TareaEntity> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<TareaEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<TareaEntity> findAll() {
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
	public void delete(TareaEntity entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<TareaEntity> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
	}	
	
}