package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.util.List;

public class DesarrolladorPasante extends Desarrollador {

	private String universidad;
	private LocalDate FechaInicioPasantia;
	private LocalDate FechaFinPasantia;

	public DesarrolladorPasante() {
		// TODO Auto-generated constructor stub
	}

	public DesarrolladorPasante(int dni, int legajo, String nombre, String nombreUsuario, String contrasena, String rol,
			LocalDate fechaNac, List<String> tecnologias, String universidad, LocalDate fechaInicioPasantia,
			LocalDate fechaFinPasantia) {
		super(dni, legajo, nombre, nombreUsuario, contrasena, rol, fechaNac, tecnologias);
		this.universidad = universidad;
		FechaInicioPasantia = fechaInicioPasantia;
		FechaFinPasantia = fechaFinPasantia;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public LocalDate getFechaInicioPasantia() {
		return FechaInicioPasantia;
	}

	public void setFechaInicioPasantia(LocalDate fechaInicioPasantia) {
		FechaInicioPasantia = fechaInicioPasantia;
	}

	public LocalDate getFechaFinPasantia() {
		return FechaFinPasantia;
	}

	public void setFechaFinPasantia(LocalDate fechaFinPasantia) {
		FechaFinPasantia = fechaFinPasantia;
	}

	public double calcularS() {

		return SUELDO_BASICO;
	}

	@Override
	public String toString() {
		return "DesarolladorPasante [universidad=" + universidad + ", FechaInicioPasantia=" + FechaInicioPasantia
				+ ", FechaFinPasantia=" + FechaFinPasantia + ", calcularS()=" + calcularS() + ", toString()="
				+ super.toString() + "]";
	}

}
