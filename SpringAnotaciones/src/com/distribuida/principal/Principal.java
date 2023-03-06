package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

public class Principal {
	public static void main(String[]args) {
		
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Cliente cliente = context.getBean("cliente", Cliente.class);
		//Cliente cliente2 = context.getBean("beanCliente2", Cliente.class);
		
		Producto producto = context.getBean("producto", Producto.class);
		
		
		Factura factura = context.getBean("factura", Factura.class);
		
		//FacturaDetalleFactory facturaDetalleFactory = new FacturaDetalleFactory();
		
		
		//Clientes
	cliente.setIdCliente(1);
	cliente.setCedula(1701236598);
	cliente.setNombre("Juan Taipe");
	cliente.setDireccion("Av. Por Ahi y mas allá");
	//cliente.setTelefono("0987654321");
	cliente.setCorreo("jtaipe@correo.com");						
	//cliente2.setIdCliente(2);
	//cliente2.setCedula(1701239877);
	//cliente2.setNombre("John Scotch");
	//cliente2.setDireccion("Av. Arriba y Abajo");
	//cliente2.setTelefono("0987699987");
	//cliente2.setCorreo("jhscotch@correo.com");
	
	
		// Productos
	producto.setIdProducto(1);
	producto.setNombre("manzana");
	producto.setPrecio(0.50);
	producto.setStock(100);
	//producto2.setIdProducto(2);
	//producto2.setNombre("pera");
	//producto2.setPrecio(0.35);
	//producto2.setStock(50);
	//producto3.setIdProducto(3);
	//producto3.setNombre("piña");
	//producto3.setPrecio(1.00);
	//producto3.setStock(80);
	
					
		//Facturas
	factura.setIdFactura(1);		
	factura.setFecha(new Date());
	
//		// Factura Detalle			
//	facturaDetalleFactory.add(context, 5 , "beanFacturaDetalle");
//	facturaDetalleFactory.add(context, 10 , "beanFacturaDetalle2");
//	facturaDetalleFactory.add(context, 8 , "beanFacturaDetalle3");			
//	
//	facturaDetalleFactory.findAll().forEach(item ->{
//			factura.setTotalNeto(item.getSubtotal() , true);
//	});
	
	factura.setIva(0.12);
	factura.setTotal(factura.getTotalNeto()+factura.getTotalNeto()*factura.getIva());				
	
	System.out.println(factura.toString());			
	//System.out.println(facturaDetalleFactory.toString());

	context.close();
		
	}

}
