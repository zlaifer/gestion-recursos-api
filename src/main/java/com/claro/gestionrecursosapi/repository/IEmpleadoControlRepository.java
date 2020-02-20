package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.entity.EmpleadocontrolEntity;

@Repository
public interface IEmpleadoControlRepository extends CrudRepository<EmpleadocontrolEntity, Integer> {

}
