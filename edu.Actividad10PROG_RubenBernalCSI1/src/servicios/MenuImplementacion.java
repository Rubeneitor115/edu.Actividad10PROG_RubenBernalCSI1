/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

/**
 * Implementacion de la interfaz del menu
 * @author rbr - 131224
 *
 */
public class MenuImplementacion implements MenuInterfaz{

	/**
	 * Metodo que mostrara el menu por pantalla
	 * rbr - 131224
	 */
	public void mostrarMenu() {
		
		System.out.println("------------------------------------------------");
		System.out.println("                      MENU                      ");
		System.out.println("------------------------------------------------");
		System.out.println("1. Nuevo Alquiler");
		System.out.println("2. Nuevo Mantenimiento");
		System.out.println("3. Mostrar Balance Diario");
		System.out.println("4. Cerrar Aplicacion");
		System.out.println("------------------------------------------------");
		System.out.println("Seleccione una opcion: ");
		
	}

}
