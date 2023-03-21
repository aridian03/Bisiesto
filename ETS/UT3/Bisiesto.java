package UT3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un año ");
		int año = sc.nextInt();
		esBisiesto(año);
		

	}

	static boolean esBisiesto(int año) {
		if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
			System.out.println("Es bisiesto");
			return true;
			
		}else {
			System.out.println("No es bisiesto");
			return false;
		}
		
	}
	
}
