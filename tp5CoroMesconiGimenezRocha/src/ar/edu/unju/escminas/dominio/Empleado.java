package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {

	private int dni, legajo;
	private String nombre;
	private String nombreUsuario;
	private String contrasena;
	public static double SUELDO_BASICO = 50000;
	private String rol;
	private LocalDate fechaNac;
	public List<Tarea> tareas;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 */
	
	
	public Empleado(int dni, int legajo, String nombre, String nombreUsuario, String contrasena, String rol,
			LocalDate fechaNac) {
		super();
		List<Tarea> xd = new ArrayList<Tarea>();
		this.tareas = xd;
		this.dni = dni;
		this.legajo = legajo;
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.rol = rol;
		this.fechaNac = fechaNac;
	}
	
	
	
	

	public Empleado(int dni, int legajo, String nombre, String nombreUsuario, String contrasena, String rol,
			LocalDate fechaNac, List<Tarea> tareas) {
		super();
		this.dni = dni;
		this.legajo = legajo;
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.rol = rol;
		this.fechaNac = fechaNac;
		this.tareas = tareas;
	}


	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public static double getSUELDO_BASICO() {
		return SUELDO_BASICO;
	}

	public static void setSUELDO_BASICO(double sUELDO_BASICO) {
		SUELDO_BASICO = sUELDO_BASICO;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public abstract double calcularS();

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", legajo=" + legajo + ", nombre=" + nombre + ", nombreUsuario=" + nombreUsuario
				+ ", contrasena=" + contrasena + ", rol=" + rol + ", fechaNac=" + fechaNac + ", tareas=" + tareas + "]";
	}



}