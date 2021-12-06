package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import ar.edu.unju.escminas.tablas.TablaProyecto;

public class Presidente extends Empleado {

	private LocalDate fechaIngreso;
	public static double ADICIONAL_POR_FUNCION = 20000;

	/*
	 * public Presidente(String rol) { super(rol); // TODO Auto-generated
	 * constructor stub }
	 * 
	 * public Presidente(String rol, LocalDate fechaIngreso) { super(rol);
	 * this.fechaIngreso = fechaIngreso; }
	 */

	public Presidente() {
		// TODO Auto-generated constructor stub
	}

	public Presidente(int dni, int legajo, String nombre, String nombreUsuario, String contrasena, String rol,
			LocalDate fechaNac, LocalDate fechaIngreso) {
		super(dni, legajo, nombre, nombreUsuario, contrasena, rol, fechaNac);
		this.fechaIngreso = fechaIngreso;
	}

	// getters y setters
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public static double getADICIONAL_POR_FUNCION() {
		return ADICIONAL_POR_FUNCION;
	}

	public static void setADICIONAL_POR_FUNCION(double aDICIONAL_POR_FUNCION) {
		ADICIONAL_POR_FUNCION = aDICIONAL_POR_FUNCION;
	}

	// metodos propios
	public double calcularS() {
		Period periodo = Period.between(fechaIngreso, LocalDate.now());

		double sueldo;
		if (periodo.getYears() >= 5) // antiguedad maayor o igual a 5
			sueldo = Empleado.SUELDO_BASICO + ADICIONAL_POR_FUNCION + (ADICIONAL_POR_FUNCION * 0.40);
		else // antiguedad menor a 5
			sueldo = Empleado.SUELDO_BASICO + ADICIONAL_POR_FUNCION;

		return sueldo;
	}



	public void listarProyectosPorPorcentajeAvance(List<Proyecto> proyectos) {
		proyectos.stream().forEach(proyecto -> System.out.println(proyecto.toString()));
	}

	public void listarProyectosOrdenadosPorEstado() {
		TablaProyecto.PROYECTOS.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "Presidente [fechaIngreso=" + fechaIngreso + ", calcularS()=" + calcularS() + ", toString()="
				+ super.toString() + "]";
	}


}
