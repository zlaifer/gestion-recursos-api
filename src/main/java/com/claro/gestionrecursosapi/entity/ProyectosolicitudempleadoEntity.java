package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the proyectosolicitudempleado database table.
 * 
 */
@Entity
@Table(name="proyectosolicitudempleado")
@NamedQuery(name="ProyectosolicitudempleadoEntity.findAll", query="SELECT p FROM ProyectosolicitudempleadoEntity p")
public class ProyectosolicitudempleadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int cantidad;

	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	private Timestamp fechamodificacion;

	private int porcentajeasignacion;

	//bi-directional many-to-one association to LineasproductoEntity
	@ManyToOne
	@JoinColumn(name="CODLINEAPRODUCTO")
	private LineasproductoEntity lineasproducto;

	//bi-directional many-to-one association to PerfilEntity
	@ManyToOne
	@JoinColumn(name="CODPERFIL")
	private PerfilEntity perfil;

	//bi-directional many-to-one association to PerfilnivelEntity
	@ManyToOne
	@JoinColumn(name="CODPERFILNIVEL")
	private PerfilnivelEntity perfilnivel;

	//bi-directional many-to-one association to PerfiltipoEntity
	@ManyToOne
	@JoinColumn(name="CODPERFILTIPO")
	private PerfiltipoEntity perfiltipo;

	//bi-directional many-to-one association to ProyectoEntity
	@ManyToOne
	@JoinColumn(name="CODPROYECTO")
	private ProyectoEntity proyecto;

	public ProyectosolicitudempleadoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

	public int getPorcentajeasignacion() {
		return this.porcentajeasignacion;
	}

	public void setPorcentajeasignacion(int porcentajeasignacion) {
		this.porcentajeasignacion = porcentajeasignacion;
	}

	public LineasproductoEntity getLineasproducto() {
		return this.lineasproducto;
	}

	public void setLineasproducto(LineasproductoEntity lineasproducto) {
		this.lineasproducto = lineasproducto;
	}

	public PerfilEntity getPerfil() {
		return this.perfil;
	}

	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}

	public PerfilnivelEntity getPerfilnivel() {
		return this.perfilnivel;
	}

	public void setPerfilnivel(PerfilnivelEntity perfilnivel) {
		this.perfilnivel = perfilnivel;
	}

	public PerfiltipoEntity getPerfiltipo() {
		return this.perfiltipo;
	}

	public void setPerfiltipo(PerfiltipoEntity perfiltipo) {
		this.perfiltipo = perfiltipo;
	}

	public ProyectoEntity getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(ProyectoEntity proyecto) {
		this.proyecto = proyecto;
	}

}