import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona;
		Jugador jugador;
		Jugador jugador2;
		List<Jugador> arrayH = null;//Declaras un array que recibe como parametro un objeto de la clase hijo
		String nombre1 = "jugador1";
		String nombre2 = "jugador2";
		String apellidoJugador1 = "Apellido jugador2";
		String apellidoJugador2 = "Apellido jugador2";
		int edad1 = 10;
		int edad2 = 12;

		jugador = new Jugador();
		jugador2 = new Jugador();
		jugador.setNombre(nombre1);
		jugador.setApellido(apellidoJugador1);
		jugador.setEdad(edad1);
		jugador2.setNombre(nombre2);
		jugador2.setApellido(apellidoJugador2);
		jugador2.setEdad(edad2);
		arrayH = new ArrayList<Jugador>();
		arrayH.add(jugador);//Añades al array el hijo
		arrayH.add(jugador2);//Añades al array el hijo

		persona = new Persona();
		persona.setNombre(nombre1);
		persona.setEdad(edad1);
		persona.setJugador(arrayH);//Añade los hijo a la persona.

		System.out.println("Nombre: "+persona.getNombre());
		System.out.println("Edad: "+persona.getEdad());
		for (Jugador hijos : persona.getJugador()) {//Iterando el array de los hijos de la persona
			System.out.println(hijos.toString());
		}
	}
}
