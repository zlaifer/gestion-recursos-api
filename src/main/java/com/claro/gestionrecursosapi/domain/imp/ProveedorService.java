package com.claro.gestionrecursosapi.domain.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.claro.gestionrecursosapi.domain.ICrudService;
import com.claro.gestionrecursosapi.entity.ProveedorEntity;
import com.claro.gestionrecursosapi.repository.IProveedorRepository;

@Service
@Validated
public class ProveedorService implements ICrudService<ProveedorEntity, Integer> {

	@Autowired
	private IProveedorRepository repository;

	@Override
	public ProveedorEntity save(ProveedorEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<ProveedorEntity> saveAll(Iterable<ProveedorEntity> entities) {
		return repository.findAll();
	}

	@Override
	public Optional<ProveedorEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<ProveedorEntity> findAll() {
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
	public void delete(ProveedorEntity entity) {
		repository.delete(entity);;

	}

	@Override
	public void deleteAll(Iterable<ProveedorEntity> entities) {
		repository.deleteAll();

	}

	@Override
	public void deleteAll() {

	}

}
