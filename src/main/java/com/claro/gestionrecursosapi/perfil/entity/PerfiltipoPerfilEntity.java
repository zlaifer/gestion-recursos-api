package com.claro.gestionrecursosapi.perfil.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;


/**
 * The persistent class for the perfiltipo_perfil database table.
 * 
 */
@Entity
@Table(name="perfiltipo_perfil")
public class PerfiltipoPerfilEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfil;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfiltipo;

	public PerfiltipoPerfilEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCodperfil() {
		return codperfil;
	}

	public void setCodperfil(Integer codperfil) {
		this.codperfil = codperfil;
	}

	public Integer getCodperfiltipo() {
		return codperfiltipo;
	}

	public void setCodperfiltipo(Integer codperfiltipo) {
		this.codperfiltipo = codperfiltipo;
	}
}