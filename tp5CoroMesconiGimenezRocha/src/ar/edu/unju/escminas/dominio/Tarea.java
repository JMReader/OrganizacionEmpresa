package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;

public class Tarea {

	private int codigo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String titulo;
	private String descripcion;
	private Empleado responsable;
	private String observacion;
	private Proyecto proyecto;
	private String estado;

	public Tarea() {

	}

	public Tarea(int codigo, LocalDate fechaInicio, LocalDate fechaFin, String titulo, String descripcion,
			Empleado responsable, String observacion, Proyecto proyecto, String estado) {
		super();
		this.codigo = codigo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.responsable = responsable;
		this.responsable.tareas.add(this);
		this.observacion = observacion;
		this.proyecto = proyecto;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
		this.responsable.tareas.add(this);
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "Tarea [codigo=" + codigo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", titulo="
				+ titulo + ", descripcion=" + descripcion + ", responsable=" + this.responsable.getNombre() + ", observacion="
				+ observacion + ", proyecto=" + this.proyecto.getNombreProyecto() + ", estado=" + estado + "]";
	}

}