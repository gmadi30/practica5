package arrays;
import java.util.*;

public class ArrayEnteros {
	
	Scanner entrada = new Scanner(System.in);
	
	private int tamArray;
	private int[] array;
	private int elemArray;
	
	
	public ArrayEnteros() {
		System.out.println("Introduce el size del array: ");
		tamArray = entrada.nextInt();
		array = new int[tamArray];
		elemArray = 0;
		
	}
	
	
	public ArrayEnteros(int tamArray) {
		this.tamArray = tamArray;
		array = new int[tamArray];
		elemArray = 0;
	}
	
	
	public ArrayEnteros(ArrayEnteros copia) {
		tamArray = copia.tamArray;
		array = new int[tamArray];
	}
	
	public void leerArrayFor() {
		int valorUsuario;
		
		for(int i = 0; i < tamArray; i++) {
			System.out.println("Introduce el contenido del Array de size " + tamArray + " o 999 para salir: ");
			valorUsuario = entrada.nextInt();
			if(valorUsuario == 999) {
				i = array.length;
			}
			else {
				array[elemArray] = valorUsuario;
				elemArray++;
				
			}
		}
		
	}
	
	
	
	//Metodo para insertar datos en el array.
	
	public void leerArrayDoWhile(){
		int valorUsuario;
		
		boolean salir = false;
		do {
			System.out.println("Introduce el contenido del Array de size " + tamArray + " o 999 para salir: ");
			valorUsuario = entrada.nextInt();
			
			if (valorUsuario == 999 || (elemArray) == tamArray) {
				salir = true;
			} else {
				array[elemArray] = valorUsuario;
				elemArray++;
			}
			System.out.println(elemArray);
			
		} while(!salir);
		
		

	}
	//Metodo para ver los elementos del array.
	public void verArray() {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	//Inserta un nuevo elemento dentro del array
	
	public void insertarElemento(int dato) {
	
		System.out.println("Introduce la posicion del valor a insertar: ");
		int posicion = entrada.nextInt();
		
		for(int i = array.length - 1; i > posicion - 1; i--) {
			
			array[i] = array[i-1];
		}
		
		array[posicion - 1] = dato;
		
	}
	
	
	//Eliminar un elemento de la lista con un bucle FOR.
	
	public void eliminarElemento() {
		
		System.out.println("Que posicion quieres eliminar en el array de " + tamArray + " posciciones: " );
		int posValorEliminar = entrada.nextInt();
		
		if (posValorEliminar > tamArray) {
			System.out.println("El valor a eliminar no se encuentra en la lista.");
		}
		posValorEliminar = posValorEliminar - 1;
		
	
			for(int i = posValorEliminar; i < tamArray; i++) {
				
				array[posValorEliminar] = posValorEliminar + 1;
				elemArray--;
				}
			}
	
	public void busquedaBinaria(int valor) {
		
		//Ordena el array
		
		int variableTemporal;
		
		//Doble bucle for 
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				
				if (array[i] > array[j]) {
					variableTemporal = array[i];
					array[i] = array[j];
					array[i] = variableTemporal;
				}
			}
		}
		
		//Con un solo bucle for 
		
		for(int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i+1]) {
				variableTemporal = array[i];
				array[i + 1] = array[i];
				array[i] = variableTemporal;
			}
		}
		
		// Me muestra el array
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Busca el valor que paso por parametro en el array ordenado
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == valor) {
				System.out.println("El valor " + valor + " se encuentra en la posicion " + i);
			}
		}
		
	}

}
