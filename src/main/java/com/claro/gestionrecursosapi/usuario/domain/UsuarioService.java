package com.claro.gestionrecursosapi.usuario.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.claro.gestionrecursosapi.domain.ICrudService;
import com.claro.gestionrecursosapi.usuario.entity.UsuarioEntity;
import com.claro.gestionrecursosapi.usuario.repository.IUsuarioRepository;

@Service
@Validated
public class UsuarioService implements ICrudService<UsuarioEntity, Integer> {

	@Autowired
	private IUsuarioRepository repository;
	
	@Override
	public UsuarioEntity save(UsuarioEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<UsuarioEntity> saveAll(Iterable<UsuarioEntity> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<UsuarioEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<UsuarioEntity> findAll() {
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
	public void delete(UsuarioEntity entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<UsuarioEntity> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
	}
	
	public UsuarioEntity findByUsuario(String usuario) {
		return repository.findByUsuario(usuario);
	}
	
}
