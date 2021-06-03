/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.projectjsf.entity.Empleado;
import com.devpredator.projectjsf.services.EmpleadoService;

/**
 * @author Saady
 * Clase controller para la pantalla principal
 */

@ManagedBean
@ViewScoped  // componente que permite sincronizar y mantener la informacion con la pantalla principal y el controller
public class PrincipalController {

   private List<Empleado> empleados;
   private EmpleadoService empleadoService = new EmpleadoService();
  
   @PostConstruct
   public void init() {
	   this.consultarEmpleados();
   }
   
   public void consultarEmpleados() {
	this.empleados =  this.empleadoService.consultarEmpleados();
   }


public List<Empleado> getEmpleados() {
	return empleados;
}


public void setEmpleados(List<Empleado> empleados) {
	this.empleados = empleados;
}
   
   
   
}
