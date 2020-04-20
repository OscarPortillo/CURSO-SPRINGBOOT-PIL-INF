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
	
}
