package poo;

import java.io.IOException;
import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		char e = 'Z';
		
		Character letra = new Character('A');
		
		//System.out.println(letra);
		
		System.out.println("Introduce un caracter: ");
		
		char letraIntroducida = (char) System.in.read();
		
	
		if (Character.isDigit(letraIntroducida)) {
			System.out.println("La letra introducida es un numero.");
		}
		else if (Character.isLowerCase(letraIntroducida)) {
			letraIntroducida = Character.toUpperCase(letraIntroducida);
			System.out.println("La letra " + letraIntroducida + " es miniscula.");
			System.out.println(letraIntroducida);
		} else {
			System.out.println("La letra " + letraIntroducida + " es mayuscula.");
			letraIntroducida = Character.toLowerCase(letraIntroducida);
			System.out.println(letraIntroducida);
		}
	}
}
