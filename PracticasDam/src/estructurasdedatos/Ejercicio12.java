package estructurasdedatos;
/*Realizar un pseudocódigo que determine de un
conjunto de 6 números introducidos por teclado cuántos son menores que 15,
cuántos mayores de 55 y cuántos están comprendidos entre 45 y 55.*/

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int numero;
		int menor15 = 0;
		int mayor55 = 0;
		int entre45_55 = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 6; i++) {
			
			System.out.println("Introduce un numero: ");
			numero = entrada.nextInt();
			
			if (numero < 15) {
				menor15++;
			} else if (numero > 45 && numero < 55) {
				entre45_55++;
			} else if (numero > 55){
				mayor55++;
			}
				
		}
		
		System.out.println("Hay " + menor15 + " numeros menores de 15, " + entre45_55 + " numeros entre 45 y 55, y  " + mayor55 + " mayores de 55.");

	}

}
