package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the personahabilidad database table.
 * 
 */
@Entity
@Table(name="personahabilidad")
@NamedQuery(name="PersonahabilidadEntity.findAll", query="SELECT p FROM PersonahabilidadEntity p")
public class PersonahabilidadEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private BigDecimal experienciaanios;

	//bi-directional many-to-one association to HabilidadEntity
	@ManyToOne
	@JoinColumn(name="CODHABILIDAD")
	private HabilidadEntity habilidad;

	//bi-directional many-to-one association to PersonaEntity
	@ManyToOne
	@JoinColumn(name="CODPERSONA")
	private PersonaEntity persona;

	public PersonahabilidadEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getExperienciaanios() {
		return this.experienciaanios;
	}

	public void setExperienciaanios(BigDecimal experienciaanios) {
		this.experienciaanios = experienciaanios;
	}

	public HabilidadEntity getHabilidad() {
		return this.habilidad;
	}

	public void setHabilidad(HabilidadEntity habilidad) {
		this.habilidad = habilidad;
	}

	public PersonaEntity getPersona() {
		return this.persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

}