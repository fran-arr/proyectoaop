package paquete.aop.aspectos;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoginConAspecto { //Esta es el aspecto como tal...

	//@Pointcut("execution( public * insertar(..))")
	//private void paraClientes() {
	//Este metodo esta vacio, es el nombre identiificativo para las @Pointcut en orden de reciclar codigo	
	//};
	
	
	@Pointcut("execution(* paquete.aop.dao.*.*(..))") //Esta configuracion le dice que actuen sobre todos los metodos 
	private void paraClientes() {};
	
	//@Before("execution(public * insertar*(.. ))") // La point card hace que todo a partir de insertar se ejecute
	@Before("paraClientes()")
	public void antesInsertarCliente() {
		System.out.println("El usuario esta logeado");
		
		System.out.println("El perfil para insertar clientes es correcto");
	}
	
	
	@Before("paraClientes()")
	public void requisitosCliente() {
		System.out.println("El cliente cumple con los requisiots para se insertado a la bb.dd");
	}
	
	@Before("paraClientes()")
	public void requisitosTabla() {
		System.out.println("Hay menos de 3000 registros en la tabla. Puedes insetar el nuevo cliiente");
	}
}
//