package programacionmodular;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 Modificacion para practica GitHub
	 */
	
	/*Calcular la potencia de un numero. Utilizar programacion modular*/

	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		int numeroUsuario = pedirNumero();
		System.out.println("Introduce la potencia: ");
		int exponente = pedirNumero();
		int resultado = calcularPotencia(numeroUsuario, exponente);
		imprimirPotencia(numeroUsuario, exponente, resultado);
		
	}
	
	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	public static int calcularPotencia(int base, int exp) {
		int potencia = 1;
		for (int i = 0; i < exp; i++) {
			potencia = potencia * base;
		}
		return potencia;
	}
	
	public static void imprimirPotencia(int numeroU, int exponente, int resultado) {
		System.out.println("La potencia de " + numeroU + " elevado a la " + exponente + " es = " + resultado + ".");
		
	}

}
