package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.util.List;

import ar.edu.unju.escminas.tablas.TablaEmpleado;
import ar.edu.unju.escminas.tablas.TablaProyecto;
import ar.edu.unju.escminas.tablas.TablaTarea;

public abstract class Desarrollador extends Empleado {

	private List<String> tecnologias;

	public Desarrollador() {
		// TODO Auto-generated constructor stub
	}

	public Desarrollador(int dni, int legajo, String nombre, String nombreUsuario, String contrasena, String rol,
			LocalDate fechaNac, List<String> tecnologias) {
		super(dni, legajo, nombre, nombreUsuario, contrasena, rol, fechaNac);
		this.tecnologias = tecnologias;
	}

	public List<String> getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(List<String> tecnologias) {
		this.tecnologias = tecnologias;
	}


	
	/**
	 * metodos propios si no es jefe 
	 * @param tareas
	 */
	
	public void listarTareasAsignadas() {
		tareas.stream().forEach(System.out::println);
		;}
	
	
	public Proyecto buscarProyectoPorCodigo(int codigo) {
		return TablaProyecto.PROYECTOS.stream().filter(proyecto -> proyecto.getCodigo() == codigo).findFirst().orElse(null);
	}
	
	//modifica solamente observacion y estado
	public void buscarTareaPorCodigoYModificar(int codigo,  Tarea t1) {
		Tarea tareaEncontrada = TablaTarea.TAREAS.stream().filter(tarea -> tarea.getCodigo() == codigo).findFirst().orElse(null);
		if (tareaEncontrada == null) {
			System.out.println("No existe");
			return;
		}else {
		for(int i=0;i<TablaTarea.TAREAS.size();i++) {
			if(TablaTarea.TAREAS.get(i).getCodigo()==codigo) {
				TablaTarea.TAREAS.get(i).setObservacion(t1.getObservacion());
				TablaTarea.TAREAS.get(i).setEstado(t1.getEstado());
			}
			
		}
		System.out.println(tareaEncontrada.toString());
		}

		
	}
	/**
	 * metodos si son jefes de proyecto 
	 */
	public static void crearProyecto(Proyecto p1) {
		TablaProyecto.PROYECTOS.add(p1);
		TablaProyecto.PROYECTOS.stream().forEach(System.out::println);
		System.out.println("===========================================================================");
		System.out.println("proyecto cargado correctamente");
	}
	
	public static void crearTarea(Tarea t1) {
		TablaTarea.TAREAS.add(t1);
		TablaTarea.TAREAS.stream().forEach(System.out::println);
		System.out.println("===========================================================================");
		System.out.println("tarea cargada y asignada correctamente");
	}
	public void mostrarJefesDeProyectos() {
		for(int i=0;i<TablaEmpleado.EMPLEADOS.size();i++) {
			if(TablaEmpleado.EMPLEADOS.get(i).getRol()=="jefe de proyecto") {
				System.out.println(TablaEmpleado.EMPLEADOS.get(i).getNombreUsuario());
			}
			
		}
		
	}
	public Empleado asignarProyectoAUnJefe(String jefeDeProyecto) {
		for(int i=0;i<TablaEmpleado.EMPLEADOS.size();i++) {
			if(TablaEmpleado.EMPLEADOS.get(i).getNombreUsuario().compareTo(jefeDeProyecto)==0) {
				return TablaEmpleado.EMPLEADOS.get(i);
				
			}
			
		}
		return null;
	}
	
	
	
	
	
	
	
	
}
