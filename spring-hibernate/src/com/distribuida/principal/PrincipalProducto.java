package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Producto;
import com.distribuida.service.ProductoService;

public class PrincipalProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new 	ClassPathXmlApplicationContext ("ApplicationContext.xml");
		ProductoService productoService=context.getBean("productoServiceImpl",ProductoService.class);

		//READ = listar todos los registros

		List<Producto> productos=productoService.findAll();

		
	    //READ= listar un solo registro

		 //Producto producto= productoService.findOne(1);
		
		// agregar registro
		//productoService.add("uva", "producto",5,6);
		
		//eliminar 
	    //productoService.del(15);
		
		
		//List<Producto> productos1 = productoService.findAll("21");
		
		
		
		
		//IMPRESION
		for(Producto item:productos) {
			System.out.println(item);
			
		} 
		
		//System.out.println(producto);

		
	}

}
