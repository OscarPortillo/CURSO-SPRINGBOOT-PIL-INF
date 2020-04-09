package es.pildoras.IOC;

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
		JefeEmpleado empleados1 = new JefeEmpleado();
		JefeEmpleado empleados2 = new SecretarioEmpleado();
		JefeEmpleado empleados3 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(empleados1.getTareas());
		System.out.println(empleados2.getTareas());
		System.out.println(empleados3.getTareas());
		
	}

}
