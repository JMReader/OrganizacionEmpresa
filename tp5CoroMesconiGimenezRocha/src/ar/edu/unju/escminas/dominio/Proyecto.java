package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.util.List;

public class Proyecto implements Comparable<Proyecto> {

	private int codigo;
	private String nombreProyecto;
	private Empleado jefeP;
	private List<Empleado> integrantes;
	private List<Tarea> tareas;
	private String estado;
	private int porcentajeAvance;
	private LocalDate fechaEntrega;

	public Proyecto() {

	}

	// constructor con jefe de proyecto

	public Proyecto(int codigo, String nombreProyecto, Empleado jefeP, List<Empleado> integrantes, List<Tarea> tareas,
			String estado, int porcentajeAvance, LocalDate fechaEntrega) {
		super();
		this.codigo = codigo;
		this.nombreProyecto = nombreProyecto;
		this.jefeP = jefeP;
		this.integrantes = integrantes;
		this.tareas = tareas;
		this.estado = estado;
		this.porcentajeAvance = porcentajeAvance;
		this.fechaEntrega = fechaEntrega;
	}

	/*
	 * public Proyecto(int codigo, String nombreProyecto, List<Empleado>
	 * integrantes, List<Tarea> tareas, String estado, int porcentajeAvance,
	 * LocalDate fechaEntrega) { super(); this.codigo = codigo; this.nombreProyecto
	 * = nombreProyecto; this.integrantes = integrantes; this.tareas = tareas;
	 * this.estado = estado; this.porcentajeAvance = porcentajeAvance;
	 * this.fechaEntrega = fechaEntrega; }
	 */

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public List<Empleado> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Empleado> integrantes) {
		this.integrantes = integrantes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPorcentajeAvance() {
		return porcentajeAvance;
	}

	public void setPorcentajeAvance(int porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Empleado getJefeP() {
		return jefeP;
	}

	public void setJefeP(Empleado jefeP) {
		this.jefeP = jefeP;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "Proyecto [codigo=" + codigo + ", nombreProyecto=" + nombreProyecto + ", jefeP=" + jefeP
				+ ", integrantes=" + integrantes
				+ ", tareas=" + tareas
				+ ", estado=" + estado + ", porcentajeAvance="
				+ porcentajeAvance + ", fechaEntrega=" + fechaEntrega + "]";
	}

	@Override
	public int compareTo(Proyecto o) {
		// TODO Auto-generated method stub
		return this.estado.compareTo(o.getEstado());
	}

}