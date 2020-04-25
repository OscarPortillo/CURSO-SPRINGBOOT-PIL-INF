import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Persona persona;
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
		}*/
		double acumulado;
	    double interes= 0.10;
	    double [] [] saldo  = new double [6] [5];
	    for (int i = 0; i < saldo.length; i++) {
	        saldo [i] [0] = 10000;
	        acumulado = 10000;
	        for (int j = 1; j < saldo.length-1 ; j++) {
	            acumulado = acumulado + (acumulado * interes);
	            saldo [i] [j] = acumulado;
	        }
	        interes = interes+ 0.01;
	    }
	    for (int i = 0; i < saldo.length; i++) {
	     if (i != 0 ) {
	         System.out.println();
	    }
	        for (int j = 0; j < saldo.length - 1; j++) {
	            System.out.printf("%1.2f" ,saldo [i] [j]);
	              System.out.print(" ");
	        }
	    }
	    ArrayList<Integer> lista = new ArrayList<Integer>();
	    lista.add(-5);
	    lista.add(7);
	    lista.add(9);
	    lista.add(1);
	    ArrayList<Integer> listaAux = new ArrayList<Integer>();
	    listaAux.add(-4);
	    listaAux.add(3);
	    listaAux.add(8);
	    System.out.println(lista);// la lista irginal con los sus campos originales - 5, 7, 9, 1
	    System.out.println(listaAux);// la lista axiliar con sus campos originales
	    lista = new ArrayList<Integer>(listaAux);// copiamos la lista auxiliar en la original
	    System.out.println(lista);//lista original con los campos de la lista axiliar  - 4, 3, 8
	}
}
