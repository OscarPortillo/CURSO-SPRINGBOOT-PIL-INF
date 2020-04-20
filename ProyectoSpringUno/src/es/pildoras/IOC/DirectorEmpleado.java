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
	
	/**
	 * Video 11 - Inyecci�n de dependencias 3
	 */
	private String email;

	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
}
