package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the proyectotipo database table.
 * 
 */
@Entity
@Table(name="proyectotipo")
@NamedQuery(name="ProyectotipoEntity.findAll", query="SELECT p FROM ProyectotipoEntity p")
public class ProyectotipoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to ProyectoEntity
	@OneToMany(mappedBy="proyectotipo")
	private List<ProyectoEntity> proyectos;

	public ProyectotipoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Timestamp getFechacreacion() {
		return this.fechacreacion;
	}

	public void setFechacreacion(Timestamp fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Timestamp getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Timestamp fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ProyectoEntity> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(List<ProyectoEntity> proyectos) {
		this.proyectos = proyectos;
	}

	public ProyectoEntity addProyecto(ProyectoEntity proyecto) {
		getProyectos().add(proyecto);
		proyecto.setProyectotipo(this);

		return proyecto;
	}

	public ProyectoEntity removeProyecto(ProyectoEntity proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setProyectotipo(null);

		return proyecto;
	}

}