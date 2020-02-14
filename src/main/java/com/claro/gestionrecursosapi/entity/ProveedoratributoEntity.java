package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
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


/**
 * The persistent class for the proveedoratributo database table.
 * 
 */
@Entity
@Table(name="proveedoratributo")
@NamedQuery(name="ProveedoratributoEntity.findAll", query="SELECT p FROM ProveedoratributoEntity p")
public class ProveedoratributoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String estado;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to ProveedorProveedoratributoEntity
	@OneToMany(mappedBy="proveedoratributo")
	private List<ProveedorProveedoratributoEntity> proveedorProveedoratributos;

	//bi-directional many-to-one association to ProveedoratributotipoEntity
	@ManyToOne
	@JoinColumn(name="CODPROVEEDORATRIBUTOTIPO")
	private ProveedoratributotipoEntity proveedoratributotipo;

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

	public List<ProveedorProveedoratributoEntity> getProveedorProveedoratributos() {
		return this.proveedorProveedoratributos;
	}

	public void setProveedorProveedoratributos(List<ProveedorProveedoratributoEntity> proveedorProveedoratributos) {
		this.proveedorProveedoratributos = proveedorProveedoratributos;
	}

	public ProveedorProveedoratributoEntity addProveedorProveedoratributo(ProveedorProveedoratributoEntity proveedorProveedoratributo) {
		getProveedorProveedoratributos().add(proveedorProveedoratributo);
		proveedorProveedoratributo.setProveedoratributo(this);

		return proveedorProveedoratributo;
	}

	public ProveedorProveedoratributoEntity removeProveedorProveedoratributo(ProveedorProveedoratributoEntity proveedorProveedoratributo) {
		getProveedorProveedoratributos().remove(proveedorProveedoratributo);
		proveedorProveedoratributo.setProveedoratributo(null);

		return proveedorProveedoratributo;
	}

	public ProveedoratributotipoEntity getProveedoratributotipo() {
		return this.proveedoratributotipo;
	}

	public void setProveedoratributotipo(ProveedoratributotipoEntity proveedoratributotipo) {
		this.proveedoratributotipo = proveedoratributotipo;
	}

}