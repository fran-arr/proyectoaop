package paquete.aop;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import paquete.aop.dao.ClienteDAO;
import paquete.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {

	
	public static void main(String[] args) {
		 
		//1.- Leer la configuracion de Spring
		 AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		 
		//2.- Obtener bean del contenedor de Spring 
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class); //Este es el nombre del método que debe coincidir con la anotacion @Before
		ClienteVIPDAO elClienteVIP = contexto.getBean("clienteVIPDAO", ClienteVIPDAO.class); //Este es el nombre del método que debe coincidir con la anotacion @Before
		 
		 
		//3.- Llamar al metodo
		elCliente.insertarCliente();
		elClienteVIP.insertarCliente();
		
		//4.- Cerrar el metodo
		contexto.close();
	}
}
