package com.claro.gestionrecursosapi.repository;

import java.time.OffsetDateTime;

import org.springframework.data.repository.CrudRepository;

import com.claro.gestionrecursosapi.entity.ProyectosolicitudempleadoEntity;

public interface IProyectoSolicitudEmpleadoRepository extends CrudRepository<ProyectosolicitudempleadoEntity, Integer> {
	
	Iterable<ProyectosolicitudempleadoEntity> findByCodlineaproducto(Integer codLineaProducto);
	
	Iterable<ProyectosolicitudempleadoEntity> findByCodperfil(Integer codPerfil);
	
	Iterable<ProyectosolicitudempleadoEntity> findByCodperfilnivel(Integer codPerfilNivel);
	
	Iterable<ProyectosolicitudempleadoEntity> findByCodperfiltipo(Integer codPerfilTipo);
	
	Iterable<ProyectosolicitudempleadoEntity> findByCodproyecto(Integer codProyecto);
	
}
