package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
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
 * The persistent class for the proveedor_proveedoratributo database table.
 * 
 */
@Entity
@Table(name="proveedor_proveedoratributo")
@NamedQuery(name="ProveedorProveedoratributoEntity.findAll", query="SELECT p FROM ProveedorProveedoratributoEntity p")
public class ProveedorProveedoratributoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	//bi-directional many-to-one association to ProveedorEntity
	@ManyToOne
	@JoinColumn(name="CODPROVEEDOR")
	private ProveedorEntity proveedor;

	//bi-directional many-to-one association to ProveedoratributoEntity
	@ManyToOne
	@JoinColumn(name="CODPROVEEDORATRIBUTO")
	private ProveedoratributoEntity proveedoratributo;

	public ProveedorProveedoratributoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public ProveedorEntity getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(ProveedorEntity proveedor) {
		this.proveedor = proveedor;
	}

	public ProveedoratributoEntity getProveedoratributo() {
		return this.proveedoratributo;
	}

	public void setProveedoratributo(ProveedoratributoEntity proveedoratributo) {
		this.proveedoratributo = proveedoratributo;
	}

}