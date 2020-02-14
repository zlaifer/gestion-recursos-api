package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the rolcosto database table.
 * 
 */
@Entity
@Table(name="rolcosto")
@NamedQuery(name="RolcostoEntity.findAll", query="SELECT r FROM RolcostoEntity r")
public class RolcostoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String estado;

	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	private Timestamp fechamodificacion;

	private BigDecimal valor;

	//bi-directional many-to-one association to ProveedorEntity
	@ManyToOne
	@JoinColumn(name="CODPROVEEDOR")
	private ProveedorEntity proveedor;

	//bi-directional many-to-one association to RolEntity
	@ManyToOne
	@JoinColumn(name="CODROL")
	private RolEntity rol;

	public RolcostoEntity() {
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

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public ProveedorEntity getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(ProveedorEntity proveedor) {
		this.proveedor = proveedor;
	}

	public RolEntity getRol() {
		return this.rol;
	}

	public void setRol(RolEntity rol) {
		this.rol = rol;
	}

}