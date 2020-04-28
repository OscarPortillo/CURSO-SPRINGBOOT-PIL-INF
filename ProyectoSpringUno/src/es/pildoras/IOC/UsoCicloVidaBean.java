package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cargar el xml de configuraci�n
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		//Obtenci�n del bean
		DirectorEmpleado oscar = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(oscar.getInforme());
		
		//Cerrar el contexto
		contexto.close();
		
	}

}
