package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * The persistent class for the perfilcosto database table.
 * 
 */
@Entity
@Table(name = "perfilcosto")
public class PerfilcostoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String estado;

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp fechaCreacion;
	@UpdateTimestamp
	private Timestamp fechaModificacion;

	private BigDecimal valor;

	private Integer codlineaproducto;

	private Integer codperfil;

	private Integer codperfilnivel;

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

	public Integer getLineasproducto() {
		return this.codlineaproducto;
	}

	public void setLineasproducto(Integer lineasproducto) {
		this.codlineaproducto = lineasproducto;
	}

	public Integer getPerfil() {
		return this.codperfil;
	}

	public void setPerfil(Integer perfil) {
		this.codperfil = perfil;
	}

	public Integer getPerfilnivel() {
		return this.codperfilnivel;
	}

	public void setPerfilnivel(Integer perfilnivel) {
		this.codperfilnivel = perfilnivel;
	}

	public Integer getPerfiltipo() {
		return this.codperfiltipo;
	}

	public void setPerfiltipo(Integer perfiltipo) {
		this.codperfiltipo = perfiltipo;
	}

}