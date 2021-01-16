package programacionmodular;

import java.util.Scanner;

public class PracticasExamenJava {
	
/*Ejercicio 1*/
/*
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("$");
			}
			System.out.println();
			
		}

	}

}
*/
	
	//Ejercicio2
	/* Introduce el codigo pin (intentos restantes: 3)
	 El programa termina cuando tecleamos el pin correcto o agotamos el número de intentos.
	Utiliza un boolean para representar el suceso asociado a que haya introducido un pin
	correcto.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int intentos = 3;
		boolean salir = false;
		int clave = 1234;
		
		do {
			System.out.println("Introduzca su codigo PIN: ");
			int pin = entrada.nextInt();
			if (pin != clave && intentos <= 3) {
				System.out.println("Clave incorrecta, te quedan " + (intentos-1) + " intentos.");
				intentos--;
				if (intentos == 0) {
					System.out.println("Se te agotaron los intentos, tarjeta bloqueada.");
					salir = intentos == 0;
				}
			} else {
				System.out.println("Clave Correcta!");
				salir = pin == clave;
			}
		} while(!salir);
	*/
	
	/*) Escribe un programita que calcule y viualice el precio medio de un conjunto de precios
introducidos por teclado. La introducción de precios finaliza cuando tecleamos un 0.


Scanner entrada = new Scanner(System.in);
		int sumaPrecios = 0;
		int precios = 0;
		int precioMedio = 0;
		Boolean salir = false;
		
		while(!salir) {
			System.out.println("Introduzca un precio o 0 para salir: ");
			int precio = entrada.nextInt();
			if (precio == 0) {
				System.out.println("Has salido con exito!");;
				salir = precio == 0;
			} else {
				sumaPrecios = sumaPrecios + precio;
				precios++;
			}
			
			
		}
		System.out.println("El precio medio de todos los precios introducidos es: " + (precioMedio = sumaPrecios/precios));
*/
	

	//) Visualice en pantalla el área y perímetro de un rectángulo. Utilice el paso de parámetros por
	// valor y funciones que retornen los resultados.
	
	/*
	
	public static void main(String[] args) {
		System.out.println("Introduce la base: ");
		int base = pedirDato();
		System.out.println("Introduce la altura: ");
		int altura = pedirDato();
		int perimetro = calcularPerimetro(base, altura);
		int area = calcularArea(base, altura);
		imprimir(perimetro,area);
		
	public static int pedirDato() {
		
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	
	public static int calcularPerimetro(int base, int altura) {
		int perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	
	public static int calcularArea(int base, int altura) {
		int area = base * altura;
		return area;
	}
	
	public static void imprimir(int perimetro, int area) {
		System.out.println("El area de el rectangulo es de: " + area + ".El perimetro es de: " + perimetro + ".");
	
	}
*/
	
	//2) Visualice el factorial de un número entero
	
	
		public static void main(String[] args) {	
		
			System.out.println("Introduce un numero entero: ");
			int numero = pedirEntero(); 
			int factorial = factorial(numero);
			verResultado(numero, factorial);
			
		}
		
		
		public static int pedirEntero() {
			
			Scanner entrada = new Scanner(System.in);
			return entrada.nextInt();
			
		}
		
		public static int factorial(int numero) {
			int factorial = 1;
			for (int i = numero; i > 0; i--) {
				factorial = factorial * i;
				}
			return factorial;
		}
		
		
		public static void verResultado(int numero, int factorial) {
			System.out.println("El factorial de " + numero + " es " + factorial);
		}
}
