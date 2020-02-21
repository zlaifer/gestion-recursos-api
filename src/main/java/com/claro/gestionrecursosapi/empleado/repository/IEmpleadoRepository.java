package com.claro.gestionrecursosapi.empleado.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.empleado.entity.EmpleadoEntity;

@Repository
public interface IEmpleadoRepository extends CrudRepository<EmpleadoEntity, Integer>{
	
	public EmpleadoEntity findByusuarioclaro (String usuarioclaro);

	@Query(value = "SELECT E.* EMPLEADO E WHERE E.CODPERSONA = :codpersona", nativeQuery = true)
	public EmpleadoEntity findByCodPersona(@Param("codpersona") Integer codpersona);
	
}
