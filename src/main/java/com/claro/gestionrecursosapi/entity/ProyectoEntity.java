package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the proyecto database table.
 * 
 */
@Entity
@Table(name="proyecto")
@NamedQuery(name="ProyectoEntity.findAll", query="SELECT p FROM ProyectoEntity p")
public class ProyectoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String codigoproyecto;

	private String descripcion;

	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	private Timestamp fechamodificacion;

	private String nombre;

	private byte prioritario;

	//bi-directional many-to-one association to EmpleadoasignacionEntity
	@OneToMany(mappedBy="proyecto")
	private List<EmpleadoasignacionEntity> empleadoasignacions;

	//bi-directional many-to-one association to EmpleadocontrolEntity
	@OneToMany(mappedBy="proyecto")
	private List<EmpleadocontrolEntity> empleadocontrols;

	//bi-directional many-to-one association to PresupuestoEntity
	@ManyToOne
	@JoinColumn(name="CODPRESUPUESTO")
	private PresupuestoEntity presupuesto;

	//bi-directional many-to-one association to ProyectotipoEntity
	@ManyToOne
	@JoinColumn(name="CODPROYECTOTIPO")
	private ProyectotipoEntity proyectotipo;

	//bi-directional many-to-one association to ProyectoalcanceplaneacionEntity
	@OneToMany(mappedBy="proyecto")
	private List<ProyectoalcanceplaneacionEntity> proyectoalcanceplaneacions;

	//bi-directional many-to-one association to ProyectosolicitudempleadoEntity
	@OneToMany(mappedBy="proyecto")
	private List<ProyectosolicitudempleadoEntity> proyectosolicitudempleados;

	public ProyectoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoproyecto() {
		return this.codigoproyecto;
	}

	public void setCodigoproyecto(String codigoproyecto) {
		this.codigoproyecto = codigoproyecto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getPrioritario() {
		return this.prioritario;
	}

	public void setPrioritario(byte prioritario) {
		this.prioritario = prioritario;
	}

	public List<EmpleadoasignacionEntity> getEmpleadoasignacions() {
		return this.empleadoasignacions;
	}

	public void setEmpleadoasignacions(List<EmpleadoasignacionEntity> empleadoasignacions) {
		this.empleadoasignacions = empleadoasignacions;
	}

	public EmpleadoasignacionEntity addEmpleadoasignacion(EmpleadoasignacionEntity empleadoasignacion) {
		getEmpleadoasignacions().add(empleadoasignacion);
		empleadoasignacion.setProyecto(this);

		return empleadoasignacion;
	}

	public EmpleadoasignacionEntity removeEmpleadoasignacion(EmpleadoasignacionEntity empleadoasignacion) {
		getEmpleadoasignacions().remove(empleadoasignacion);
		empleadoasignacion.setProyecto(null);

		return empleadoasignacion;
	}

	public List<EmpleadocontrolEntity> getEmpleadocontrols() {
		return this.empleadocontrols;
	}

	public void setEmpleadocontrols(List<EmpleadocontrolEntity> empleadocontrols) {
		this.empleadocontrols = empleadocontrols;
	}

	public EmpleadocontrolEntity addEmpleadocontrol(EmpleadocontrolEntity empleadocontrol) {
		getEmpleadocontrols().add(empleadocontrol);
		empleadocontrol.setProyecto(this);

		return empleadocontrol;
	}

	public EmpleadocontrolEntity removeEmpleadocontrol(EmpleadocontrolEntity empleadocontrol) {
		getEmpleadocontrols().remove(empleadocontrol);
		empleadocontrol.setProyecto(null);

		return empleadocontrol;
	}

	public PresupuestoEntity getPresupuesto() {
		return this.presupuesto;
	}

	public void setPresupuesto(PresupuestoEntity presupuesto) {
		this.presupuesto = presupuesto;
	}

	public ProyectotipoEntity getProyectotipo() {
		return this.proyectotipo;
	}

	public void setProyectotipo(ProyectotipoEntity proyectotipo) {
		this.proyectotipo = proyectotipo;
	}

	public List<ProyectoalcanceplaneacionEntity> getProyectoalcanceplaneacions() {
		return this.proyectoalcanceplaneacions;
	}

	public void setProyectoalcanceplaneacions(List<ProyectoalcanceplaneacionEntity> proyectoalcanceplaneacions) {
		this.proyectoalcanceplaneacions = proyectoalcanceplaneacions;
	}

	public ProyectoalcanceplaneacionEntity addProyectoalcanceplaneacion(ProyectoalcanceplaneacionEntity proyectoalcanceplaneacion) {
		getProyectoalcanceplaneacions().add(proyectoalcanceplaneacion);
		proyectoalcanceplaneacion.setProyecto(this);

		return proyectoalcanceplaneacion;
	}

	public ProyectoalcanceplaneacionEntity removeProyectoalcanceplaneacion(ProyectoalcanceplaneacionEntity proyectoalcanceplaneacion) {
		getProyectoalcanceplaneacions().remove(proyectoalcanceplaneacion);
		proyectoalcanceplaneacion.setProyecto(null);

		return proyectoalcanceplaneacion;
	}

	public List<ProyectosolicitudempleadoEntity> getProyectosolicitudempleados() {
		return this.proyectosolicitudempleados;
	}

	public void setProyectosolicitudempleados(List<ProyectosolicitudempleadoEntity> proyectosolicitudempleados) {
		this.proyectosolicitudempleados = proyectosolicitudempleados;
	}

	public ProyectosolicitudempleadoEntity addProyectosolicitudempleado(ProyectosolicitudempleadoEntity proyectosolicitudempleado) {
		getProyectosolicitudempleados().add(proyectosolicitudempleado);
		proyectosolicitudempleado.setProyecto(this);

		return proyectosolicitudempleado;
	}

	public ProyectosolicitudempleadoEntity removeProyectosolicitudempleado(ProyectosolicitudempleadoEntity proyectosolicitudempleado) {
		getProyectosolicitudempleados().remove(proyectosolicitudempleado);
		proyectosolicitudempleado.setProyecto(null);

		return proyectosolicitudempleado;
	}

}