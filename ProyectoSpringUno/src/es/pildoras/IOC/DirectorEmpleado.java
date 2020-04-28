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
	/*
	 * Curso Spring. Ciclo de vida del Bean. V�deo 14
	 */
	/**
	 * M�todo init
	 * Ejecutar tareas antes de que el bean est� disponible
	 */
	public void metodoInicial() {
		System.out.println("Dentro del m�todo Init. Aqu� ir�an las tareas a ejecutar antes de que el Bean est� listo.");
	}
	/**
	 * M�todo destroy: Encargado de ejecutar tareas despu�s de que el bean sea utilizado.
	 */
	public void metodoFinal() {
		System.out.println("Dentro del m�todo Destroy. Aqu� ir�an las tareas a ejecutar despu�s de utilizar el Bean.");
	}
}
