package com.claro.gestionrecursosapi.usuario.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.usuario.entity.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Integer> {

	@Query("select u from UsuarioEntity u where u.usuario = :usuario")
	public UsuarioEntity findByUsuario(@Param("usuario") String usuario);
	
}
