package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author oscar
 *
 */
public class UsoEmpleados {
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creación de objetos de tipo Empleado
//		JefeEmpleado empleados1 = new JefeEmpleado();
//		JefeEmpleado empleados2 = new SecretarioEmpleado();
//		JefeEmpleado empleados3 = new DirectorEmpleado();
//		
//		//Uso de los objetos creados
//		System.out.println(empleados1.getTareas());
//		System.out.println(empleados2.getTareas());
//		System.out.println(empleados3.getTareas());
		
		/*
		//Video Ocho
		//primer paso: crear el contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//Segundo paso: Pedrile al archivo xml el bean
		Empleados oscar = contexto.getBean("miEmpleado", Empleados.class);
//		
		System.out.println(oscar.getTareas());

		System.out.println(oscar.getInforme());
		//Último paso: cerrar el conetxto
		contexto.close();
		
		/*La verdadera ultilidad de esto es: 
			si en algun momento necesito onjetos de otro tipo no tengo que crear el objeto, crear la instancia, usar la instacia..args
			Simplemente hayq ue ir al archivo xml y decirle el tipo que se desea devolver
			*/
		
		//Video Nueve*/
		
		/**
		 * Video 10 - Inyección de dependencias 2
		 */
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Empleados oscar = contexto.getBean("miSecretarioEmpleado", Empleados.class);
//		System.out.println(oscar.getTareas());
//		System.out.println(oscar.getInforme());
//		contexto.close();
		/**
		 * Video 11 - Inyección de dependencias 3
		 */
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		SecretarioEmpleado oscar = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
//		SecretarioEmpleado leo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
//		
//		System.out.println(oscar.getTareas());
//		System.out.println(oscar.getInforme());
//		System.out.println("Email Oscar: "+oscar.getEmail());
//		System.out.println("Empresa Oscar: "+oscar.getNombreEmpresa());
//		
//		System.out.println("Email Leo: "+leo.getEmail());
//		System.out.println("Empresa Leo: "+leo.getNombreEmpresa());
//		contexto.close();
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		DirectorEmpleado oscar = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(oscar.getTareas());

		System.out.println(oscar.getInforme());
		System.out.println(oscar.getEmail());
		System.out.println(oscar.getNombreEmpresa());
		contexto.close();
	}

}
