package com.claro.gestionrecursosapi.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.claro.gestionrecursosapi.entity.PerfilcostoEntity;
import com.claro.gestionrecursosapi.repository.IPerfilCostoRepository;

@Service
@Transactional
public class PerfilCostoService implements ICrudService<PerfilcostoEntity, Integer> {

	@Autowired
	private IPerfilCostoRepository repository;

	@Override
	public PerfilcostoEntity save(PerfilcostoEntity entity) {
		return repository.save(entity);
	}

	@Override
	public Iterable<PerfilcostoEntity> saveAll(Iterable<PerfilcostoEntity> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<PerfilcostoEntity> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	public Iterable<PerfilcostoEntity> findByEstadoContains(String estado) {
		return repository.findByEstado(estado);
	}

	public Iterable<PerfilcostoEntity> findByLineasProducto(Integer lineasProducto) {
		return repository.findByCodlineaproducto(lineasProducto);
	}

	public Iterable<PerfilcostoEntity> findByPerfil(Integer perfil) {
		return repository.findByCodperfil(perfil);
	}

	public Iterable<PerfilcostoEntity> findByPerfilTipo(Integer perfilTipo) {
		return repository.findByCodperfiltipo(perfilTipo);
	}
	
	public Iterable<PerfilcostoEntity> findByPerfilNivel(Integer perfilNivel) {
		return repository.findByCodperfilnivel(perfilNivel);
	}

	@Override
	public Iterable<PerfilcostoEntity> findAll() {
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
	public void delete(PerfilcostoEntity entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<PerfilcostoEntity> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

}
