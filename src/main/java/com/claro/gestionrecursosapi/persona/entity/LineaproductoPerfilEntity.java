package com.claro.gestionrecursosapi.persona.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;


/**
 * The persistent class for the lineaproducto_perfil database table.
 * 
 */
@Entity
@Table(name="lineaproducto_perfil")
public class LineaproductoPerfilEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Min(value = 1, message = "Campo requerido")
	private Integer codlineaproducto;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfil;

	public LineaproductoPerfilEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCodlineaproducto() {
		return codlineaproducto;
	}

	public void setCodlineaproducto(Integer codlineaproducto) {
		this.codlineaproducto = codlineaproducto;
	}

	public Integer getCodperfil() {
		return codperfil;
	}

	public void setCodperfil(Integer codperfil) {
		this.codperfil = codperfil;
	}
	
	

}