/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

/**
 * Implementacion de la interfaz para la operativa de la aplicacion
 * @author rbr - 131224
 *
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Metodo para registrar un nuevo alquiler
	 * rbr - 131224
	 */
	public int nuevoAlquiler() {
		
		//Variables
		int alquiler;
		int balanceDiario = 0;
		
		//Recojo la cantidad ganada por el alquiler
		System.out.println("Introduce el importe ganado por el alquiler: ");
		alquiler = controladores.Inicio.sc.nextInt();
		
		//Sumo la cantidad ganada al balance diario
		balanceDiario = balanceDiario + alquiler;
		
		//Muestro el mensaje para confirmar que el alquiler se ha registrado correctamente
		System.out.println("El alquiler fue registrado exitosamente!!!!!!");
		
		return balanceDiario;
	}

	/**
	 * Metodo para registrar un nuevo mantenimiento
	 * rbr - 131224
	 */
	public int nuevoMantenimiento(int balanceDiario) {
		
		//Variables
		int mantenimiento;
		
		//Recojo el importe del mantenimiento
		System.out.println("Introduce el importe del mantenimiento: ");
		mantenimiento = controladores.Inicio.sc.nextInt();
		
		//resto la cantidad del mantenimiento al balance diario
		balanceDiario  = balanceDiario + mantenimiento;
				
		if(balanceDiario > 0) {
			return balanceDiario;
		}else if(balanceDiario == 0) {
			System.out.println("El balance está en equilibrio");
			return balanceDiario;
		}else {
			System.out.println("La estación está en déficit");
			return balanceDiario;
		}
	}

	/**
	 * Metodo para mostrar el balance diario
	 * rbr - 131224
	 */
	public void mostrarBalance(int balanceDiario) {
		
		if(balanceDiario > 0) {
			System.out.println("El balance diario es: " + balanceDiario);
		}else if(balanceDiario == 0) {
			System.out.println("Balance en equilibrio");
		}else {
			System.out.println("Estamos en déficit");
		}
		
	}

	/**
	 * Metodo que mostrara un mensaje de despedida al cerrar la aplicacion
	 * rbr - 131224
	 */
	public void cerrarAplicacion() {
		
		System.out.println("Aplicacion cerrada correctamente!!");
		System.out.println("Esperamos que haya tenido un buen dia!!");
		
	}

}
