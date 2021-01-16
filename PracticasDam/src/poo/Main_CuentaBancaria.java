package poo;

public class Main_CuentaBancaria {

	public static void main(String[] args) {
		
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		
		cuentaBancaria.Interes();
		
		System.out.println(cuentaBancaria.getNombre() + " tiene un saldo en su cuenta de: " + cuentaBancaria.getSaldo() + "$, con un interes de tipo " 
		+cuentaBancaria.getTipoInteres() + ".");

	}
}
