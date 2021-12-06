package ar.edu.unju.escminas.tablas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escminas.dominio.Proyecto;

public class TablaProyecto {

	public static final List<Proyecto> PROYECTOS = new ArrayList<Proyecto>();

	public static void cargarTablaProyecto() {
		// codigo,nombreProyecto,jefeP,integrantes,tareas,estado,porcentajeAvance,fechaEntrega
		Proyecto proyecto1 = new Proyecto(1, "Creacion pagina web", TablaEmpleado.EMPLEADOS.get(0),
				TablaEmpleado.EMPLEADOS.subList(0, 6), null, "activo", 20, LocalDate.of(2021, 10, 12));
		PROYECTOS.add(0, proyecto1);

		Proyecto proyecto2 = new Proyecto(2, "Creacion de un comercio", TablaEmpleado.EMPLEADOS.get(9), TablaEmpleado.EMPLEADOS.subList(1, 9), null,
				"inactivo", 0, LocalDate.of(2021, 11, 21));
		PROYECTOS.add(1, proyecto2);

	}

}
