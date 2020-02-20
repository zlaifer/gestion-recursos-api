package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;


/**
 * The persistent class for the personahabilidad database table.
 * 
 */
@Entity
@Table(name="personahabilidad")
public class PersonahabilidadEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Min(value = 0, message = "Campo requerido")
	private BigDecimal experienciaanios;

	@Min(value = 1, message = "Campo requerido")
	private Integer codhabilidad;

	@Min(value = 1, message = "Campo requerido")
	private Integer codpersona;

	public PersonahabilidadEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getExperienciaanios() {
		return this.experienciaanios;
	}

	public void setExperienciaanios(BigDecimal experienciaanios) {
		this.experienciaanios = experienciaanios;
	}

	public Integer getCodhabilidad() {
		return codhabilidad;
	}

	public void setCodhabilidad(Integer codhabilidad) {
		this.codhabilidad = codhabilidad;
	}

	public Integer getCodpersona() {
		return codpersona;
	}

	public void setCodpersona(Integer codpersona) {
		this.codpersona = codpersona;
	}
}