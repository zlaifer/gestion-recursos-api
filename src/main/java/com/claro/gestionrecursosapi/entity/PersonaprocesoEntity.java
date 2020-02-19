package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the personaproceso database table.
 * 
 */
@Entity
@Table(name="personaproceso")
public class PersonaprocesoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechacreacion;

	@UpdateTimestamp
	private Timestamp fechamodificacion;

	private String observacion;

	@Min(value = 1, message = "Campo requerido")
	private PersonaEntity codpersona;

	@Min(value = 1, message = "Campo requerido")
	private ProcesoestadoEntity codprocesoestado;

	public PersonaprocesoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public PersonaEntity getCodpersona() {
		return codpersona;
	}

	public void setCodpersona(PersonaEntity codpersona) {
		this.codpersona = codpersona;
	}

	public ProcesoestadoEntity getCodprocesoestado() {
		return codprocesoestado;
	}

	public void setCodprocesoestado(ProcesoestadoEntity codprocesoestado) {
		this.codprocesoestado = codprocesoestado;
	}
}