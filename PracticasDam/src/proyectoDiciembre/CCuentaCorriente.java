package proyectoDiciembre;

public class CCuentaCorriente extends CCuenta {
	
	private int transacciones = 0;
	private double importePorTrans;
	private int transExentas;

	

	public CCuentaCorriente(double importePorTrans, int transExentas, String nombreTitular, String numCuenta, double saldo, double tipoInteres) {
		super(nombreTitular, numCuenta, tipoInteres, saldo );
		this.importePorTrans = importePorTrans;
		this.transExentas = transExentas;
		
	}
	zzz
	public void decrementarTransacciones() {
		transacciones--;
	}

	public double getImportePorTrans() {
		return importePorTrans;
	}

	public void setImportePorTrans(double importePorTrans) {
		this.importePorTrans = importePorTrans;
	}

	public int getTransExentas() {
		return transExentas;
	}

	public void setTransExentas(int transExentas) {
		this.transExentas = transExentas;
	}
	
	public void Ingreso(double monto) {
		super.Ingreso(monto);
		transacciones++;
		
	}
	
	public void Reintegro(double monto) {
		super.Reintegro(monto);
		transacciones++;
	}
	
	public double comisiones() {
		
		if (dia == 1) {		
			saldo = saldo - ((transacciones * importePorTrans));
			transacciones = 0;
		}
		
		return 0.0;
		
	}
	
	public double intereses() {
		double interesMensual = 0;
		double saldoRestante = 0;
		if (dia == 1) {
			if (saldo <= 300000) {
				interesMensual = saldo * 0.005;
				saldo += interesMensual;
			}
			else if (saldo > 300000) {
				interesMensual = 300000 * 0.05;
				saldoRestante = saldo - 300000;
				saldoRestante *= tipoInteres;
				saldo += (saldoRestante + interesMensual);
			}
			return saldo;
		}
		else {
			return 0.0;
		}
	}
}
