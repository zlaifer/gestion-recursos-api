package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the proyecto database table.
 * 
 */
@Entity
@Table(name="proyecto")
@NamedQuery(name="ProyectoEntity.findAll", query="SELECT p FROM ProyectoEntity p")
public class ProyectoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String codigoproyecto;

	private String descripcion;

	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	private Timestamp fechamodificacion;

	private String nombre;

	private byte prioritario;

	//bi-directional many-to-one association to PresupuestoEntity
	@ManyToOne
	@JoinColumn(name="CODPRESUPUESTO")
	private PresupuestoEntity presupuesto;

	//bi-directional many-to-one association to ProyectotipoEntity
	@ManyToOne
	@JoinColumn(name="CODPROYECTOTIPO")
	private ProyectotipoEntity proyectotipo;

	public ProyectoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoproyecto() {
		return this.codigoproyecto;
	}

	public void setCodigoproyecto(String codigoproyecto) {
		this.codigoproyecto = codigoproyecto;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getPrioritario() {
		return this.prioritario;
	}

	public void setPrioritario(byte prioritario) {
		this.prioritario = prioritario;
	}

	public PresupuestoEntity getPresupuesto() {
		return this.presupuesto;
	}

	public void setPresupuesto(PresupuestoEntity presupuesto) {
		this.presupuesto = presupuesto;
	}

	public ProyectotipoEntity getProyectotipo() {
		return this.proyectotipo;
	}

	public void setProyectotipo(ProyectotipoEntity proyectotipo) {
		this.proyectotipo = proyectotipo;
	}

}