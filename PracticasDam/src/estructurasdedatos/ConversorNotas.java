package estructurasdedatos;

/* (ConversorNotas.java) que convierta las 
calificaciones alfabéticas I,F,B, N y S en calificaciones numéricas 4, 5, 6, 7 y
9 respectivamente. */

//Importamos la funcion Scanner para pedir datos de entrada.

import java.util.Scanner;


public class ConversorNotas {
	
	public static void main(String[] args) {
		//Creamos un objeto tipo Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una letra en mayusculas: ");
		String letra = sc.nextLine();
		
		//System.out.println(letra);
		
	
		
		if(letra.equalsIgnoreCase("I")) {
			System.out.println("Calificacion = 4");
		} 
		else if (letra.equalsIgnoreCase("F")) {
			System.out.println("Calificacion = 5");
		}
		else if (letra.equalsIgnoreCase("B")) {
			System.out.println("Calificacion = 6");
		}
		else if (letra.equalsIgnoreCase("N")) {
			System.out.println("Calificacion = 7");
		}
		else if (letra.equalsIgnoreCase("S")) {
			System.out.println("Calificacion = 9");
		}
		else {
			System.out.println("Esta letra no tiene califcacion");
		}
		
		
	}

}
