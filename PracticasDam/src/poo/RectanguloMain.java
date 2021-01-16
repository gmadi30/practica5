package poo;

public class RectanguloMain {

	public static void main(String[] args) {
		
		//Crear el objeto rectangulo1 por paso de parametros.
		
		Rectangulo rectangulo1 = new Rectangulo(8, 10);
		
		System.out.println("Rectangulo1 con base " + rectangulo1.getBase() + " y altura " + rectangulo1.getAltura());
		
		//Crear el objeto rectangulo2 por paso de parametros.
		
		Rectangulo rectangulo2 = new Rectangulo(15, 70);
		
		System.out.println("Rectangulo2 con base " + rectangulo2.getBase() + " y altura " + rectangulo2.getAltura());
		
		//Crea un ojbeto rectangulo3 con valores por defecto
		
		Rectangulo rectangulo3 = new Rectangulo();
		
		System.out.println("Rectangulo3 con base " + rectangulo3.getBase() + " y altura " + rectangulo3.getAltura());
		
		
		//Modificamos la base de el rectangulo2
		rectangulo2.setBase(100);
		rectangulo2.setAltura(20);
		
		System.out.println();
		System.out.println("Rectangulo2 modificado");
		System.out.println("Rectangulo2 con base " + rectangulo2.getBase() + " y altura " + rectangulo2.getAltura());
		
		//calculamos el area de uno de los rectangulos
		
		System.out.println();
		System.out.println("El area de el rectangulo1 es de: " + rectangulo1.getArea());
		
		//crear un objeto rectangulo4 que va a ser coopia del rectangulo1
		
		Rectangulo rectangulo4 = new Rectangulo(rectangulo1);
		
		System.out.println();
		System.out.println("Rectangulo4 con base " + rectangulo4.getBase() + " y altura " + rectangulo4.getAltura());
		
		//Calculamos el perimetro de rectangulo3
		System.out.println();
		System.out.println("El permietro del rectangulo3 con base " + rectangulo3.getBase() + " y altura " + rectangulo3.getAltura() + " es de " + rectangulo3.getPerimetro());
	}

}
