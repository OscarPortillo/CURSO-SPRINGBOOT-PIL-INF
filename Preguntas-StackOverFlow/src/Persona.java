import java.util.List;

public class Persona {

	private String nombre;
	private int edad;
	List<Jugador> jugador;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<Jugador> getJugador() {
		return jugador;
	}
	public void setJugador(List<Jugador> hijo) {
		this.jugador = hijo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", jugador=" + jugador + "]";
	}
	
}
