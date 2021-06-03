/**
 * 
 */
package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

/**
 * @author Sandy
 * Clase que permite realizar la logica de negocio
 */
public class EmpleadoService {

	/**
	 * Metodo que consulta la lista de empleados	
	 * @return {@link Empleado} lista de empleados
	 */
	
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("horacio");
		empleadoIBM.setPrimerApellido("rojas");
		empleadoIBM.setSegundoApellido("garcia");
		empleadoIBM.setPuesto("desarrollador");
		empleadoIBM.setEstado(true);
		
		empleadoMicrosoft.setNombre("diego");
		empleadoMicrosoft.setPrimerApellido("amarillo");
		empleadoMicrosoft.setSegundoApellido("garcia");
		empleadoMicrosoft.setPuesto("arquitecto");
		empleadoMicrosoft.setEstado(true);
		
		empleadoApple.setNombre("ramiro");
		empleadoApple.setPrimerApellido("verdes");
		empleadoApple.setSegundoApellido("garcia");
		empleadoApple.setPuesto("analista");
		empleadoApple.setEstado(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
		
	}
	
}
