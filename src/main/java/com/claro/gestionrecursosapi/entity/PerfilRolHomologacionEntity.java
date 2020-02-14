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
 * The persistent class for the perfil_rol_homologacion database table.
 * 
 */
@Entity
@Table(name="perfil_rol_homologacion")
@NamedQuery(name="PerfilRolHomologacionEntity.findAll", query="SELECT p FROM PerfilRolHomologacionEntity p")
public class PerfilRolHomologacionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	//bi-directional many-to-one association to PerfilEntity
	@ManyToOne
	@JoinColumn(name="CODPERFIL")
	private PerfilEntity perfil;

	//bi-directional many-to-one association to RolEntity
	@ManyToOne
	@JoinColumn(name="CODROL")
	private RolEntity rol;

	public PerfilRolHomologacionEntity() {
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

	public PerfilEntity getPerfil() {
		return this.perfil;
	}

	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}

	public RolEntity getRol() {
		return this.rol;
	}

	public void setRol(RolEntity rol) {
		this.rol = rol;
	}

}