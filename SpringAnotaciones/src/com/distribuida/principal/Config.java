package com.distribuida.principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

@Configuration
@ComponentScan("com.distribuida")
@PropertySource("classpath:datosEmpresa.properties")

public class Config {
	
	@Bean
	public Producto producto() {
		return new Producto();
	}
	
	@Bean
	public Cliente cliente() {
		return new Cliente();
	}
	
	@Bean
	public Factura factura() {
		return new Factura(cliente());
	}
	
	@Bean
	public DetalleFactura detalleFactura() {
		return new DetalleFactura();
	}

}
