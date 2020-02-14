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
 * The persistent class for the perfiltipo_perfil database table.
 * 
 */
@Entity
@Table(name="perfiltipo_perfil")
@NamedQuery(name="PerfiltipoPerfilEntity.findAll", query="SELECT p FROM PerfiltipoPerfilEntity p")
public class PerfiltipoPerfilEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to PerfilEntity
	@ManyToOne
	@JoinColumn(name="CODPERFIL")
	private PerfilEntity perfil;

	//bi-directional many-to-one association to PerfiltipoEntity
	@ManyToOne
	@JoinColumn(name="CODPERFILTIPO")
	private PerfiltipoEntity perfiltipo;

	public PerfiltipoPerfilEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PerfilEntity getPerfil() {
		return this.perfil;
	}

	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}

	public PerfiltipoEntity getPerfiltipo() {
		return this.perfiltipo;
	}

	public void setPerfiltipo(PerfiltipoEntity perfiltipo) {
		this.perfiltipo = perfiltipo;
	}

}