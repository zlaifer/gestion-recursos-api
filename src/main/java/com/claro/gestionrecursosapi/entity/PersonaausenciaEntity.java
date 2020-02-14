package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the personaausencia database table.
 * 
 */
@Entity
@Table(name="personaausencia")
@NamedQuery(name="PersonaausenciaEntity.findAll", query="SELECT p FROM PersonaausenciaEntity p")
public class PersonaausenciaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	private Timestamp fechamodificacion;

	//bi-directional many-to-one association to PersonaEntity
	@ManyToOne
	@JoinColumn(name="CODPERSONA")
	private PersonaEntity persona;

	//bi-directional many-to-one association to PersonaausenciatipoEntity
	@ManyToOne
	@JoinColumn(name="CODAUSENCIATIPO")
	private PersonaausenciatipoEntity personaausenciatipo;

	public PersonaausenciaEntity() {
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

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Timestamp getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Timestamp fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public PersonaEntity getPersona() {
		return this.persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

	public PersonaausenciatipoEntity getPersonaausenciatipo() {
		return this.personaausenciatipo;
	}

	public void setPersonaausenciatipo(PersonaausenciatipoEntity personaausenciatipo) {
		this.personaausenciatipo = personaausenciatipo;
	}

}