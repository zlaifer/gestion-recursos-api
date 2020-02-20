package com.claro.gestionrecursosapi.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.proyecto.entity.ProyectoEntity;

@Repository
public interface IProyectoRepository extends CrudRepository<ProyectoEntity, Integer> {

}
