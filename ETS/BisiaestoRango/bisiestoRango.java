package BisiaestoRango;

import java.util.Scanner;

/*
* Clase que representa un rango de anios
*/
public class bisiestoRango {
	/*
	 * Metodo que manda el mensaje
	 * 
	 * @param mensaje valor delo que tienne que visualizarse en el programa
	 * 
	 * @return valor de lo que hay que imprimir
	 */

	private static String mensaje(String mensaje) {
		System.out.println(mensaje);
		return mensaje;

	}

	/*
	 * Metodo que calcula si en el rango solicitado hay un año bisiesto entre ellos
	 * 
	 * @param anio valor que hay entre los dos años que nos introduce el usuario
	 * 
	 * @param primanio valor que nos introcue el usuario para iniciar el rango de
	 * años
	 * 
	 * @param segunanio valor que nos introduce el usuario para finalizar el rango
	 * de años
	 */
	private static void calcanio(int anio, int nobis, int primanio, int segunanio) {

		while (anio <= segunanio || anio >= primanio) {
			if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
				mensaje("El anio -> " + anio + " es bisiesto");
				nobis++;
			}
			anio++;
		}
	}

	/*
	 * Main que nos muestra todos los resultados y tambien inicializamos la
	 * variables
	 * 
	 * @param nobin valor que inica quee el año no es binario
	 * 
	 * @param primanio valor que nos introcue el usuario para iniciar el rango de
	 * años
	 * 
	 * @param segunanio valor que nos introduce el usuario para finalizar el rango
	 * de años
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nobis = 0;
		int primanio, segunanio;

		do {
			System.out.println("Introduce el primer ano: ");
			primanio = sc.nextInt();
			System.out.println("Introduce el segundo ano: ");
			segunanio = sc.nextInt();
		} while (primanio > segunanio);

		if (nobis > 0) {
			mensaje("El numero de años bisiesto entre los anos -> " + primanio + " y -> " + segunanio);
			mensaje("Es -> " + nobis);
		} else {
			mensaje("No hemos encontrado numero bisiestos en el rango solicitado.");
		}

	}

}
