package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Factura;
import com.distribuida.service.FacturaService;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new 	ClassPathXmlApplicationContext ("ApplicationContext.xml");
		FacturaService facturaService=context.getBean("facturaServiceImpl",FacturaService.class);
		
		//READ = listar todos los registros
		List<Factura> facturas=facturaService.findAll();
	    //CREATE= agregar un registro
		//facturaService.add(new Date(),18.00,0.11,080.15,1);
		//UPDATE= actualizar registros
		//facturaService.up(5,new Date(),44.44,0.12,45.98,3);
		//DELETE= eliminar registros
	    //facturaService.del(20);
	    
	    
		//List<Factura> facturas1 = facturaService.findAll("21");

		//IMPRESION
				for(Factura item:facturas) {
					System.out.println(item);
				
					
				} 
				
				System.out.println("facturaDAO.findOne(int x): "+ facturas);
				context.close();

	}

}
