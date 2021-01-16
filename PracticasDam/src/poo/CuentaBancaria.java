package poo;

import java.util.Scanner;


public class CuentaBancaria {
	
	//Declaracion de variables
	
	private String nombreTitular;
	private String tipoInteres;
	private double saldo;
	private Scanner entrada = new Scanner(System.in);	
	
	//Creacion de metodos constructores
	
	public CuentaBancaria() {
		System.out.println("Introduzca el saldo: ");
		saldo = entrada.nextDouble();
		System.out.println("Introduzca el nombre del titular: ");
		nombreTitular = entrada.next();
		System.out.println("Introduzca el portenciaje de interes de interes: ");
		tipoInteres = entrada.next();
	}

	/*public CuentaBancaria() {
		this.nombreTitular = nombreTitular;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo; 
	}*/
	
	public CuentaBancaria(String nombreTitular, String tipoInteres, double saldo) {
		this.nombreTitular = nombreTitular;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	//Metodos getters
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNombre() {
		return nombreTitular;
	}
	
	public String getTipoInteres() {
		return tipoInteres;
	}
	
	//Metodos setters
	
	public void Ingreso() {
		
		double monto_usuario = 0;
		
		do {
			System.out.println("Introduce la cantidad a ingresar: ");
			monto_usuario = entrada.nextDouble();
			if (monto_usuario < 0) {
				System.out.println("Error, introduzca una cantidad mayor a 0.");
				
			}
		} while(monto_usuario < 0);
		
		saldo = saldo + monto_usuario;
	
	}
	
	public void Reintegro() {
		
		double monto_usuario = 0;
		
		do {
			System.out.println("Introduce la cantidad a retirar: ");
			monto_usuario = entrada.nextDouble();
			if (monto_usuario > saldo) {
				System.out.println("Error, la cantidad para retirar es mayor a " + saldo + ". Introduzca una cantidad inferior.");
			} else if (monto_usuario < 0) {
				System.out.println("Error, para retirar tiene que ser mayor a 0.");
				
			}
		} while(monto_usuario > saldo || monto_usuario < 0);
		
		saldo = saldo - monto_usuario;
		
	}
	
	public void Interes() {
		System.out.println("Elija un tipo de interes \n 1) Fijo \n 2) Variable \n 3) Mixto)");
		int opcion = entrada.nextInt();
	
		switch(opcion) {
		case 1:
			tipoInteres = "fijo";
			break;
		case 2:
			tipoInteres = "variable";
			break;
		case 3:
			tipoInteres = "mixto";
			break;
			
		}
		
		
	}
	

}