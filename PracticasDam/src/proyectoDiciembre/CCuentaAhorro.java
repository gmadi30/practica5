package proyectoDiciembre;

public class CCuentaAhorro extends CCuenta {

	private double cuotaMantenimiento;


	public CCuentaAhorro(String nombreTitular, String numCuenta, double saldo,  double tipoInteres, double cuotaMantenimiento) {
		super(nombreTitular, numCuenta,  tipoInteres , saldo);
		this.cuotaMantenimiento = cuotaMantenimiento;
	}


	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}


	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;

	}
	
	
	public double comisiones() {
		if (dia == 1) {
			saldo = saldo - cuotaMantenimiento;
		}
		return 0.0;
	}
	
	public double intereses() {
		double interesMensual = 0;
		if (dia == 1) {
			interesMensual = saldo * (tipoInteres / 100);
			saldo += interesMensual;
			
			}
		return 0.0;
	
	}
}
