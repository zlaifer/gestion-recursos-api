package com.claro.gestionrecursosapi.tarea.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claro.gestionrecursosapi.tarea.entity.TareaEntity;

@Repository
public interface ITareaRepository extends CrudRepository<TareaEntity, Integer> {
}
