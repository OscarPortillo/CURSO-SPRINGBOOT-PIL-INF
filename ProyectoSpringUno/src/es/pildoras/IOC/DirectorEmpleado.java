package es.pildoras.IOC;

public class DirectorEmpleado implements Empleados {

	//Creaci�n de campo tipo creacionInforme (Interfaz)
	private CreacionInformes informeNuevo;
	
	//Creaci�n de constructor quye inyecta la dependencia
	public DirectorEmpleado( CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
		
	}
	
	@Override
	public String getTareas() {
		return "Gestiono la plantilla de mi empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: "+informeNuevo.getInforme();
	}
}
