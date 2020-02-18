package com.claro.gestionrecursosapi.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.entity.ProveedorEntity;

@Repository
public interface IProveedorRepository extends CrudRepository<ProveedorEntity, Integer> {

	ProveedorEntity findByNit(String Nit);

	ProveedorEntity findByContratoMarco(String contratoMarco);

	Iterable<ProveedorEntity> findByLinea(String linea);

	Iterable<ProveedorEntity> findByEspecialidad(String especialidad);

	Iterable<ProveedorEntity> findByEstado(String estado);

}
