package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class DesarrolladorContratado extends Desarrollador {
	private int nroContrato;
	private String tituloProf;
	private LocalDate fechaIngreso;
	public static double ADICIONAL_POR_FUNCION = 20000;

	public DesarrolladorContratado() {
		// TODO Auto-generated constructor stub
	}

	public DesarrolladorContratado(int dni, int legajo, String nombre, String nombreUsuario, String contrasena,
			String rol, LocalDate fechaNac, List<String> tecnologias, int nroContrato, String tituloProf,
			LocalDate fechaIngreso) {
		super(dni, legajo, nombre, nombreUsuario, contrasena, rol, fechaNac, tecnologias);
		this.nroContrato = nroContrato;
		this.tituloProf = tituloProf;
		this.fechaIngreso = fechaIngreso;
	}

	public int getNroContrato() {
		return nroContrato;
	}

	public void setNroContrato(int nroContrato) {
		this.nroContrato = nroContrato;
	}

	public String getTituloProf() {
		return tituloProf;
	}

	public void setTituloProf(String tituloProf) {
		this.tituloProf = tituloProf;
	}
	
	
	

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double calcularS() {
		Period periodo = Period.between(fechaIngreso, LocalDate.now());

		double sueldo;
		if (periodo.getYears() >= 5) // antiguedad maayor o igual a 5
			sueldo = Empleado.SUELDO_BASICO + ADICIONAL_POR_FUNCION + (ADICIONAL_POR_FUNCION * 0.40);
		else // antiguedad menor a 5
			sueldo = Empleado.SUELDO_BASICO + ADICIONAL_POR_FUNCION;

		return sueldo;
	}
	
	
	
	@Override
	public String toString() {
		return "DesarolladorContratado [nroContrato=" + nroContrato + ", tituloProf=" + tituloProf + ", fechaIngreso="
				+ fechaIngreso + ", calcularS()=" + calcularS() + ", toString()=" + super.toString() + "]";
	}

}
