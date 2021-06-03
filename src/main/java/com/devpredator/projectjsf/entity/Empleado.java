/**
 * 
 */
package com.devpredator.projectjsf.entity;

/**
 * @author Sandy
 *
 */
public class Empleado {
 
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String puesto;
	private boolean estado;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	
	
}
