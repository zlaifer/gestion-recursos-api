package com.claro.gestionrecursosapi.persona.domain;

import com.claro.gestionrecursosapi.excepcion.DataIncorrectaExcepcion;
import com.claro.gestionrecursosapi.excepcion.NoExisteExcepcion;
import com.claro.gestionrecursosapi.excepcion.YaExisteExcepcion;
import com.claro.gestionrecursosapi.persona.entity.PersonaEntity;

public interface IPersonaService {

	PersonaEntity crear(PersonaEntity entity) throws YaExisteExcepcion, DataIncorrectaExcepcion;
	
	PersonaEntity actualizar(int id, PersonaEntity personaEntity)
			throws DataIncorrectaExcepcion, NoExisteExcepcion;
	
	public PersonaEntity buscarPorId(int id) throws NoExisteExcepcion;
	
	public PersonaEntity buscarPorCorreo(String correo) throws NoExisteExcepcion;
	
	public Iterable<PersonaEntity> buscarTodos() throws NoExisteExcepcion;
	
	public boolean eliminar(int id) throws NoExisteExcepcion;
	
	
	
}

