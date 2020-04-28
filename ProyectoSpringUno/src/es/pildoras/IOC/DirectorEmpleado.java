package es.pildoras.IOC;

public class DirectorEmpleado implements Empleados {

	//Creación de campo tipo creacionInforme (Interfaz)
	private CreacionInformes informeNuevo;
	
	//Creación de constructor quye inyecta la dependencia
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
	 * Video 11 - Inyección de dependencias 3
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
	 * Curso Spring. Ciclo de vida del Bean. Vídeo 14
	 */
	/**
	 * Método init
	 * Ejecutar tareas antes de que el bean esté disponible
	 */
	public void metodoInicial() {
		System.out.println("Dentro del método Init. Aquí irían las tareas a ejecutar antes de que el Bean esté listo.");
	}
	/**
	 * Método destroy: Encargado de ejecutar tareas después de que el bean sea utilizado.
	 */
	public void metodoFinal() {
		System.out.println("Dentro del método Destroy. Aquí irían las tareas a ejecutar después de utilizar el Bean.");
	}
}
