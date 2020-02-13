package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.entity.PersonaEntity;

@Repository
public interface IPersonaRepository extends CrudRepository<PersonaEntity, Integer> {
		
}
