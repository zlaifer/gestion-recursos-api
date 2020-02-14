package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the perfilcosto database table.
 * 
 */
@Entity
@Table(name="perfilcosto")
@NamedQuery(name="PerfilcostoEntity.findAll", query="SELECT p FROM PerfilcostoEntity p")
public class PerfilcostoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PerfilcostoEntityPK id;

	private String estado;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private BigDecimal valor;

	//bi-directional many-to-one association to LineasproductoEntity
	@ManyToOne
	@JoinColumn(name="CODLINEAPRODUCTO")
	private LineasproductoEntity lineasproducto;

	//bi-directional many-to-one association to PerfilEntity
	@ManyToOne
	@JoinColumn(name="CODPERFIL")
	private PerfilEntity perfil;

	//bi-directional many-to-one association to PerfilnivelEntity
	@ManyToOne
	@JoinColumn(name="CODPERFIL")
	private PerfilnivelEntity perfilnivel;

	//bi-directional many-to-one association to PerfiltipoEntity
	@ManyToOne
	@JoinColumn(name="CODPERFILTIPO")
	private PerfiltipoEntity perfiltipo;

	public PerfilcostoEntity() {
	}

	public PerfilcostoEntityPK getId() {
		return this.id;
	}

	public void setId(PerfilcostoEntityPK id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
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

	public PerfilnivelEntity getPerfilnivel() {
		return this.perfilnivel;
	}

	public void setPerfilnivel(PerfilnivelEntity perfilnivel) {
		this.perfilnivel = perfilnivel;
	}

	public PerfiltipoEntity getPerfiltipo() {
		return this.perfiltipo;
	}

	public void setPerfiltipo(PerfiltipoEntity perfiltipo) {
		this.perfiltipo = perfiltipo;
	}

}