package proyectoDiciembre;

public class CCuentaCorrienteConIn extends CCuentaCorriente{
 
	public CCuentaCorrienteConIn(double importePorTrans, int transExentas, String nombreTitular, String numCuenta, double saldo, double tipoInteres) {
		super(importePorTrans, transExentas, nombreTitular, numCuenta, saldo, tipoInteres);
	}
	

	
	
	public double intereses() {
		double interesMensual = 0;
		if (saldo >= 300000) {
			interesMensual = saldo * (tipoInteres/100);
			saldo += interesMensual;
			return saldo;
		} 
		else {
			System.out.println("El saldo minimo para esta cuenta es de 300000, interes no aplicable. ");
			return 0.0;
		}
		
	}
}
 