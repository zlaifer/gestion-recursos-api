package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the empleadocontrol database table.
 * 
 */
@Entity
@Table(name="empleadocontrol")
@NamedQuery(name="EmpleadocontrolEntity.findAll", query="SELECT e FROM EmpleadocontrolEntity e")
public class EmpleadocontrolEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	private Timestamp fechacreacion;

	private Timestamp fechahorafin;

	private Timestamp fechahorainicio;

	private Timestamp fechamodificacion;

	private BigDecimal horas;

	//bi-directional many-to-one association to EmpleadoEntity
	@ManyToOne
	@JoinColumn(name="CODEMPLEADO")
	private EmpleadoEntity empleado;

	//bi-directional many-to-one association to ProyectoEntity
	@ManyToOne
	@JoinColumn(name="CODPROYECTO")
	private ProyectoEntity proyecto;

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

	public EmpleadoEntity getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}

	public ProyectoEntity getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(ProyectoEntity proyecto) {
		this.proyecto = proyecto;
	}

}