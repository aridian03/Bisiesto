package UT04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Clase AreaPrisma
 * Clase que es para calcular el area de un prisma.
 * @author aridi
 *
 */
public class AreaPrisma {

	public static void imprimirValor(String valor) {
		System.out.println(valor);
	}

	public static boolean esNumero(String valor) {
		try {
			Float.parseFloat(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static float alturaTriangulo(float baseTriangulo) {
		return (float) (baseTriangulo * Math.sqrt(3) / 2);
	}

	public static float areaBase(float baseTriangulo, float alturaTriangulo) {
		return baseTriangulo * alturaTriangulo / 2;
	}

	public static float perimetro(float baseTriangulo) {
		return 3 * baseTriangulo;
	}

	public static float areaLateral(float perimetro, float alturaPrisma) {
		return perimetro * alturaPrisma;
	}

	public static float areaTotal(float areaBase, float areaLateral) {
		return 2 * areaBase + areaLateral;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float baseTriangulo, alturaPrisma = 0, hTriangulo, perimetroPrisma, areaBase, areaLateral, areaTotal;
		String alt, longt = null;
		ArrayList<Prisma> prismas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int base = (int) (Math.random() * 10) + 1;
            int altura = (int) (Math.random() * 10) + 1;
            Prisma prisma = new Prisma(base, altura);
            prismas.add(prisma);
            System.out.println("Creado el objeto " + prisma + " con: ");
            System.out.println("- Base: " + base);
            System.out.println("- Altura: " + altura);
            System.out.println("- Area total: " + prisma.areaTotal() + "\n");
        }
		
		Collections.sort(prismas, (prisma1, prisma2) -> Float.compare(prisma2.areaTotal(), prisma1.areaTotal()));
        
		
	}

}
