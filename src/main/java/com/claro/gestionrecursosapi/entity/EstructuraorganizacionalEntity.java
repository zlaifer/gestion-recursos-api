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

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to EmpleadoEntity
	@ManyToOne
	@JoinColumn(name="CODEMPLEADO_RESPONSABLE")
	private EmpleadoEntity empleado;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@ManyToOne
	@JoinColumn(name="CODPADRE")
	private EstructuraorganizacionalEntity estructuraorganizacional;

	//bi-directional many-to-one association to EstructuratipoEntity
	@ManyToOne
	@JoinColumn(name="CODESTRUCTURATIPO")
	private EstructuratipoEntity estructuratipo;

	public EstructuraorganizacionalEntity() {
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

	public EstructuraorganizacionalEntity getEstructuraorganizacional() {
		return this.estructuraorganizacional;
	}

	public void setEstructuraorganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		this.estructuraorganizacional = estructuraorganizacional;
	}

	public EstructuratipoEntity getEstructuratipo() {
		return this.estructuratipo;
	}

	public void setEstructuratipo(EstructuratipoEntity estructuratipo) {
		this.estructuratipo = estructuratipo;
	}

}