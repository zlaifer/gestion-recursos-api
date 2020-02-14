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
 * The persistent class for the personaproceso database table.
 * 
 */
@Entity
@Table(name="personaproceso")
@NamedQuery(name="PersonaprocesoEntity.findAll", query="SELECT p FROM PersonaprocesoEntity p")
public class PersonaprocesoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String observacion;

	//bi-directional many-to-one association to PersonaEntity
	@ManyToOne
	@JoinColumn(name="CODPERSONA")
	private PersonaEntity persona;

	//bi-directional many-to-one association to ProcesoestadoEntity
	@ManyToOne
	@JoinColumn(name="CODPROCESOESTADO")
	private ProcesoestadoEntity procesoestado;

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

	public PersonaEntity getPersona() {
		return this.persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

	public ProcesoestadoEntity getProcesoestado() {
		return this.procesoestado;
	}

	public void setProcesoestado(ProcesoestadoEntity procesoestado) {
		this.procesoestado = procesoestado;
	}

}