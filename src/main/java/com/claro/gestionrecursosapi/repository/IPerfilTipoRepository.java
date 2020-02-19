package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.claro.gestionrecursosapi.entity.PerfiltipoEntity;

public interface IPerfilTipoRepository extends CrudRepository<PerfiltipoEntity, Integer> {

	Iterable<PerfiltipoEntity> findByNombreContains(String nombre);
}
