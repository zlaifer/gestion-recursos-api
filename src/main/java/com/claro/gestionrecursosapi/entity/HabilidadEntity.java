package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the habilidad database table.
 * 
 */
@Entity
@Table(name="habilidad")
@NamedQuery(name="HabilidadEntity.findAll", query="SELECT h FROM HabilidadEntity h")
public class HabilidadEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to HabilidadtipoEntity
	@ManyToOne
	@JoinColumn(name="CODHABILIDADTIPO")
	private HabilidadtipoEntity habilidadtipo;

	//bi-directional many-to-one association to PersonahabilidadEntity
	@OneToMany(mappedBy="habilidad")
	private List<PersonahabilidadEntity> personahabilidads;

	public HabilidadEntity() {
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HabilidadtipoEntity getHabilidadtipo() {
		return this.habilidadtipo;
	}

	public void setHabilidadtipo(HabilidadtipoEntity habilidadtipo) {
		this.habilidadtipo = habilidadtipo;
	}

	public List<PersonahabilidadEntity> getPersonahabilidads() {
		return this.personahabilidads;
	}

	public void setPersonahabilidads(List<PersonahabilidadEntity> personahabilidads) {
		this.personahabilidads = personahabilidads;
	}

	public PersonahabilidadEntity addPersonahabilidad(PersonahabilidadEntity personahabilidad) {
		getPersonahabilidads().add(personahabilidad);
		personahabilidad.setHabilidad(this);

		return personahabilidad;
	}

	public PersonahabilidadEntity removePersonahabilidad(PersonahabilidadEntity personahabilidad) {
		getPersonahabilidads().remove(personahabilidad);
		personahabilidad.setHabilidad(null);

		return personahabilidad;
	}

}