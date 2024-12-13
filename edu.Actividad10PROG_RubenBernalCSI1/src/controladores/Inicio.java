/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 131224
 *
 */
public class Inicio {

	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 131224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int opcion;
		double balance = 0.0;
        boolean cerrar = true;
		
        do {
        	//Muestro el menu por consola
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar alquiler");
            System.out.println("2. Registrar mantenimiento");
            System.out.println("3. Mostrar balance");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            //Recojo la opcion deseada por el usuario
            int option = sc.nextInt();
            System.out.println();

            //Accedo a la opcion seleccionada por el usuario
            switch (option) {
                case 1:
                    System.out.print("Ingrese el monto recibido por el alquiler: ");
                    double alquiler = sc.nextDouble();
                    balance += alquiler;
                    System.out.println("Alquiler registrado exitosamente.\n");
                    break;
                case 2:
                    System.out.print("Ingrese el costo del mantenimiento: ");
                    double mantenimiento = sc.nextDouble();
                    balance -= mantenimiento;
                    if (balance == 0) {
                        System.out.println("El balance está en equilibrio.\n");
                    } else if (balance < 0) {
                        System.out.println("La estación está en déficit.\n");
                    } else {
                        System.out.println("Mantenimiento registrado exitosamente.\n");
                    }
                    break;
                case 3:
                    System.out.println("El balance actual es: " + balance);
                    if (balance == 0) {
                        System.out.println("Balance en equilibrio.\n");
                    } else if (balance < 0) {
                        System.out.println("Estamos en déficit.\n");
                    } else {
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
                    cerrar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.\n");
            }
        }while (cerrar);


	}

}
