package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.service.ClienteService;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ClassPathXmlApplicationContext context=new 	ClassPathXmlApplicationContext ("ApplicationContext.xml");

	
	ClienteService clienteService=context.getBean("clienteServiceImpl",ClienteService.class);
	//ClienteDAO clienteDAO=context.getBean("clienteDAOImpl",ClienteDAO.class);
  

	
	// READ: LISTAR TODOS LOS REGISTROS
	List<Cliente> clientes=clienteService.findAll();
	
	
	//Cliente cliente= clienteService.findOne(1);
	
	// agregar registro
	//clienteService.add("7777777777", "Juan", "Perez", 80, new Date(), "Maravilla", "099512847856", "correo@gmail.com");
	
	//eliminar 
    //clienteService.del(31);
	
	
	//List<Cliente> clientes1 = clienteService.findAll("21");
	
	
	
	
	//IMPRESION
	for(Cliente item:clientes) {
		System.out.println(item);
		
	}
	
	//System.out.println(clientes);

}

}
