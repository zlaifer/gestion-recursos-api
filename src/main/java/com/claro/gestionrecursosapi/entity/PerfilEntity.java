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
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@Table(name="perfil")
@NamedQuery(name="PerfilEntity.findAll", query="SELECT p FROM PerfilEntity p")
public class PerfilEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String estado;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to EmpleadoEntity
	@OneToMany(mappedBy="perfil")
	private List<EmpleadoEntity> empleados;

	//bi-directional many-to-one association to EmpleadoasignacionEntity
	@OneToMany(mappedBy="perfil")
	private List<EmpleadoasignacionEntity> empleadoasignacions;

	//bi-directional many-to-one association to LineaproductoPerfilEntity
	@OneToMany(mappedBy="perfil")
	private List<LineaproductoPerfilEntity> lineaproductoPerfils;

	//bi-directional many-to-one association to PerfilRolHomologacionEntity
	@OneToMany(mappedBy="perfil")
	private List<PerfilRolHomologacionEntity> perfilRolHomologacions;

	//bi-directional many-to-one association to PerfilcostoEntity
	@OneToMany(mappedBy="perfil")
	private List<PerfilcostoEntity> perfilcostos;

	//bi-directional many-to-one association to PerfiltipoPerfilEntity
	@OneToMany(mappedBy="perfil")
	private List<PerfiltipoPerfilEntity> perfiltipoPerfils;

	//bi-directional many-to-one association to ProyectosolicitudempleadoEntity
	@OneToMany(mappedBy="perfil")
	private List<ProyectosolicitudempleadoEntity> proyectosolicitudempleados;

	public PerfilEntity() {
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

	public List<EmpleadoEntity> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<EmpleadoEntity> empleados) {
		this.empleados = empleados;
	}

	public EmpleadoEntity addEmpleado(EmpleadoEntity empleado) {
		getEmpleados().add(empleado);
		empleado.setPerfil(this);

		return empleado;
	}

	public EmpleadoEntity removeEmpleado(EmpleadoEntity empleado) {
		getEmpleados().remove(empleado);
		empleado.setPerfil(null);

		return empleado;
	}

	public List<EmpleadoasignacionEntity> getEmpleadoasignacions() {
		return this.empleadoasignacions;
	}

	public void setEmpleadoasignacions(List<EmpleadoasignacionEntity> empleadoasignacions) {
		this.empleadoasignacions = empleadoasignacions;
	}

	public EmpleadoasignacionEntity addEmpleadoasignacion(EmpleadoasignacionEntity empleadoasignacion) {
		getEmpleadoasignacions().add(empleadoasignacion);
		empleadoasignacion.setPerfil(this);

		return empleadoasignacion;
	}

	public EmpleadoasignacionEntity removeEmpleadoasignacion(EmpleadoasignacionEntity empleadoasignacion) {
		getEmpleadoasignacions().remove(empleadoasignacion);
		empleadoasignacion.setPerfil(null);

		return empleadoasignacion;
	}

	public List<LineaproductoPerfilEntity> getLineaproductoPerfils() {
		return this.lineaproductoPerfils;
	}

	public void setLineaproductoPerfils(List<LineaproductoPerfilEntity> lineaproductoPerfils) {
		this.lineaproductoPerfils = lineaproductoPerfils;
	}

	public LineaproductoPerfilEntity addLineaproductoPerfil(LineaproductoPerfilEntity lineaproductoPerfil) {
		getLineaproductoPerfils().add(lineaproductoPerfil);
		lineaproductoPerfil.setPerfil(this);

		return lineaproductoPerfil;
	}

	public LineaproductoPerfilEntity removeLineaproductoPerfil(LineaproductoPerfilEntity lineaproductoPerfil) {
		getLineaproductoPerfils().remove(lineaproductoPerfil);
		lineaproductoPerfil.setPerfil(null);

		return lineaproductoPerfil;
	}

	public List<PerfilRolHomologacionEntity> getPerfilRolHomologacions() {
		return this.perfilRolHomologacions;
	}

	public void setPerfilRolHomologacions(List<PerfilRolHomologacionEntity> perfilRolHomologacions) {
		this.perfilRolHomologacions = perfilRolHomologacions;
	}

	public PerfilRolHomologacionEntity addPerfilRolHomologacion(PerfilRolHomologacionEntity perfilRolHomologacion) {
		getPerfilRolHomologacions().add(perfilRolHomologacion);
		perfilRolHomologacion.setPerfil(this);

		return perfilRolHomologacion;
	}

	public PerfilRolHomologacionEntity removePerfilRolHomologacion(PerfilRolHomologacionEntity perfilRolHomologacion) {
		getPerfilRolHomologacions().remove(perfilRolHomologacion);
		perfilRolHomologacion.setPerfil(null);

		return perfilRolHomologacion;
	}

	public List<PerfilcostoEntity> getPerfilcostos() {
		return this.perfilcostos;
	}

	public void setPerfilcostos(List<PerfilcostoEntity> perfilcostos) {
		this.perfilcostos = perfilcostos;
	}

	public PerfilcostoEntity addPerfilcosto(PerfilcostoEntity perfilcosto) {
		getPerfilcostos().add(perfilcosto);
		perfilcosto.setPerfil(this);

		return perfilcosto;
	}

	public PerfilcostoEntity removePerfilcosto(PerfilcostoEntity perfilcosto) {
		getPerfilcostos().remove(perfilcosto);
		perfilcosto.setPerfil(null);

		return perfilcosto;
	}

	public List<PerfiltipoPerfilEntity> getPerfiltipoPerfils() {
		return this.perfiltipoPerfils;
	}

	public void setPerfiltipoPerfils(List<PerfiltipoPerfilEntity> perfiltipoPerfils) {
		this.perfiltipoPerfils = perfiltipoPerfils;
	}

	public PerfiltipoPerfilEntity addPerfiltipoPerfil(PerfiltipoPerfilEntity perfiltipoPerfil) {
		getPerfiltipoPerfils().add(perfiltipoPerfil);
		perfiltipoPerfil.setPerfil(this);

		return perfiltipoPerfil;
	}

	public PerfiltipoPerfilEntity removePerfiltipoPerfil(PerfiltipoPerfilEntity perfiltipoPerfil) {
		getPerfiltipoPerfils().remove(perfiltipoPerfil);
		perfiltipoPerfil.setPerfil(null);

		return perfiltipoPerfil;
	}

	public List<ProyectosolicitudempleadoEntity> getProyectosolicitudempleados() {
		return this.proyectosolicitudempleados;
	}

	public void setProyectosolicitudempleados(List<ProyectosolicitudempleadoEntity> proyectosolicitudempleados) {
		this.proyectosolicitudempleados = proyectosolicitudempleados;
	}

	public ProyectosolicitudempleadoEntity addProyectosolicitudempleado(ProyectosolicitudempleadoEntity proyectosolicitudempleado) {
		getProyectosolicitudempleados().add(proyectosolicitudempleado);
		proyectosolicitudempleado.setPerfil(this);

		return proyectosolicitudempleado;
	}

	public ProyectosolicitudempleadoEntity removeProyectosolicitudempleado(ProyectosolicitudempleadoEntity proyectosolicitudempleado) {
		getProyectosolicitudempleados().remove(proyectosolicitudempleado);
		proyectosolicitudempleado.setPerfil(null);

		return proyectosolicitudempleado;
	}

}