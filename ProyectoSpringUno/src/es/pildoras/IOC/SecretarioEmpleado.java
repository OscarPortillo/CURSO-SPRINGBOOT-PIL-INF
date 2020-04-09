package es.pildoras.IOC;

public class SecretarioEmpleado extends JefeEmpleado {

	@Override
	public String getTareas() {
		return "Gestiono las agendas de mis jefes";
	}
}
