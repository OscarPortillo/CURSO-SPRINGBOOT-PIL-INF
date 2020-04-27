package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/**
		 * Carga de XML de configuración
		 * PRimero
		 */
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		/**
		 * Segundo petición de beans al contenedor de Spring
		 */
		/**
		 * Explicación: 
		 * Singleton -> apuntan al mismo objeto
		 * Prototype -> Apuntan a un objeto distinto
		 */
		SecretarioEmpleado oscar = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado yesica = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(oscar);
		System.out.println(yesica);
		//Comprobación
		if(oscar == yesica) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		
	}

}
