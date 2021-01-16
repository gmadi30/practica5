package estructurasdedatos;
//Imprime en pantalla los la suma y producto de los los números del 1 al 5,

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int suma = 0;
		int producto = 1;
		
		for (int i = 1; i < 6; i++) {
				suma = suma + i;
				producto = producto * i;
				
			}
		System.out.println(suma);
		System.out.println(producto);
		}

	}


