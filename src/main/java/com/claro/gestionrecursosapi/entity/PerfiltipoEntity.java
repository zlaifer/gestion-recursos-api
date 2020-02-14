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
 * The persistent class for the perfiltipo database table.
 * 
 */
@Entity
@Table(name="perfiltipo")
@NamedQuery(name="PerfiltipoEntity.findAll", query="SELECT p FROM PerfiltipoEntity p")
public class PerfiltipoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String nombre;

	//bi-directional many-to-one association to EmpleadoEntity
	@OneToMany(mappedBy="perfiltipo")
	private List<EmpleadoEntity> empleados;

	//bi-directional many-to-one association to PerfilcostoEntity
	@OneToMany(mappedBy="perfiltipo")
	private List<PerfilcostoEntity> perfilcostos;

	//bi-directional many-to-one association to PerfiltipoPerfilEntity
	@OneToMany(mappedBy="perfiltipo")
	private List<PerfiltipoPerfilEntity> perfiltipoPerfils;

	//bi-directional many-to-one association to ProyectosolicitudempleadoEntity
	@OneToMany(mappedBy="perfiltipo")
	private List<ProyectosolicitudempleadoEntity> proyectosolicitudempleados;

	public PerfiltipoEntity() {
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

	public List<EmpleadoEntity> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<EmpleadoEntity> empleados) {
		this.empleados = empleados;
	}

	public EmpleadoEntity addEmpleado(EmpleadoEntity empleado) {
		getEmpleados().add(empleado);
		empleado.setPerfiltipo(this);

		return empleado;
	}

	public EmpleadoEntity removeEmpleado(EmpleadoEntity empleado) {
		getEmpleados().remove(empleado);
		empleado.setPerfiltipo(null);

		return empleado;
	}

	public List<PerfilcostoEntity> getPerfilcostos() {
		return this.perfilcostos;
	}

	public void setPerfilcostos(List<PerfilcostoEntity> perfilcostos) {
		this.perfilcostos = perfilcostos;
	}

	public PerfilcostoEntity addPerfilcosto(PerfilcostoEntity perfilcosto) {
		getPerfilcostos().add(perfilcosto);
		perfilcosto.setPerfiltipo(this);

		return perfilcosto;
	}

	public PerfilcostoEntity removePerfilcosto(PerfilcostoEntity perfilcosto) {
		getPerfilcostos().remove(perfilcosto);
		perfilcosto.setPerfiltipo(null);

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
		perfiltipoPerfil.setPerfiltipo(this);

		return perfiltipoPerfil;
	}

	public PerfiltipoPerfilEntity removePerfiltipoPerfil(PerfiltipoPerfilEntity perfiltipoPerfil) {
		getPerfiltipoPerfils().remove(perfiltipoPerfil);
		perfiltipoPerfil.setPerfiltipo(null);

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
		proyectosolicitudempleado.setPerfiltipo(this);

		return proyectosolicitudempleado;
	}

	public ProyectosolicitudempleadoEntity removeProyectosolicitudempleado(ProyectosolicitudempleadoEntity proyectosolicitudempleado) {
		getProyectosolicitudempleados().remove(proyectosolicitudempleado);
		proyectosolicitudempleado.setPerfiltipo(null);

		return proyectosolicitudempleado;
	}

}