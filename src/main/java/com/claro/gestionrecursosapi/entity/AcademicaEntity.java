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
 * The persistent class for the academica database table.
 * 
 */
@Entity
@Table(name="academica")
@NamedQuery(name="AcademicaEntity.findAll", query="SELECT a FROM AcademicaEntity a")
public class AcademicaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	private Timestamp fechamodificacion;

	private String institucion;

	private String titulo;

	//bi-directional many-to-one association to AcademicanivelEntity
	@ManyToOne
	@JoinColumn(name="CODACADEMICANIVEL")
	private AcademicanivelEntity academicanivel;

	//bi-directional many-to-one association to PersonaEntity
	@ManyToOne
	@JoinColumn(name="CODPERSONA")
	private PersonaEntity persona;

	public AcademicaEntity() {
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

	public String getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public AcademicanivelEntity getAcademicanivel() {
		return this.academicanivel;
	}

	public void setAcademicanivel(AcademicanivelEntity academicanivel) {
		this.academicanivel = academicanivel;
	}

	public PersonaEntity getPersona() {
		return this.persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

}