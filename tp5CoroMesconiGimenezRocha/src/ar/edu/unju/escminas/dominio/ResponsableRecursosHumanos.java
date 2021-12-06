package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.escminas.tablas.TablaEmpleado;

public class ResponsableRecursosHumanos extends Empleado {

	private LocalDate fechaIngreso;
	public static double ADICIONAL_POR_FUNCION = 20000;

	public ResponsableRecursosHumanos() {
		// TODO Auto-generated constructor stub
	}

	public ResponsableRecursosHumanos(int dni, int legajo, String nombre, String nombreUsuario, String contrasena,
			String rol, LocalDate fechaNac, LocalDate fechaIngreso) {
		super(dni, legajo, nombre, nombreUsuario, contrasena, rol, fechaNac);
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



	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "PersonalRecursosHumanos [fechaIngreso=" + fechaIngreso + ", calcularS()=" + calcularS()
				+ ", toString()=" + super.toString() + "]";
	}

	//metodos propios
	
	
	public static void listarPasantes() {
		TablaEmpleado.EMPLEADOS.stream().forEach(empleado -> {
			if (empleado instanceof DesarrolladorPasante) {
				System.out.println(empleado.toString());
			}
		});
	}
	
	public static void darDeAlta(Desarrollador d1) {
		TablaEmpleado.EMPLEADOS.add(d1);
	}
	
	public static void listarDesarrolladoresSinTarea() {
		for(int i=0;i<TablaEmpleado.EMPLEADOS.size();i++) {
			if(TablaEmpleado.EMPLEADOS.get(i) instanceof DesarrolladorContratado || TablaEmpleado.EMPLEADOS.get(i) instanceof DesarrolladorPasante) {
				if(TablaEmpleado.EMPLEADOS.get(i).getTareas().isEmpty()==true) {
					System.out.println(TablaEmpleado.EMPLEADOS.get(i).toString());
				}
				
			}
			
		}
		
	}
 	
	
	
	
	
	
}
