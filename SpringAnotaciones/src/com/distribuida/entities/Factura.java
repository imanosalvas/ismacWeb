package com.distribuida.entities;

import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.distribuida.principal.DatosEmpresa;

@Component
public class Factura {
	private int idFactura;
	private Date fecha;
	private double totalNeto;
	private double iva;
	private double total;
	private Cliente cliente;
	private DatosEmpresa datosEmpresa;
	
	public Factura() {}
	
	@Autowired	
	public Factura(Cliente cliente) {
		
		this.cliente =cliente;
	}
	
	
	public Factura (int idFactura,Date fecha,double totalNeto,double iva,double total) {
	
		this.idFactura=idFactura;
		this.fecha=fecha;
		this.totalNeto=totalNeto;
		this.iva=iva;
		this.total=total;
	}
	

	
	public void setIdFactura(int idFactura) {
		this.idFactura=idFactura;
		
	}
	public int getIdFactura() {
		return idFactura;
	}
	
	public void setFecha(Date fecha) {
		this.fecha=fecha;
		
	}
	public Date getFecha() {
		return fecha;
	}
	
	public void setTotalNeto(double totalNeto) {
		this.totalNeto=totalNeto;
	}
		
	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}
	
	public void setTotalNeto(Double subtotal,Boolean bool) {
		this.totalNeto = totalNeto+ subtotal;
	}
		
	
	public double getTotalNeto() {
		return totalNeto;
	}
	
	public void setIva(double iva) {
		this.iva=iva;
		
	}
	public double getIva() {
		return iva;
	}
	
	public void setTotal(double total) {
		this.total=total;
		
	}
	public double getTotal() {
		return total;
	}
	 
	
	
	public DatosEmpresa getDatosEmpresa() {
		return datosEmpresa;
	}

	@Autowired
	public void setDatosEmpresa(DatosEmpresa datosEmpresa) {
		this.datosEmpresa = datosEmpresa;
	}

	
	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYY");
		return "Factura [idFactura=" + idFactura + ", fecha=" + formato.format(fecha) + ", totalNeto=" + totalNeto + ", iva=" + iva
				+ ", total=" + total + ", cliente=" + cliente + ", datosEmpresa=" + datosEmpresa + ", formato="
				+ formato + "]";
	}
	
	

}
