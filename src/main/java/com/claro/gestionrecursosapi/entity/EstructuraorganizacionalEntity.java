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
import javax.persistence.Table;


/**
 * The persistent class for the estructuraorganizacional database table.
 * 
 */
@Entity
@Table(name="estructuraorganizacional")
@NamedQuery(name="EstructuraorganizacionalEntity.findAll", query="SELECT e FROM EstructuraorganizacionalEntity e")
public class EstructuraorganizacionalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechaCreacion;

	private Timestamp fechaModificacion;

	private String nombre;

	//bi-directional many-to-one association to EmpleadoEntity
	@ManyToOne
	@JoinColumn(name="CODEMPLEADO_RESPONSABLE")
	private EmpleadoEntity empleado;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@ManyToOne
	@JoinColumn(name="CODPADRE")
	private EstructuraorganizacionalEntity estructuraOrganizacional;

	//bi-directional many-to-one association to EstructuratipoEntity
	@ManyToOne
	@JoinColumn(name="CODESTRUCTURATIPO")
	private EstructuratipoEntity estructuraTipo;

	public EstructuraorganizacionalEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechacreacion) {
		this.fechaCreacion = fechacreacion;
	}

	public Timestamp getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Timestamp fechamodificacion) {
		this.fechaModificacion = fechamodificacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EmpleadoEntity getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}

	public EstructuraorganizacionalEntity getEstructuraOrganizacional() {
		return this.estructuraOrganizacional;
	}

	public void setEstructuraOrganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		this.estructuraOrganizacional = estructuraorganizacional;
	}

	public EstructuratipoEntity getEstructuraTipo() {
		return this.estructuraTipo;
	}

	public void setEstructuraTipo(EstructuratipoEntity estructuratipo) {
		this.estructuraTipo = estructuratipo;
	}

}