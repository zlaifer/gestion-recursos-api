package com.claro.gestionrecursosapi.empleado.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.empleado.entity.EmpleadocontrolEntity;

@Repository
public interface IEmpleadoControlRepository extends CrudRepository<EmpleadocontrolEntity, Integer> {

}
