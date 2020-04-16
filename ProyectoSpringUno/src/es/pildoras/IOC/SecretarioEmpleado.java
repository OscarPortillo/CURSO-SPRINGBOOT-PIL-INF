package es.pildoras.IOC;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Gestiono las agendas de mis jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}
}
