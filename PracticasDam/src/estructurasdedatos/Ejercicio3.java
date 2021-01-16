package estructurasdedatos;

public class Ejercicio3 {

	public static void main(String[] args) {
	
	//Programa que calcula los primeros 5 numeros imapares y muestra su producto.
		
		int producto = 1;
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 1) {
				producto = producto * i;
				System.out.println(i);
				
			}
		}
		System.out.println(producto);
		
	}

}