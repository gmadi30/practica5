package estructurasdedatos;

/* Factorial.java) que visualice en pantalla el
factorial de un número. */

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Factorial de: ");
		
		int numero_usuario = entrada.nextInt();
		long factorial = 1;
		
		for (int i = numero_usuario; i > 0; i--) {
			
			//System.out.println(i);
			
			factorial = factorial * i;
			System.out.println(factorial);
			System.out.println();
		}
		System.out.println("Resultado final: ");
		System.out.println(factorial);

	}

}
