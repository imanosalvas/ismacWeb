package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Producto;

public class Principal {
	public static void main(String[]args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		Cliente cliente = context.getBean("beanCliente",Cliente.class);
		Producto producto = context.getBean("beanProducto",Producto.class);
		
		DetalleFactura dfactura=context.getBean("beanDetalleFactura",DetalleFactura.class);
		
		cliente.setIdCliente(1);
		cliente.setCedula(175142754); 
		cliente.setNombre("Paco");
		cliente.setDireccion("Tumbaco");
		cliente.setCorreo("mario@gmail.com"); 
		
		producto.setIdProducto(1);
		producto.setNombre("Ismael");
		producto.setPrecio(3.6);
		producto.setStock(6);
		
		System.out.println(cliente.toString());
		
		System.out.println(producto.toString());
		
		
		
	}

}
