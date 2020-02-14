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
 * The persistent class for the personaausenciatipo database table.
 * 
 */
@Entity
@Table(name="personaausenciatipo")
@NamedQuery(name="PersonaausenciatipoEntity.findAll", query="SELECT p FROM PersonaausenciatipoEntity p")
public class PersonaausenciatipoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to PersonaausenciaEntity
	@OneToMany(mappedBy="personaausenciatipo")
	private List<PersonaausenciaEntity> personaausencias;

	public PersonaausenciatipoEntity() {
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

	public List<PersonaausenciaEntity> getPersonaausencias() {
		return this.personaausencias;
	}

	public void setPersonaausencias(List<PersonaausenciaEntity> personaausencias) {
		this.personaausencias = personaausencias;
	}

	public PersonaausenciaEntity addPersonaausencia(PersonaausenciaEntity personaausencia) {
		getPersonaausencias().add(personaausencia);
		personaausencia.setPersonaausenciatipo(this);

		return personaausencia;
	}

	public PersonaausenciaEntity removePersonaausencia(PersonaausenciaEntity personaausencia) {
		getPersonaausencias().remove(personaausencia);
		personaausencia.setPersonaausenciatipo(null);

		return personaausencia;
	}

}