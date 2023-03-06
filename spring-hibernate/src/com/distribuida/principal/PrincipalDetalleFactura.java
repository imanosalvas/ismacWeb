package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.DetalleFactura;
import com.distribuida.service.DetalleFacturaService;

public class PrincipalDetalleFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new 	ClassPathXmlApplicationContext ("ApplicationContext.xml");
		DetalleFacturaService detalleFacturaService=context.getBean("detalleFacturaServiceImpl",DetalleFacturaService.class);

		
		
		//READ = listar todos los registros
				List<DetalleFactura> detalleFacturas=detalleFacturaService.findAll();
			    //READ= listar un solo registro
				DetalleFactura detalleFactura1= detalleFacturaService.findOne(1);
				//CREATE= agregar un registro
				//detalleFacturaService.add(9, 6.48,7 ,3);
				//UPDATE= actualizar registros
				//detalleFacturaService.up(1022, 6,8.80,8,3);
				//DELETE= eliminar registros
			   // detalleFacturaService.del(10);
			    
			    
				//List<DetalleFactura> detalleFacturas1 = DetalleFacturaService.findAll("21");

				//IMPRESION
						for(DetalleFactura item:detalleFacturas) {
							System.out.println(item);
							
						} 
						System.out.println(detalleFactura1);
						context.close();

			}
	}


