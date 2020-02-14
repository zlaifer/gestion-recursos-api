package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.entity.ProveedorEntity;

@Repository
public interface IProveedorRepository extends CrudRepository<ProveedorEntity, Integer> {

}
