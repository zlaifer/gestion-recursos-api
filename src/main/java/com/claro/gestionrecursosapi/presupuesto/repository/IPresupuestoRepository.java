package com.claro.gestionrecursosapi.presupuesto.repository;

import org.springframework.data.repository.CrudRepository;

import com.claro.gestionrecursosapi.presupuesto.entity.PresupuestoEntity;

public interface IPresupuestoRepository extends CrudRepository<PresupuestoEntity, Integer> {

}
