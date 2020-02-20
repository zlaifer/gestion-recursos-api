package com.claro.gestionrecursosapi.perfil.entity;

import java.io.Serializable;

public class PerfilcostoPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer codperfil;
	private Integer codlineaproducto;
	private Integer codperfiltipo;
	private Integer codperfilnivel;
	
	public Integer getCodperfil() {
		return codperfil;
	}
	public void setCodperfil(Integer codperfil) {
		this.codperfil = codperfil;
	}
	public Integer getCodlineaproducto() {
		return codlineaproducto;
	}
	public void setCodlineaproducto(Integer codlineaproducto) {
		this.codlineaproducto = codlineaproducto;
	}
	public Integer getCodperfiltipo() {
		return codperfiltipo;
	}
	public void setCodperfiltipo(Integer codperfiltipo) {
		this.codperfiltipo = codperfiltipo;
	}
	public Integer getCodperfilnivel() {
		return codperfilnivel;
	}
	public void setCodperfilnivel(Integer codperfilnivel) {
		this.codperfilnivel = codperfilnivel;
	}
	
}
