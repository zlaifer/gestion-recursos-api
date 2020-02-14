package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the perfilcosto database table.
 * 
 */
@Embeddable
public class PerfilcostoEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int codperfilnivel;

	@Column(insertable=false, updatable=false)
	private int codperfil;

	@Column(insertable=false, updatable=false)
	private int codlineaproducto;

	@Column(insertable=false, updatable=false)
	private int codperfiltipo;

	public PerfilcostoEntityPK() {
	}
	public int getCodperfilnivel() {
		return this.codperfilnivel;
	}
	public void setCodperfilnivel(int codperfilnivel) {
		this.codperfilnivel = codperfilnivel;
	}
	public int getCodperfil() {
		return this.codperfil;
	}
	public void setCodperfil(int codperfil) {
		this.codperfil = codperfil;
	}
	public int getCodlineaproducto() {
		return this.codlineaproducto;
	}
	public void setCodlineaproducto(int codlineaproducto) {
		this.codlineaproducto = codlineaproducto;
	}
	public int getCodperfiltipo() {
		return this.codperfiltipo;
	}
	public void setCodperfiltipo(int codperfiltipo) {
		this.codperfiltipo = codperfiltipo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PerfilcostoEntityPK)) {
			return false;
		}
		PerfilcostoEntityPK castOther = (PerfilcostoEntityPK)other;
		return 
			(this.codperfilnivel == castOther.codperfilnivel)
			&& (this.codperfil == castOther.codperfil)
			&& (this.codlineaproducto == castOther.codlineaproducto)
			&& (this.codperfiltipo == castOther.codperfiltipo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codperfilnivel;
		hash = hash * prime + this.codperfil;
		hash = hash * prime + this.codlineaproducto;
		hash = hash * prime + this.codperfiltipo;
		
		return hash;
	}
}