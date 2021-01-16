package proyectoDiciembre;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;



public abstract class CCuenta {
	
	private String nombreTitular;
	private String numCuenta;
	protected double tipoInteres;
	protected double saldo;
	private Scanner entrada = new Scanner(System.in);
	protected int dia = 1;
	
	
	public CCuenta() {
		
	}



	public CCuenta(String nombreTitular, String numCuenta, double tipoInteres, double saldo) {
		this.nombreTitular = nombreTitular;
		this.numCuenta = numCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
		}

	
	public String getNombreTitular() {
		return nombreTitular;
	}
	
	
	
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	
	
	public String getNumCuenta() {
		return numCuenta;
	}
	
	
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	
	
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	
	
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	public int getDia() {
		return dia;
	}
	
	
	
	public void Ingreso(double monto) {
		
		while(monto < 0) {
			System.out.println("Error, el monto a ingresa no puede ser menor que 0.");
			System.out.println("Vuelva a introducir el monto a ingresar: ");
			monto = entrada.nextDouble();
		}
		
		saldo = saldo + monto;
	
	}
	
	
	public void Reintegro(double monto) {
				
		do {
			if (monto > saldo) {
				System.out.println("Error, la cantidad para retirar es mayor a " + saldo + ". Introduzca una cantidad inferior.");
			} else if (monto < 0) {
				System.out.println("Error, para retirar tiene que ser mayor a 0.");
			}
			System.out.println("Introduzca nuevamente el monto a retirar: ");
			monto = entrada.nextDouble();
			
		} while(monto > saldo || monto < 0);
		
		saldo = saldo - monto;
		
	}
	
	public abstract double comisiones();
	
	public abstract double intereses();
	}
