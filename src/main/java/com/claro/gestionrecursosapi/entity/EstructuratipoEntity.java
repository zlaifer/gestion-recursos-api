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
 * The persistent class for the estructuratipo database table.
 * 
 */
@Entity
@Table(name="estructuratipo")
@NamedQuery(name="EstructuratipoEntity.findAll", query="SELECT e FROM EstructuratipoEntity e")
public class EstructuratipoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private int nivel;

	private String nombre;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@OneToMany(mappedBy="estructuratipo")
	private List<EstructuraorganizacionalEntity> estructuraorganizacionals;

	public EstructuratipoEntity() {
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

	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<EstructuraorganizacionalEntity> getEstructuraorganizacionals() {
		return this.estructuraorganizacionals;
	}

	public void setEstructuraorganizacionals(List<EstructuraorganizacionalEntity> estructuraorganizacionals) {
		this.estructuraorganizacionals = estructuraorganizacionals;
	}

	public EstructuraorganizacionalEntity addEstructuraorganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		getEstructuraorganizacionals().add(estructuraorganizacional);
		estructuraorganizacional.setEstructuratipo(this);

		return estructuraorganizacional;
	}

	public EstructuraorganizacionalEntity removeEstructuraorganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		getEstructuraorganizacionals().remove(estructuraorganizacional);
		estructuraorganizacional.setEstructuratipo(null);

		return estructuraorganizacional;
	}

}