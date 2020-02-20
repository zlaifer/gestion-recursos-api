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
@Table(name="Persona")
public class PersonaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;	
	
	@Min(value = 1, message = "Campo requerido")
	private int codtipodocumento;
	
	@Min(value = 1, message = "Campo requerido")
	private Long numerodocumento;
	
	@NotBlank(message = "Campo requerido")
	private String nombre1;
	
	private String nombre2;
	
	@NotBlank(message = "Campo requerido")
	private String apellido1;
	
	private String apellido2;
	private String telefono;
	private String correo;
	private String direccionresidencia;
	
	@NotBlank(message = "Campo requerido")
	private String genero;
	
	private Date fechanacimiento;
	
	@CreationTimestamp
	@Column(updatable = false)
	private Date fechacreacion;
	@UpdateTimestamp
	private Date fechamodificacion;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCodtipodocumento() {
		return codtipodocumento;
	}
	
	public void setCodtipodocumento(int codtipodocumento) {
		this.codtipodocumento = codtipodocumento;
	}
	
	public Long getNumerodocumento() {
		return numerodocumento;
	}
	
	public void setNumerodocumento(Long numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	
	public String getNombre1() {
		return nombre1;
	}
	
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	
	public String getNombre2() {
		return nombre2;
	}
	
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getDireccionresidencia() {
		return direccionresidencia;
	}
	
	public void setDireccionresidencia(String direccionresidencia) {
		this.direccionresidencia = direccionresidencia;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getFechanacimiento() {
		return fechanacimiento;
	}
	
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
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
