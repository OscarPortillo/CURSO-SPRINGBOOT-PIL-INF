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
		
		//Video Nueve
		
	}

}
