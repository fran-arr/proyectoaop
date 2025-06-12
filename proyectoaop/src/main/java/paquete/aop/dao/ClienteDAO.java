package paquete.aop.dao;

import org.springframework.stereotype.Component;

import paquete.aop.Cliente;

@Component
public class ClienteDAO {

	private String valoracionClienteNormal;
	private String codigoClienteNormal;
	
	
	public void insertarCliente(Cliente elCliente, String tipo) {
		System.out.println("Cliente insertado con exito...");
		
		
	}


	public String getValoracionClienteNormal() {
		System.out.println("oBTENEIEndo valoracion del cliente");
		return valoracionClienteNormal;
	}


	public void setValoracionClienteNormal(String valoracionClienteNormal) {
		System.out.println("Estableciendo valoracion del clinte");
		this.valoracionClienteNormal = valoracionClienteNormal;
	}


	public String getCodigoClienteNormal() {
		System.out.println("Obteninendo coidgo del clinte");
		return codigoClienteNormal;
	}


	public void setCodigoClienteNormal(String codigoClienteNormal) {
		System.out.println("Obteneniendo valoracion del cliente");
		this.codigoClienteNormal = codigoClienteNormal;
	}
	
	
}
