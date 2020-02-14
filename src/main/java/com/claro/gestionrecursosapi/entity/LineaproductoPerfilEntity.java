package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the lineaproducto_perfil database table.
 * 
 */
@Entity
@Table(name="lineaproducto_perfil")
@NamedQuery(name="LineaproductoPerfilEntity.findAll", query="SELECT l FROM LineaproductoPerfilEntity l")
public class LineaproductoPerfilEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to LineasproductoEntity
	@ManyToOne
	@JoinColumn(name="CODLINEAPRODUCTO")
	private LineasproductoEntity lineasproducto;

	//bi-directional many-to-one association to PerfilEntity
	@ManyToOne
	@JoinColumn(name="CODPERFIL")
	private PerfilEntity perfil;

	public LineaproductoPerfilEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

}