package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.entity.ProyectoEntity;

@Repository
public interface IProyectoRepository extends CrudRepository<ProyectoEntity, Integer> {

}
