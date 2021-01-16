package estructurasdedatos;
import java.util.*;
public class Cajero {

	public static void main(String[] args) {
		
		/* Dibujar un diagrama de flujo que represente tres intentos
		de un cajero para acertar el pin y entrar al ”sistema” o
		”tragarse la tarjeta” */
		
		Scanner entrada = new Scanner(System.in);
		
		 int intentos = 3; 
		 int pinUsuario = 1234;
		 int PIN = 0;
		 
		 do {
			 System.out.println("Introduzca su clave: ");
			 PIN = entrada.nextInt();
			 
			 if (PIN == pinUsuario) {
				 System.out.println("PIN correcto, entrando al sistema.");	
			 }
			 if (PIN != pinUsuario) {
				 System.out.println("PIN incorrecto, vuelve a intentarlo.");
				 intentos--;
			 }
			 if (intentos == 0) {
				 System.out.println("Has alcanzando el numero maximo de intentos. Tragando tarjeta.");
			 }
		 } while(PIN != pinUsuario && intentos != 0);
		 
	}

}
