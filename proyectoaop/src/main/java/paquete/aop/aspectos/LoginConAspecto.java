package paquete.aop.aspectos;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoginConAspecto { //Esta es el aspecto como tal...

	
	@Before("execution(public void insertarCliente())")
	public void antesInsertarCliente() {
		System.out.println("El usuario esta logeado<");
		
		System.out.println("El perfil para insertar clientes es correcto");
	}
	
}
