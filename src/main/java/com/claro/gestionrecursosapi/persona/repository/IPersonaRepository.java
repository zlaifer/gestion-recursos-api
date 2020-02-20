package com.claro.gestionrecursosapi.persona.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.persona.entity.PersonaEntity;

@Repository
public interface IPersonaRepository extends CrudRepository<PersonaEntity, Integer> {
		
	PersonaEntity findByCorreo(String correo);
	
	Optional<PersonaEntity> findByCodtipodocumentoAndNumerodocumento(int codTipoDocumento, long numeroDocumento);
	
	Optional<PersonaEntity> findByIdAndCodtipodocumento(int id, int codTipoDocumento);
}
