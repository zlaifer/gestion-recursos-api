package com.claro.gestionrecursosapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Usuario")
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	@Min(value = 1, message = "Campo requerido")
	private Integer codusuariorol;
	@NotBlank(message = "Campo requerido")
	@Column(name="usuario")
	private String usuario;
	@NotBlank(message = "Campo requerido")
	private String nombre;
	@NotBlank(message = "Campo requerido")
	private String clave;
	@CreationTimestamp
	@Column(updatable = false)
	private Date fechacreacion;
	@UpdateTimestamp
	private Date fechamodificacion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCodusuariorol() {
		return this.codusuariorol;
	}
	public void setCodusuariorol(Integer codusuariorol) {
		this.codusuariorol = codusuariorol;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	
	public Date getFechamodificacion() {
		return fechamodificacion;
	}
	
	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}
	
}
