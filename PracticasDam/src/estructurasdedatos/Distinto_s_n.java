package estructurasdedatos;

//Pide al usuario que introduzca una respuesta hasta que tecle una ‘s’ o un ‘n’. Si la respuesta es
//distinta de esas letras imprime un mensaje de error y vuelves a introducir la respuesta.

import java.util.Scanner;

public class Distinto_s_n {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in); 
		Boolean respValida = false;
		
	
		while(!respValida) {
			System.out.println("Introduzca una n o s: ");
			char respuestaUsuario = entrada1.next().charAt(0);
			if (respuestaUsuario == 'n' || respuestaUsuario == 's') {
				System.out.println("Respuesta correcta");
				respValida = true;
				System.out.println("Fin de programa.");
			} 
			else {
				System.out.println("Respuesta Incorrecta!");
			}

	
			
		}
	}
}

