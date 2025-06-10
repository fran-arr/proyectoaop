package paquete.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {

	public void insertarCliente() {
		System.out.println("Cliente insertado con exito...");
	}
}
