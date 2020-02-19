package com.claro.gestionrecursosapi.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.claro.gestionrecursosapi.entity.EstructuraorganizacionalEntity;
import com.claro.gestionrecursosapi.repository.IEstructuraOrganizacionalRepository;

@Service
@Validated
public class EstructuraOrganizacionService implements ICrudService<EstructuraorganizacionalEntity, Integer> {

	@Autowired
	private IEstructuraOrganizacionalRepository repository;

	@Override
	public EstructuraorganizacionalEntity save(EstructuraorganizacionalEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<EstructuraorganizacionalEntity> saveAll(Iterable<EstructuraorganizacionalEntity> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<EstructuraorganizacionalEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<EstructuraorganizacionalEntity> findAll() {
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
	public void delete(EstructuraorganizacionalEntity entity) {
		repository.delete(entity);
		
	}

	@Override
	public void deleteAll(Iterable<EstructuraorganizacionalEntity> entities) {
		repository.deleteAll(entities);
		
	}

	@Override
	public void deleteAll() {
		
	}
	
}	
