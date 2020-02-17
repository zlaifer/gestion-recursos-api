package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the presupuesto database table.
 * 
 */
@Entity
@Table(name="presupuesto")
@NamedQuery(name="PresupuestoEntity.findAll", query="SELECT p FROM PresupuestoEntity p")
public class PresupuestoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="ELEMENTO_PEP")
	private String elementoPep;

	private Timestamp fechacreacion;

	private Timestamp fechamodificacion;

	private String pocisionpresupuestal;

	@Column(name="PRESUPUESTO_COP")
	private BigDecimal presupuestoCop;

	@Column(name="PRESUPUESTO_USSD")
	private BigDecimal presupuestoUssd;

	@Column(name="SALDO_COP")
	private BigDecimal saldoCop;

	@Column(name="SALDO_USSD")
	private BigDecimal saldoUssd;

	//bi-directional many-to-one association to EmpleadoEntity
	@ManyToOne
	@JoinColumn(name="CODEMPLEADOGERENTE")
	private EmpleadoEntity empleado;

	public PresupuestoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getElementoPep() {
		return this.elementoPep;
	}

	public void setElementoPep(String elementoPep) {
		this.elementoPep = elementoPep;
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

	public String getPocisionpresupuestal() {
		return this.pocisionpresupuestal;
	}

	public void setPocisionpresupuestal(String pocisionpresupuestal) {
		this.pocisionpresupuestal = pocisionpresupuestal;
	}

	public BigDecimal getPresupuestoCop() {
		return this.presupuestoCop;
	}

	public void setPresupuestoCop(BigDecimal presupuestoCop) {
		this.presupuestoCop = presupuestoCop;
	}

	public BigDecimal getPresupuestoUssd() {
		return this.presupuestoUssd;
	}

	public void setPresupuestoUssd(BigDecimal presupuestoUssd) {
		this.presupuestoUssd = presupuestoUssd;
	}

	public BigDecimal getSaldoCop() {
		return this.saldoCop;
	}

	public void setSaldoCop(BigDecimal saldoCop) {
		this.saldoCop = saldoCop;
	}

	public BigDecimal getSaldoUssd() {
		return this.saldoUssd;
	}

	public void setSaldoUssd(BigDecimal saldoUssd) {
		this.saldoUssd = saldoUssd;
	}

	public EmpleadoEntity getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}

}