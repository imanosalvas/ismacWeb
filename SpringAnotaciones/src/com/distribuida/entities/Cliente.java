package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component

public class Cliente {
	private int idCliente;
	private int cedula;
	private String nombre;
	private String direccion;
	private String correo;
	
	public Cliente() {}
	public Cliente (int idCliente,int cedula,String nombre,String direccion,String correo) {
	
		this.idCliente=idCliente;
		this.cedula=cedula; 
		this.nombre=nombre;
		this.direccion=direccion;
		this.correo=correo;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente=idCliente;
		
	}
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setCedula(int cedula) {
		this.cedula=cedula;
		
	}
	public int getCedula() {
		return cedula;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	public String getNombre() {
		return nombre;
	}

	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
		
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void setCorreo(String correo) {
		this.correo=correo;
		
	}
	public String getCorreo() {
		return correo;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", direccion="
				+ direccion + ", correo=" + correo + "]";
	}
	
	

}
