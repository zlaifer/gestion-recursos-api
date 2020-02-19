package com.claro.gestionrecursosapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.claro.gestionrecursosapi.entity.PerfilcostoEntity;

public interface IPerfilCostoRepository extends CrudRepository<PerfilcostoEntity, Integer>{
	
	Iterable<PerfilcostoEntity> findByEstado(String estado);
	
	Iterable<PerfilcostoEntity> findByCodlineaproducto(Integer lineasProducto);
	
	Iterable<PerfilcostoEntity> findByCodperfil(Integer perfil);
	
	Iterable<PerfilcostoEntity> findByCodperfiltipo(Integer perfilTipo);
	
	Iterable<PerfilcostoEntity> findByCodperfilnivel(Integer perfilNivel);
}
