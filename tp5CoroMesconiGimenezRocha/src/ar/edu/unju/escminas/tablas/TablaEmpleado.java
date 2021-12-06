package ar.edu.unju.escminas.tablas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escminas.dominio.DesarrolladorContratado;
import ar.edu.unju.escminas.dominio.DesarrolladorPasante;
import ar.edu.unju.escminas.dominio.Empleado;
import ar.edu.unju.escminas.dominio.Presidente;
import ar.edu.unju.escminas.dominio.ResponsableRecursosHumanos;

public class TablaEmpleado {

	public static List<Empleado> EMPLEADOS = new ArrayList<Empleado>();

	public static List<DesarrolladorPasante> getPasante() {
		List<DesarrolladorPasante> pasantes = new ArrayList<DesarrolladorPasante>();
		for (Empleado empleado : EMPLEADOS) {
			if (empleado instanceof DesarrolladorPasante) {
				pasantes.add((DesarrolladorPasante) empleado);
			}
		}
		return pasantes;
	}

	public static void cargarTablaEmpleado() { // presi: dni, legajo, nombre, nombreUsuario, contrasena, rol, fechaNac,
		// fechaIngreso

		List<String> tecnologias0 = new ArrayList<String>();
		tecnologias0.add(".NET");
		tecnologias0.add("PHP");
		tecnologias0.add("html");
		Empleado desarrollador0 = new DesarrolladorContratado(45555582, 0, "Flor", "Flor3", "1234", "jefe de proyecto",
				LocalDate.of(2002, 2, 12), tecnologias0, 101, "arquitecto de software", LocalDate.of(2020, 7, 15));
		EMPLEADOS.add(0, desarrollador0);

		Empleado presidente = new Presidente(44645191, 1, "Juan", "juan35", "1234", "gerente",
				LocalDate.of(1996, 12, 5), LocalDate.of(2015, 5, 5));
		EMPLEADOS.add(1, presidente);

		Empleado responsableRH = new ResponsableRecursosHumanos(44645369, 2, "German", "german12", "1234", "gerente",
				LocalDate.of(1998, 2, 25), LocalDate.of(2020, 6, 5));
		EMPLEADOS.add(2, responsableRH);

		List<String> tecnologias1 = new ArrayList<String>();
		tecnologias1.add("Java");
		tecnologias1.add(".NET");
		tecnologias1.add("PHP");
		tecnologias1.add("Android");
		tecnologias1.add("html");
		Empleado desarrollador1 = new DesarrolladorContratado(44666582, 3, "Camila", "camilu2", "1234",
				"arquitecto de software", LocalDate.of(2002, 2, 12), tecnologias1, 155, "arquitecto de software",
				LocalDate.of(2020, 7, 15));
		EMPLEADOS.add(3, desarrollador1);

		List<String> tecnologias2 = new ArrayList<String>();
		tecnologias2.add("Java");
		tecnologias2.add("IOS");
		tecnologias2.add("PHP");
		tecnologias2.add("C/C++");
		tecnologias2.add("JavaScript");
		Empleado desarrollador2 = new DesarrolladorContratado(45444678, 4, "Nicole", "niconi", "1234", "programador",
				LocalDate.of(2000, 3, 10), tecnologias2, 158, "ingeniero en sistemas", LocalDate.of(2020, 7, 15));
		EMPLEADOS.add(4, desarrollador2);

		List<String> tecnologias3 = new ArrayList<String>();
		tecnologias3.add("COBOL");
		tecnologias3.add("IOS");
		tecnologias3.add("PHP");
		tecnologias3.add("C/C++");
		tecnologias3.add("PL/SQL");
		Empleado desarrollador3 = new DesarrolladorContratado(45444678, 5, "cristian", "monillo", "1234", "analista",
				LocalDate.of(2002, 6, 22), tecnologias3, 164, "analista",
				LocalDate.of(2019, 7, 25));
		EMPLEADOS.add(5, desarrollador3);

		List<String> tecnologiasp = new ArrayList<String>();
		tecnologiasp.add("css");
		tecnologiasp.add("C/C++");
		Empleado desarrolladorp = new DesarrolladorPasante(45444678, 6, "lucas", "lukita1", "1234", "diseniador grafico",
				LocalDate.of(2003, 2, 25), tecnologiasp, "UNC", LocalDate.of(2021, 8, 23), LocalDate.of(2019, 10, 23));
		EMPLEADOS.add(6, desarrolladorp);

		List<String> tecnologiasp1 = new ArrayList<String>();
		tecnologiasp1.add("IOS");
		tecnologiasp1.add("andorid");
		Empleado desarrolladorp1 = new DesarrolladorPasante(45333546, 7, "juan", "kora", "1234", "progamador",
				LocalDate.of(2001, 2, 10), tecnologiasp1, "UNC", LocalDate.of(2021, 8, 23), LocalDate.of(2019, 10, 23));
		EMPLEADOS.add(7, desarrolladorp1);

		List<String> tecnologiasp2 = new ArrayList<String>();
		tecnologiasp2.add("andorid");
		Empleado desarrolladorp2 = new DesarrolladorPasante(45787862, 8, "jose", "nacho", "1234", "progamador",
				LocalDate.of(2002, 6, 21), tecnologiasp2, "UNC", LocalDate.of(2021, 8, 23), LocalDate.of(2019, 10, 23));
		EMPLEADOS.add(8, desarrolladorp2);

		List<String> tecnologiasp3 = new ArrayList<String>();
		tecnologiasp3.add("COBOL");
		tecnologiasp3.add("PHP");
		tecnologiasp3.add("C/C++");
		Empleado desarrolladorp3 = new DesarrolladorPasante(43123123, 9, "Mateo", "mate54", "1234", "jefe de proyecto",
				LocalDate.of(2000, 3, 22), tecnologiasp3, "UNC", LocalDate.of(2021, 8, 23), LocalDate.of(2019, 7, 25));
		EMPLEADOS.add(9, desarrolladorp3);
	}

}
