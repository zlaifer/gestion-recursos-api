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
 * The persistent class for the tipodocumento database table.
 * 
 */
@Entity
@Table(name="tipodocumento")
@NamedQuery(name="TipodocumentoEntity.findAll", query="SELECT t FROM TipodocumentoEntity t")
public class TipodocumentoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to PersonaEntity
	@OneToMany(mappedBy="tipodocumento")
	private List<PersonaEntity> personas;

	public TipodocumentoEntity() {
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

	public List<PersonaEntity> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<PersonaEntity> personas) {
		this.personas = personas;
	}

//	public PersonaEntity addPersona(PersonaEntity persona) {
//		getPersonas().add(persona);
//		persona.setCodtipodocumento(this);
//
//		return persona;
//	}
//
//	public PersonaEntity removePersona(PersonaEntity persona) {
//		getPersonas().remove(persona);
//		persona.setCodtipodocumento(null);
//
//		return persona;
//	}

}