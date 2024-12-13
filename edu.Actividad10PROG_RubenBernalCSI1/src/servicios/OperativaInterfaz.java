/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

/**
 * Interfaz para la operativa de la aplicacion
 * @author rbr - 131224
 *
 */
public interface OperativaInterfaz {

	/**
	 * Enunciado de los metodos que tendra la implementacion
	 * rbr - 131224
	 */
	public int nuevoAlquiler();
	public int nuevoMantenimiento(int balanceDiario);
	public void mostrarBalance(int balanceDiario);
	public void cerrarAplicacion();
}
