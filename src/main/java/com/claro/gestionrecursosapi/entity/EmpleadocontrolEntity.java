package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the empleadocontrol database table.
 * 
 */
@Entity
@Table(name="empleadocontrol")
public class EmpleadocontrolEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechacreacion;

	private Timestamp fechahorafin;

	private Timestamp fechahorainicio;
	
	@UpdateTimestamp
	private Timestamp fechamodificacion;

	@Min(value = 1, message = "Campo requerido")
	private BigDecimal horas;

	@Min(value = 1, message = "Campo requerido")
	private Integer codempleado;

	@Min(value = 1, message = "Campo requerido")
	private Integer codproyecto;

	public EmpleadocontrolEntity() {
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

	public Timestamp getFechahorafin() {
		return this.fechahorafin;
	}

	public void setFechahorafin(Timestamp fechahorafin) {
		this.fechahorafin = fechahorafin;
	}

	public Timestamp getFechahorainicio() {
		return this.fechahorainicio;
	}

	public void setFechahorainicio(Timestamp fechahorainicio) {
		this.fechahorainicio = fechahorainicio;
	}

	public Timestamp getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Timestamp fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public BigDecimal getHoras() {
		return this.horas;
	}

	public void setHoras(BigDecimal horas) {
		this.horas = horas;
	}

	public Integer getCodEmpleado() {
		return this.codempleado;
	}

	public void setEmpleado(Integer codempleado) {
		this.codempleado = codempleado;
	}

	public Integer getProyecto() {
		return this.codproyecto;
	}

	public void setCodProyecto(Integer codproyecto) {
		this.codproyecto = codproyecto;
	}

}