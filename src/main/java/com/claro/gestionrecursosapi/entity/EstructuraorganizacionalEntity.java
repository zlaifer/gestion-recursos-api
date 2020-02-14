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
	@OneToMany(mappedBy="estructuraorganizacional1")
	private List<EmpleadoEntity> empleados1;

	//bi-directional many-to-one association to EmpleadoEntity
	@OneToMany(mappedBy="estructuraorganizacional2")
	private List<EmpleadoEntity> empleados2;

	//bi-directional many-to-one association to EmpleadoEntity
	@ManyToOne
	@JoinColumn(name="CODEMPLEADO_RESPONSABLE")
	private EmpleadoEntity empleado;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@ManyToOne
	@JoinColumn(name="CODPADRE")
	private EstructuraorganizacionalEntity estructuraorganizacional;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@OneToMany(mappedBy="estructuraorganizacional")
	private List<EstructuraorganizacionalEntity> estructuraorganizacionals;

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

	public List<EmpleadoEntity> getEmpleados1() {
		return this.empleados1;
	}

	public void setEmpleados1(List<EmpleadoEntity> empleados1) {
		this.empleados1 = empleados1;
	}

	public EmpleadoEntity addEmpleados1(EmpleadoEntity empleados1) {
		getEmpleados1().add(empleados1);
		empleados1.setEstructuraorganizacional1(this);

		return empleados1;
	}

	public EmpleadoEntity removeEmpleados1(EmpleadoEntity empleados1) {
		getEmpleados1().remove(empleados1);
		empleados1.setEstructuraorganizacional1(null);

		return empleados1;
	}

	public List<EmpleadoEntity> getEmpleados2() {
		return this.empleados2;
	}

	public void setEmpleados2(List<EmpleadoEntity> empleados2) {
		this.empleados2 = empleados2;
	}

	public EmpleadoEntity addEmpleados2(EmpleadoEntity empleados2) {
		getEmpleados2().add(empleados2);
		empleados2.setEstructuraorganizacional2(this);

		return empleados2;
	}

	public EmpleadoEntity removeEmpleados2(EmpleadoEntity empleados2) {
		getEmpleados2().remove(empleados2);
		empleados2.setEstructuraorganizacional2(null);

		return empleados2;
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

	public List<EstructuraorganizacionalEntity> getEstructuraorganizacionals() {
		return this.estructuraorganizacionals;
	}

	public void setEstructuraorganizacionals(List<EstructuraorganizacionalEntity> estructuraorganizacionals) {
		this.estructuraorganizacionals = estructuraorganizacionals;
	}

	public EstructuraorganizacionalEntity addEstructuraorganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		getEstructuraorganizacionals().add(estructuraorganizacional);
		estructuraorganizacional.setEstructuraorganizacional(this);

		return estructuraorganizacional;
	}

	public EstructuraorganizacionalEntity removeEstructuraorganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		getEstructuraorganizacionals().remove(estructuraorganizacional);
		estructuraorganizacional.setEstructuraorganizacional(null);

		return estructuraorganizacional;
	}

	public EstructuratipoEntity getEstructuratipo() {
		return this.estructuratipo;
	}

	public void setEstructuratipo(EstructuratipoEntity estructuratipo) {
		this.estructuratipo = estructuratipo;
	}

}