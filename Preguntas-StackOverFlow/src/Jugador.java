
public class Jugador extends Persona {

	private String apellido;
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Hijo [apellido=" + apellido + "]";
	}
	
}
