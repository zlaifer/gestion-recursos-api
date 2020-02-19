package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the perfilnivel database table.
 * 
 */
@Entity
@Table(name="perfilnivel")
@NamedQuery(name="PerfilnivelEntity.findAll", query="SELECT p FROM PerfilnivelEntity p")
public class PerfilnivelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechaCreacion;
	@UpdateTimestamp
	private Timestamp fechaModificacion;

	private int jerarquia;

	private String nombre;

	public PerfilnivelEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechacreacion) {
		this.fechaCreacion = fechacreacion;
	}

	public Timestamp getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Timestamp fechamodificacion) {
		this.fechaModificacion = fechamodificacion;
	}

	public int getJerarquia() {
		return this.jerarquia;
	}

	public void setJerarquia(int jerarquia) {
		this.jerarquia = jerarquia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}