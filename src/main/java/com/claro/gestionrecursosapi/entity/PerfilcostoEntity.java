package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the perfilcosto database table.
 * 
 */
@Entity
@Table(name="perfilcosto")
public class PerfilcostoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Campo requerido")
	private String estado;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechacreacion;

	@UpdateTimestamp
	private Timestamp fechamodificacion;

	@Min(value = 1, message = "Campo requerido")
	private BigDecimal valor;

	@Min(value = 1, message = "Campo requerido")
	private Integer codlineaproducto;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfil;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfilnivel;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfiltipo;

	public PerfilcostoEntity() {
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
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

	public Integer getCodperfilnivel() {
		return codperfilnivel;
	}

	public void setCodperfilnivel(Integer codperfilnivel) {
		this.codperfilnivel = codperfilnivel;
	}

	public Integer getCodperfiltipo() {
		return codperfiltipo;
	}

	public void setCodperfiltipo(Integer codperfiltipo) {
		this.codperfiltipo = codperfiltipo;
	}
}