package com.claro.gestionrecursosapi.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.claro.gestionrecursosapi.entity.PerfilEntity;
import com.claro.gestionrecursosapi.repository.IPerfilRepository;

@Service
@Transactional
public class PerfilService implements ICrudService<PerfilEntity, Integer> {

	@Autowired
	private IPerfilRepository repository;

	@Override
	public PerfilEntity save(PerfilEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<PerfilEntity> saveAll(Iterable<PerfilEntity> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<PerfilEntity> findById(Integer id) {
		return repository.findById(id);
	}
	
	public Iterable<PerfilEntity> findByEstadoContains(String estado) {
		return repository.findByEstadoContains(estado);
	}
	
	public Iterable<PerfilEntity> findByNombreContains(String nombre) {
		return repository.findByNombreContains(nombre);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<PerfilEntity> findAll() {
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
	public void delete(PerfilEntity entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<PerfilEntity> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();

	}

}
