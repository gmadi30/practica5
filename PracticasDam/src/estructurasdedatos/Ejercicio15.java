package estructurasdedatos;

/* (Potencia.java) que visualice en pantalla la
potencia de un una base elevada al un exponente. */

import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args)  {
		
		Scanner entrada = new Scanner(System.in);
		
		int base;
		int exponente; 
		int acomulador = 1; 
		
		System.out.println("Introduce una base: ");
		base = entrada.nextInt();
		System.out.println("Introduce un exponente: ");
		exponente = entrada.nextInt();

		for (int i = 0; i < exponente; i++) {
			
			acomulador = acomulador * base;
		}
		System.out.println(acomulador);

	}

}
