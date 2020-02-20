package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * The persistent class for the proyectosolicitudempleado database table.
 * 
 */
@Entity
@Table(name = "proyectosolicitudempleado")
@NamedQuery(name = "ProyectosolicitudempleadoEntity.findAll", query = "SELECT p FROM ProyectosolicitudempleadoEntity p")
public class ProyectosolicitudempleadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int cantidad;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	@UpdateTimestamp
	private Timestamp fechamodificacion;

	private int porcentajeasignacion;

	private Integer codlineaproducto;

	private Integer codperfil;

	private Integer codperfilnivel;

	private Integer codperfiltipo;

	private Integer codproyecto;

	public ProyectosolicitudempleadoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

	public int getPorcentajeasignacion() {
		return this.porcentajeasignacion;
	}

	public void setPorcentajeasignacion(int porcentajeasignacion) {
		this.porcentajeasignacion = porcentajeasignacion;
	}

	public Integer getLineasproducto() {
		return this.codlineaproducto;
	}

	public void setLineasproducto(Integer lineasproducto) {
		this.codlineaproducto = lineasproducto;
	}

	public Integer getPerfil() {
		return this.codperfil;
	}

	public void setPerfil(Integer perfil) {
		this.codperfil = perfil;
	}

	public Integer getPerfilnivel() {
		return this.codperfilnivel;
	}

	public void setPerfilnivel(Integer perfilnivel) {
		this.codperfilnivel = perfilnivel;
	}

	public Integer getPerfiltipo() {
		return this.codperfiltipo;
	}

	public void setPerfiltipo(Integer perfiltipo) {
		this.codperfiltipo = perfiltipo;
	}

	public Integer getProyecto() {
		return this.codproyecto;
	}

	public void setProyecto(Integer proyecto) {
		this.codproyecto = proyecto;
	}

}