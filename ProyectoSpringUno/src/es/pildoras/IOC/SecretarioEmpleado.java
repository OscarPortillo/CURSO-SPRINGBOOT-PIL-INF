package es.pildoras.IOC;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	@Override
	public String getTareas() {
		return "Gestiono las agendas de mis jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario "+ informeNuevo.getInforme();
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

	
}
