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
 * The persistent class for the procesoestado database table.
 * 
 */
@Entity
@Table(name="procesoestado")
@NamedQuery(name="ProcesoestadoEntity.findAll", query="SELECT p FROM ProcesoestadoEntity p")
public class ProcesoestadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String flujo;

	private String nombre;

	private int orden;

	//bi-directional many-to-one association to PersonaprocesoEntity
	@OneToMany(mappedBy="procesoestado")
	private List<PersonaprocesoEntity> personaprocesos;

	public ProcesoestadoEntity() {
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

	public String getFlujo() {
		return this.flujo;
	}

	public void setFlujo(String flujo) {
		this.flujo = flujo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public List<PersonaprocesoEntity> getPersonaprocesos() {
		return this.personaprocesos;
	}

	public void setPersonaprocesos(List<PersonaprocesoEntity> personaprocesos) {
		this.personaprocesos = personaprocesos;
	}

	public PersonaprocesoEntity addPersonaproceso(PersonaprocesoEntity personaproceso) {
		getPersonaprocesos().add(personaproceso);
		personaproceso.setProcesoestado(this);

		return personaproceso;
	}

	public PersonaprocesoEntity removePersonaproceso(PersonaprocesoEntity personaproceso) {
		getPersonaprocesos().remove(personaproceso);
		personaproceso.setProcesoestado(null);

		return personaproceso;
	}

}