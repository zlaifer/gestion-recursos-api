package com.claro.gestionrecursosapi.perfil.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the perfilnivel database table.
 * 
 */
@Entity
@Table(name="perfilnivel")
public class PerfilnivelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@CreationTimestamp
	@Column(updatable = false)
	private Date fechacreacion;

	@UpdateTimestamp
	private Date fechamodificacion;

	@Min(value = 1, message = "Campo requerido")
	private int jerarquia;

	@NotBlank(message = "Campo requerido")
	private String nombre;

	public PerfilnivelEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
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