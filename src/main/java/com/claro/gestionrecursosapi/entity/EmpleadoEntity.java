package com.claro.gestionrecursosapi.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@Table(name="empleado")
@NamedQuery(name="EmpleadoEntity.findAll", query="SELECT e FROM EmpleadoEntity e")
public class EmpleadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String codcentrocosto;

	private Timestamp fechacreacion;

	@Temporal(TemporalType.DATE)
	private Date fechaingreso;

	private Timestamp fechamodificacion;

	private String usuarioclaro;

	//bi-directional many-to-one association to EmpleadoEntity
	@ManyToOne
	@JoinColumn(name="CODEMPLEADOJEFE")
	private EmpleadoEntity empleado;

	//bi-directional many-to-one association to EmpleadoEntity
	@OneToMany(mappedBy="empleado")
	private List<EmpleadoEntity> empleados;

	//bi-directional many-to-one association to EmpleadopresupuestoEntity
	@ManyToOne
	@JoinColumn(name="CODEMPLEADOPRESUPUESTO")
	private EmpleadopresupuestoEntity empleadopresupuesto;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@ManyToOne
	@JoinColumn(name="CODGERENCIA")
	private EstructuraorganizacionalEntity estructuraorganizacional1;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@ManyToOne
	@JoinColumn(name="CODDIRECCION")
	private EstructuraorganizacionalEntity estructuraorganizacional2;

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
	@JoinColumn(name="CODPERFILNIVEL")
	private PerfilnivelEntity perfilnivel;

	//bi-directional many-to-one association to PerfiltipoEntity
	@ManyToOne
	@JoinColumn(name="CODPERFILTIPO")
	private PerfiltipoEntity perfiltipo;

	//bi-directional many-to-one association to PersonaEntity
	@ManyToOne
	@JoinColumn(name="CODPERSONA")
	private PersonaEntity persona;

	//bi-directional many-to-one association to ProveedorEntity
	@ManyToOne
	@JoinColumn(name="CODPROVEEDOR")
	private ProveedorEntity proveedor;

	//bi-directional many-to-one association to EmpleadoasignacionEntity
	@OneToMany(mappedBy="empleado")
	private List<EmpleadoasignacionEntity> empleadoasignacions;

	//bi-directional many-to-one association to EmpleadocontrolEntity
	@OneToMany(mappedBy="empleado")
	private List<EmpleadocontrolEntity> empleadocontrols;

	//bi-directional many-to-one association to EstructuraorganizacionalEntity
	@OneToMany(mappedBy="empleado")
	private List<EstructuraorganizacionalEntity> estructuraorganizacionals;

	//bi-directional many-to-one association to PresupuestoEntity
	@OneToMany(mappedBy="empleado")
	private List<PresupuestoEntity> presupuestos;

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

	public Timestamp getFechacreacion() {
		return this.fechacreacion;
	}

	public void setFechacreacion(Timestamp fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechaingreso() {
		return this.fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Timestamp getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Timestamp fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public String getUsuarioclaro() {
		return this.usuarioclaro;
	}

	public void setUsuarioclaro(String usuarioclaro) {
		this.usuarioclaro = usuarioclaro;
	}

	public EmpleadoEntity getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}

	public List<EmpleadoEntity> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<EmpleadoEntity> empleados) {
		this.empleados = empleados;
	}

	public EmpleadoEntity addEmpleado(EmpleadoEntity empleado) {
		getEmpleados().add(empleado);
		empleado.setEmpleado(this);

		return empleado;
	}

	public EmpleadoEntity removeEmpleado(EmpleadoEntity empleado) {
		getEmpleados().remove(empleado);
		empleado.setEmpleado(null);

		return empleado;
	}

	public EmpleadopresupuestoEntity getEmpleadopresupuesto() {
		return this.empleadopresupuesto;
	}

	public void setEmpleadopresupuesto(EmpleadopresupuestoEntity empleadopresupuesto) {
		this.empleadopresupuesto = empleadopresupuesto;
	}

	public EstructuraorganizacionalEntity getEstructuraorganizacional1() {
		return this.estructuraorganizacional1;
	}

	public void setEstructuraorganizacional1(EstructuraorganizacionalEntity estructuraorganizacional1) {
		this.estructuraorganizacional1 = estructuraorganizacional1;
	}

	public EstructuraorganizacionalEntity getEstructuraorganizacional2() {
		return this.estructuraorganizacional2;
	}

	public void setEstructuraorganizacional2(EstructuraorganizacionalEntity estructuraorganizacional2) {
		this.estructuraorganizacional2 = estructuraorganizacional2;
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

	public PersonaEntity getPersona() {
		return this.persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

	public ProveedorEntity getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(ProveedorEntity proveedor) {
		this.proveedor = proveedor;
	}

	public List<EmpleadoasignacionEntity> getEmpleadoasignacions() {
		return this.empleadoasignacions;
	}

	public void setEmpleadoasignacions(List<EmpleadoasignacionEntity> empleadoasignacions) {
		this.empleadoasignacions = empleadoasignacions;
	}

	public EmpleadoasignacionEntity addEmpleadoasignacion(EmpleadoasignacionEntity empleadoasignacion) {
		getEmpleadoasignacions().add(empleadoasignacion);
		empleadoasignacion.setEmpleado(this);

		return empleadoasignacion;
	}

	public EmpleadoasignacionEntity removeEmpleadoasignacion(EmpleadoasignacionEntity empleadoasignacion) {
		getEmpleadoasignacions().remove(empleadoasignacion);
		empleadoasignacion.setEmpleado(null);

		return empleadoasignacion;
	}

	public List<EmpleadocontrolEntity> getEmpleadocontrols() {
		return this.empleadocontrols;
	}

	public void setEmpleadocontrols(List<EmpleadocontrolEntity> empleadocontrols) {
		this.empleadocontrols = empleadocontrols;
	}

	public EmpleadocontrolEntity addEmpleadocontrol(EmpleadocontrolEntity empleadocontrol) {
		getEmpleadocontrols().add(empleadocontrol);
		empleadocontrol.setEmpleado(this);

		return empleadocontrol;
	}

	public EmpleadocontrolEntity removeEmpleadocontrol(EmpleadocontrolEntity empleadocontrol) {
		getEmpleadocontrols().remove(empleadocontrol);
		empleadocontrol.setEmpleado(null);

		return empleadocontrol;
	}

	public List<EstructuraorganizacionalEntity> getEstructuraorganizacionals() {
		return this.estructuraorganizacionals;
	}

	public void setEstructuraorganizacionals(List<EstructuraorganizacionalEntity> estructuraorganizacionals) {
		this.estructuraorganizacionals = estructuraorganizacionals;
	}

	public EstructuraorganizacionalEntity addEstructuraorganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		getEstructuraorganizacionals().add(estructuraorganizacional);
		estructuraorganizacional.setEmpleado(this);

		return estructuraorganizacional;
	}

	public EstructuraorganizacionalEntity removeEstructuraorganizacional(EstructuraorganizacionalEntity estructuraorganizacional) {
		getEstructuraorganizacionals().remove(estructuraorganizacional);
		estructuraorganizacional.setEmpleado(null);

		return estructuraorganizacional;
	}

	public List<PresupuestoEntity> getPresupuestos() {
		return this.presupuestos;
	}

	public void setPresupuestos(List<PresupuestoEntity> presupuestos) {
		this.presupuestos = presupuestos;
	}

	public PresupuestoEntity addPresupuesto(PresupuestoEntity presupuesto) {
		getPresupuestos().add(presupuesto);
		presupuesto.setEmpleado(this);

		return presupuesto;
	}

	public PresupuestoEntity removePresupuesto(PresupuestoEntity presupuesto) {
		getPresupuestos().remove(presupuesto);
		presupuesto.setEmpleado(null);

		return presupuesto;
	}

}