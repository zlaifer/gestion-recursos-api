package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@Table(name="rol")
@NamedQuery(name="RolEntity.findAll", query="SELECT r FROM RolEntity r")
public class RolEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String estado;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to PerfilRolHomologacionEntity
	@OneToMany(mappedBy="rol")
	private List<PerfilRolHomologacionEntity> perfilRolHomologacions;

	//bi-directional many-to-one association to RolcostoEntity
	@OneToMany(mappedBy="rol")
	private List<RolcostoEntity> rolcostos;

	public RolEntity() {
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

	public List<PerfilRolHomologacionEntity> getPerfilRolHomologacions() {
		return this.perfilRolHomologacions;
	}

	public void setPerfilRolHomologacions(List<PerfilRolHomologacionEntity> perfilRolHomologacions) {
		this.perfilRolHomologacions = perfilRolHomologacions;
	}

	public PerfilRolHomologacionEntity addPerfilRolHomologacion(PerfilRolHomologacionEntity perfilRolHomologacion) {
		getPerfilRolHomologacions().add(perfilRolHomologacion);
		perfilRolHomologacion.setRol(this);

		return perfilRolHomologacion;
	}

	public PerfilRolHomologacionEntity removePerfilRolHomologacion(PerfilRolHomologacionEntity perfilRolHomologacion) {
		getPerfilRolHomologacions().remove(perfilRolHomologacion);
		perfilRolHomologacion.setRol(null);

		return perfilRolHomologacion;
	}

	public List<RolcostoEntity> getRolcostos() {
		return this.rolcostos;
	}

	public void setRolcostos(List<RolcostoEntity> rolcostos) {
		this.rolcostos = rolcostos;
	}

	public RolcostoEntity addRolcosto(RolcostoEntity rolcosto) {
		getRolcostos().add(rolcosto);
		rolcosto.setRol(this);

		return rolcosto;
	}

	public RolcostoEntity removeRolcosto(RolcostoEntity rolcosto) {
		getRolcostos().remove(rolcosto);
		rolcosto.setRol(null);

		return rolcosto;
	}

}