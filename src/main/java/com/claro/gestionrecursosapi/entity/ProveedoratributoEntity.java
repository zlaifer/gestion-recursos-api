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
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the proveedoratributo database table.
 * 
 */
@Entity
@Table(name="proveedoratributo")
public class ProveedoratributoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Campo requerido")
	private String estado;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechacreacion;

	@UpdateTimestamp
	private Timestamp fechamodificacion;

	@NotBlank(message = "Campo requerido")
	private String nombre;

	@Min(value = 1, message = "Campo requerido")
	private Integer codproveedoratributotipo;

	public ProveedoratributoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public Integer getCodproveedoratributotipo() {
		return codproveedoratributotipo;
	}

	public void setCodproveedoratributotipo(Integer codproveedoratributotipo) {
		this.codproveedoratributotipo = codproveedoratributotipo;
	}

}