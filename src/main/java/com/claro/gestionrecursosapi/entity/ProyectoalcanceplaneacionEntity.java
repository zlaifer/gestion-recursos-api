package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the proyectoalcanceplaneacion database table.
 * 
 */
@Entity
@Table(name="proyectoalcanceplaneacion")
@NamedQuery(name="ProyectoalcanceplaneacionEntity.findAll", query="SELECT p FROM ProyectoalcanceplaneacionEntity p")
public class ProyectoalcanceplaneacionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private int orden;

	private String tipo;

	//bi-directional many-to-one association to ProyectoEntity
	@ManyToOne
	@JoinColumn(name="CODPROYECTO")
	private ProyectoEntity proyecto;

	public ProyectoalcanceplaneacionEntity() {
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

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ProyectoEntity getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(ProyectoEntity proyecto) {
		this.proyecto = proyecto;
	}

}