package paquete.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@Configuration //Indica que este archivo es una clase de configuracion
@EnableAspectJAutoProxy //Indica qwue vamos a usar la funcionalidad de aop
@ComponentScan(basePackages = "paquete.aop") //Indica donde ir a buscar los aspectos
public class Configuracion {

	
}
