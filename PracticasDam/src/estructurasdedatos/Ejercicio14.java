package estructurasdedatos;

/* (Calculadora.java) que introduzca dos números
por teclado y mediante un menú calcule y visualice su suma, resta,
multiplicación y división. Utilice un interruptor que valide la opción. En caso
de que hay elegido la opción de dividir, visualice en pantalla un mensaje
indicando que no se puede dividir por cero cuando el operando2 sea 0 que,
así mismo y mediante otro interruptor denominado imprimir evite la
visualización del resultado si se da este hecho. */

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Variables que voy a utilizar
		
		float numero1;
		float numero2; 
		float resultado = 0;
		int opcionUsuario;
		
		//Declaro iniciar false porque no ha iniciado el programa
		boolean iniciar = false;
		
		// Le indico al usuario que el programa inicia.
		System.out.println("Inicio de programa: ");
		
		//La condicion del buble es que iniciar(false) se vuelve cierto porque la calculadura empieza.
		while (!iniciar) {
		
			
			// Pido los dos valores que quiere utilizar.
			System.out.println("Introduce el primer operando: ");
			numero1 = entrada.nextFloat();
			System.out.println("Introduce el segundo operando: ");
			numero2 = entrada.nextFloat();
			
			//Pido la opcion que desea realiar
			System.out.println("Selecciona una opcion: ");
			System.out.println("1) Sumar, 2) Restar, 3) Multiplicar, 4) Dividir, 5) Salir");
			opcionUsuario = entrada.nextInt();
			
			if (opcionUsuario == 1){
				resultado = numero1 + numero2; 
				System.out.println(resultado);
			} else if (opcionUsuario == 2) {
				resultado = numero1 - numero2;
				System.out.println(resultado);
			} else if (opcionUsuario == 3) {
				resultado = numero1 * numero2;
				System.out.println(resultado);
			} else if (opcionUsuario == 4 && numero2 != 0) {
				resultado = numero1 / numero2;
				System.out.println(resultado);
			} else if (opcionUsuario == 4 && numero2 == 0) {
				System.out.println("Error, el segundo operando no puede ser 0.");
				
			} else if (opcionUsuario == 5){
				iniciar = true;
				
			} else {
				System.out.println("Opcion no valida.");
			}
			
		}
		System.out.println("Fin de programa.");
	}
}