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
 * The persistent class for the perfilnivel database table.
 * 
 */
@Entity
@Table(name="perfilnivel")
@NamedQuery(name="PerfilnivelEntity.findAll", query="SELECT p FROM PerfilnivelEntity p")
public class PerfilnivelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private int jerarquia;

	private String nombre;

	//bi-directional many-to-one association to EmpleadoEntity
	@OneToMany(mappedBy="perfilnivel")
	private List<EmpleadoEntity> empleados;

	//bi-directional many-to-one association to PerfilcostoEntity
	@OneToMany(mappedBy="perfilnivel")
	private List<PerfilcostoEntity> perfilcostos;

	//bi-directional many-to-one association to ProyectosolicitudempleadoEntity
	@OneToMany(mappedBy="perfilnivel")
	private List<ProyectosolicitudempleadoEntity> proyectosolicitudempleados;

	public PerfilnivelEntity() {
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

	public int getJerarquia() {
		return this.jerarquia;
	}

	public void setJerarquia(int jerarquia) {
		this.jerarquia = jerarquia;
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
		empleado.setPerfilnivel(this);

		return empleado;
	}

	public EmpleadoEntity removeEmpleado(EmpleadoEntity empleado) {
		getEmpleados().remove(empleado);
		empleado.setPerfilnivel(null);

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
		perfilcosto.setPerfilnivel(this);

		return perfilcosto;
	}

	public PerfilcostoEntity removePerfilcosto(PerfilcostoEntity perfilcosto) {
		getPerfilcostos().remove(perfilcosto);
		perfilcosto.setPerfilnivel(null);

		return perfilcosto;
	}

	public List<ProyectosolicitudempleadoEntity> getProyectosolicitudempleados() {
		return this.proyectosolicitudempleados;
	}

	public void setProyectosolicitudempleados(List<ProyectosolicitudempleadoEntity> proyectosolicitudempleados) {
		this.proyectosolicitudempleados = proyectosolicitudempleados;
	}

	public ProyectosolicitudempleadoEntity addProyectosolicitudempleado(ProyectosolicitudempleadoEntity proyectosolicitudempleado) {
		getProyectosolicitudempleados().add(proyectosolicitudempleado);
		proyectosolicitudempleado.setPerfilnivel(this);

		return proyectosolicitudempleado;
	}

	public ProyectosolicitudempleadoEntity removeProyectosolicitudempleado(ProyectosolicitudempleadoEntity proyectosolicitudempleado) {
		getProyectosolicitudempleados().remove(proyectosolicitudempleado);
		proyectosolicitudempleado.setPerfilnivel(null);

		return proyectosolicitudempleado;
	}

}