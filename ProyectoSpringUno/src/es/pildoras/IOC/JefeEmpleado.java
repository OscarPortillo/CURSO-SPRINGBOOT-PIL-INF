package es.pildoras.IOC;
/**
 * 
 * @author oscar
 *
 */
public class JefeEmpleado implements Empleados{
	/**
	 * 
	 */
	public String getTareas() {//eL triangulo indica que se est� sobreescribiendo el m�todo de la interfaz
		return "Gestion las cuestiones relativas a mis empleados de secci�n";
	}
}