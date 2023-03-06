package com.distribuida.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("beanProducto")
@Scope("singleton")


public class Producto {
		private int idProducto;
		private String nombre;
		private double precio;
		private int stock;
		
		public Producto() {}
		public Producto (int idProducto,String nombre,double precio,int stock) {
		
			this.idProducto=idProducto;
			this.nombre=nombre;
			this.precio=precio;
			this.stock=stock; 
		
			
			}
		public void setIdProducto(int idProducto) {
			this.idProducto=idProducto;
			
		}
		public int getIdProducto() {
			return idProducto;
		}
		
		
		public void setNombre(String nombre) {
			this.nombre=nombre;
			
		}
		
		public String getNombre() {
			return nombre;
			
		}
		
		public void setPrecio(Double precio) {
			this.precio=precio;
			
		}
		public double getPrecio() {
			return precio;
		}
		
		public void setStock(int stock) {
			this.stock=stock;
			
		}
		
		public int getStock() {
			return stock;
		}
		
		@PostConstruct
		public void despuesCreacionBean() {
			System.out.println("Se ejecutan tareas despues de la creacion del bean");
		}
		
		@PreDestroy
		public void antesDestruccionBean() {
			System.out.println("Se ejecutan tareas antes de la destruccion  del bean");
		}
		
		
		@Override
		public String toString() {
			return "Producto[idProducto="+ idProducto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock +"]";
			
		}

}

