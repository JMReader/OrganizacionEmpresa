package ar.edu.unju.escminas.tablas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import ar.edu.unju.escminas.dominio.Tarea;

public class TablaTarea {

	public static List<Tarea> TAREAS = new ArrayList<Tarea>();

	public static void cargarTablaTarea() {
		// Falta agregar el empleado responsable y al proyecto que pertenece
		/*
		 * si se les ocurre agregar mas tarea copien y peguen las dos siguientes lineas
		 * para poder hacerlo de manera mas facil Tarea tarea1 = new Tarea
		 * (1,LocalDate.of(2021, 9, 20),LocalDate.of(2021, 9, 28),"Titulo", "Tarea",
		 * null, "Ob", null, "Terminado"); tareas.add(1, tarea1);
		 * 
		 */
		// codigo,fechaInicio,fechaFin,titulo,descripcion,responsable,observacion,proyecto,estado
		Tarea tarea1 = new Tarea(1, LocalDate.of(2021, 9, 20), LocalDate.of(2021, 9, 21), "Eleccion integrantes",
				"se eligen los integrantes para el proyecto ", TablaEmpleado.EMPLEADOS.get(2),
				"el encargado de recursos humanos debe tener en cuenta las aptitudes de cada uno de los empleados para realizar esta tarea ",
				TablaProyecto.PROYECTOS.get(0), "terminado");
		TAREAS.add(0, tarea1);
		Tarea tarea2 = new Tarea(2, LocalDate.of(2021, 9, 21), LocalDate.of(2021, 9, 28), "html",
				"codificar pagina en html5", TablaEmpleado.EMPLEADOS.get(3), "ninguna observacion relevante",
				TablaProyecto.PROYECTOS.get(0), "en proceso");
		TAREAS.add(1, tarea2);
		Tarea tarea3 = new Tarea(3, LocalDate.of(2021, 9, 28), LocalDate.of(2021, 9, 30), "css",
				"crear y aplicar estilos en cascada para la pagina web ", TablaEmpleado.EMPLEADOS.get(6),
				"esta a cargo de un pasante", TablaProyecto.PROYECTOS.get(0), "sin iniciar");
		TAREAS.add(2, tarea3);
		Tarea tarea4 = new Tarea(4, LocalDate.of(2021, 9, 30), LocalDate.of(2021, 10, 5), "JavaScript",
				"aplicar javascript a la pagina para un funcionamiento correcto", TablaEmpleado.EMPLEADOS.get(4),
				"ninguna observacion relevante", TablaProyecto.PROYECTOS.get(0), "sin iniciar");
		TAREAS.add(3, tarea4);
		Tarea tarea5 = new Tarea(5, LocalDate.of(2021, 10, 5), LocalDate.of(2021, 10, 5), "revision de la pagina",
				"revision general de la pagina para verificiar que no hay ningun fallo", TablaEmpleado.EMPLEADOS.get(5),
				"El que revise la pagina debera tener rol de analista", TablaProyecto.PROYECTOS.get(0), "sin iniciar");
		TAREAS.add(4, tarea5);
		Tarea tarea6 = new Tarea(6, LocalDate.of(2021, 10, 12), LocalDate.of(2021, 10, 12), "entrega de la pagina",
				"el prsidente entreguera por mail los archivos de la pagina al cliente", TablaEmpleado.EMPLEADOS.get(1),
				"para poder entregar la pagina esta debe cumplir todos los requerimientos del cliente",
				TablaProyecto.PROYECTOS.get(0), "sin iniciar");
		TAREAS.add(5, tarea6);
		Tarea tarea7 = new Tarea(7, LocalDate.of(2021, 10, 20), LocalDate.of(2021, 10, 21), "Eleccion integrantes e-c ",
				"se eligen los integrantes para realizar el e commerce ", TablaEmpleado.EMPLEADOS.get(2),
				"el encargado de recursos humanos debe tener en cuenta las aptitudes de cada uno de los empleados para realizar esta tarea ",
				TablaProyecto.PROYECTOS.get(0), "Terminado");
		TAREAS.add(6, tarea7);
		Tarea tarea8 = new Tarea(8, LocalDate.of(2021, 10, 21), LocalDate.of(2021, 10, 28), "html e-com",
				"codificar pagina en html5", TablaEmpleado.EMPLEADOS.get(3), "ninguna observacion relevante",
				TablaProyecto.PROYECTOS.get(1), "en proceso");
		TAREAS.add(7, tarea8);
		Tarea tarea9 = new Tarea(9, LocalDate.of(2021, 10, 28), LocalDate.of(2021, 10, 30), "css e-com",
				"crear y aplicar estilos en cascada para la pagina web ", TablaEmpleado.EMPLEADOS.get(6),
				"esta a cargo de un pasante", TablaProyecto.PROYECTOS.get(1), "sin iniciar");
		TAREAS.add(8, tarea9);
		Tarea tarea10 = new Tarea(10, LocalDate.of(2021, 10, 30), LocalDate.of(2021, 11, 1), "JavaScript e-com",
				"aplicar javascript a la pagina para un funcionamiento correcto", TablaEmpleado.EMPLEADOS.get(4),
				"ninguna observacion relevante", TablaProyecto.PROYECTOS.get(1), "sin iniciar");
		TAREAS.add(9, tarea10);
		Tarea tarea11 = new Tarea(11, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 5), "Spring security e-com",
				"se aplica spring security al proyecto para que en este pueda haber un funcionamiento correcto en la interfaz de usuarios y contraseñas",
				TablaEmpleado.EMPLEADOS.get(4), "niguna observacion relevante", TablaProyecto.PROYECTOS.get(1),
				"sin iniciar");
		TAREAS.add(10, tarea11);
		Tarea tarea12 = new Tarea(12, LocalDate.of(2021, 11, 5), LocalDate.of(2021, 11, 7),
				"revision de la pagina e-com", "revision general de la pagina para verificiar que no hay ningun fallo",
				TablaEmpleado.EMPLEADOS.get(5), "El que revise la pagina debera tener rol de analista",
				TablaProyecto.PROYECTOS.get(1), "sin iniciar");
		TAREAS.add(11, tarea12);
		Tarea tarea13 = new Tarea(13, LocalDate.of(2021, 11, 7), LocalDate.of(2021, 11, 12), "android",
				"la pagina se pasara del formato html a android", TablaEmpleado.EMPLEADOS.get(8),
				"esta a cargo de un pasante", TablaProyecto.PROYECTOS.get(1), "sin iniciar");
		TAREAS.add(12, tarea13);
		Tarea tarea14 = new Tarea(14, LocalDate.of(2021, 11, 12), LocalDate.of(2021, 11, 20), "IOS",
				"la pagina se pasara del formato html a un formato entendible para aplicaciones dispositivos aple",
				TablaEmpleado.EMPLEADOS.get(7), "esta a cargo de un pasante", TablaProyecto.PROYECTOS.get(1),
				"sin iniciar");
		TAREAS.add(13, tarea14);
		Tarea tarea15 = new Tarea(15, LocalDate.of(2021, 11, 21), LocalDate.of(2021, 11, 21), "entrega de la pagina",
				"el presidente entregara por mail los archivos de la pagina al cliente", TablaEmpleado.EMPLEADOS.get(1),
				"para poder entregar la pagina esta debe cumplir todos los requerimientos del cliente",
				TablaProyecto.PROYECTOS.get(1), "sin iniciar");
		TAREAS.add(14, tarea15);

	}
}
