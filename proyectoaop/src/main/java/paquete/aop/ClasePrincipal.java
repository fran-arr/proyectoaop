package paquete.aop;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import paquete.aop.dao.ClienteDAO;

public class ClasePrincipal {

	
	public static void main(String[] args) {
		 
		//Leer la configuracion de Spring
		 AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		 
		//Obtener bean del contenedor de Spring 
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		
		//Llamar al metodo
		elCliente.insertarCliente();
		
		//Cerrar el metodo
		contexto.close();
	}
}
