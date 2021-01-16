package estructurasdedatos;

/*que visualice en pantalla un triángulo pitagórico. La base tiene que
tener igual número de caracteres que la altura.*/ 

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		
	}
}
	
