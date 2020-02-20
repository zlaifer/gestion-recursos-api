package com.claro.gestionrecursosapi.proyecto.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the proyectosolicitudempleado database table.
 * 
 */
@Entity
@Table(name="proyectosolicitudempleado")
public class ProyectosolicitudempleadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Min(value = 0, message = "Campo requerido")
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

	@Min(value = 1, message = "Campo requerido")
	private int porcentajeasignacion;

	@Min(value = 1, message = "Campo requerido")
	private Integer codlineaproducto;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfil;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfilnivel;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfiltipo;

	@Min(value = 1, message = "Campo requerido")
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

	public Integer getCodlineaproducto() {
		return codlineaproducto;
	}

	public void setCodlineaproducto(Integer codlineaproducto) {
		this.codlineaproducto = codlineaproducto;
	}

	public Integer getCodperfil() {
		return codperfil;
	}

	public void setCodperfil(Integer codperfil) {
		this.codperfil = codperfil;
	}

	public Integer getCodperfilnivel() {
		return codperfilnivel;
	}

	public void setCodperfilnivel(Integer codperfilnivel) {
		this.codperfilnivel = codperfilnivel;
	}

	public Integer getCodperfiltipo() {
		return codperfiltipo;
	}

	public void setCodperfiltipo(Integer codperfiltipo) {
		this.codperfiltipo = codperfiltipo;
	}

	public Integer getCodproyecto() {
		return codproyecto;
	}

	public void setCodproyecto(Integer codproyecto) {
		this.codproyecto = codproyecto;
	}
}