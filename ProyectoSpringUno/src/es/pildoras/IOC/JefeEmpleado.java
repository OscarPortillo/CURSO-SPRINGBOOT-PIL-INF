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
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {//eL triangulo indica que se está sobreescribiendo el método de la interfaz
		return "Gestion las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: "+ informeNuevo.getInforme();
	}
}
