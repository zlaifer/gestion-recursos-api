package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.entity.EmpleadoEntity;

@Repository
public interface IEmpleadoRepository extends CrudRepository<EmpleadoEntity, Integer>{
	
	public EmpleadoEntity findByusuarioclaro (String usuarioclaro);
}
