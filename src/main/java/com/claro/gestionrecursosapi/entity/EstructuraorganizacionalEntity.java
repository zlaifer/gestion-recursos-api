package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the estructuraorganizacional database table.
 * 
 */
@Entity
@Table(name="estructuraorganizacional")
public class EstructuraorganizacionalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechaCreacion;

	@UpdateTimestamp
	private Timestamp fechaModificacion;

	@NotBlank(message = "Campo requerido")
	private String nombre;

	@Min(value = 1, message = "Campo requerido")
	private Integer codempleadoResponsable;

	@Min(value = 1, message = "Campo requerido")
	private Integer codpadre;

	@Min(value = 1, message = "Campo requerido")
	private Integer codestructuratipo;

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

	public Integer getCodempleadoResponsable() {
		return codempleadoResponsable;
	}

	public void setCodempleadoResponsable(Integer codempleadoResponsable) {
		this.codempleadoResponsable = codempleadoResponsable;
	}

	public Integer getCodpadre() {
		return codpadre;
	}

	public void setCodpadre(Integer codpadre) {
		this.codpadre = codpadre;
	}

	public Integer getCodestructuratipo() {
		return codestructuratipo;
	}

	public void setCodestructuratipo(Integer codestructuratipo) {
		this.codestructuratipo = codestructuratipo;
	}
}