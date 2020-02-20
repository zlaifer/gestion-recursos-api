package com.claro.gestionrecursosapi.empleado.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@Table(name="empleado")
public class EmpleadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Campo requerido")
	private String codcentrocosto;

	@CreationTimestamp
	@Column(updatable = false)
	private Date fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechaingreso;

	@UpdateTimestamp
	private Date fechamodificacion;

	@NotBlank(message = "Campo requerido")
	private String usuarioclaro;

	@Min(value = 1, message = "Campo requerido")
	private Integer codempleadojefe;

	@Min(value = 1, message = "Campo requerido")
	private Integer codempleadopresupuesto;

	@Min(value = 1, message = "Campo requerido")
	private Integer codgerencia;

	@Min(value = 1, message = "Campo requerido")
	private Integer coddireccion;

	@Min(value = 1, message = "Campo requerido")
	private Integer codlineaproducto;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfil;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfilnivel;

	@Min(value = 1, message = "Campo requerido")
	private Integer codperfiltipo;

	@Min(value = 1, message = "Campo requerido")
	private Integer codpersona;

	@Min(value = 1, message = "Campo requerido")
	private Integer codproveedor;

	public EmpleadoEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodcentrocosto() {
		return this.codcentrocosto;
	}

	public void setCodcentrocosto(String codcentrocosto) {
		this.codcentrocosto = codcentrocosto;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechaingreso() {
		return this.fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Date getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public String getUsuarioclaro() {
		return this.usuarioclaro;
	}

	public void setUsuarioclaro(String usuarioclaro) {
		this.usuarioclaro = usuarioclaro;
	}

	public Integer getCodempleadojefe() {
		return codempleadojefe;
	}

	public void setCodempleadojefe(Integer codempleadojefe) {
		this.codempleadojefe = codempleadojefe;
	}

	public Integer getCodempleadopresupuesto() {
		return codempleadopresupuesto;
	}

	public void setCodempleadopresupuesto(Integer codempleadopresupuesto) {
		this.codempleadopresupuesto = codempleadopresupuesto;
	}

	public Integer getCodgerencia() {
		return codgerencia;
	}

	public void setCodgerencia(Integer codgerencia) {
		this.codgerencia = codgerencia;
	}

	public Integer getCoddireccion() {
		return coddireccion;
	}

	public void setCoddireccion(Integer coddireccion) {
		this.coddireccion = coddireccion;
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

	public Integer getCodpersona() {
		return codpersona;
	}

	public void setCodpersona(Integer codpersona) {
		this.codpersona = codpersona;
	}

	public Integer getCodproveedor() {
		return codproveedor;
	}

	public void setCodproveedor(Integer codproveedor) {
		this.codproveedor = codproveedor;
	}
}