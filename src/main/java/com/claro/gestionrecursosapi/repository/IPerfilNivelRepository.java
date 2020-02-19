package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.claro.gestionrecursosapi.entity.PerfilnivelEntity;

public interface IPerfilNivelRepository extends CrudRepository<PerfilnivelEntity, Integer>{

	Iterable<PerfilnivelEntity> findByNombreContains(String nombre);
}
