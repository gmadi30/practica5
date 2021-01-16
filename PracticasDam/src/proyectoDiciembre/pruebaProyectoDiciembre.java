package proyectoDiciembre;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class pruebaProyectoDiciembre{

public static void main(String[] args) throws IOException {
	
	GregorianCalendar calendar = new GregorianCalendar();

	/* CCuentaAhorro cliente01 = new CCuentaAhorro("Angel Lillo", "111/6666", 10000, 3.5, 30);
	
	System.out.println(cliente01.getNombreTitular());
	System.out.println(cliente01.getNumCuenta());
	System.out.println(cliente01.getSaldo());
	System.out.println(cliente01.getTipoInteres());
	cliente01.intereses();
	cliente01.comisiones();
	System.out.println(cliente01.getSaldo());
	*/
	
	/*
	CCuentaCorriente cliente01 = new CCuentaCorriente(10.0, 5, "Angel Lillo", "111/6666", 10000, 3.5);
	System.out.println(cliente01.getNombreTitular());
	System.out.println(cliente01.getNumCuenta());
	System.out.println(cliente01.getSaldo());
	System.out.println(cliente01.getTipoInteres());
	cliente01.intereses();
	//cliente01.Ingreso(1000);
	//cliente01.comisiones();
	System.out.println(cliente01.getSaldo());
	
	*/
	
	
	CCuentaCorrienteConIn cuenta01 = new CCuentaCorrienteConIn(10.0, 5, "Angel Lillo", "111/6666", 10000, 3.5);
	System.out.println(cuenta01.getSaldo());
	cuenta01.intereses();

	}

}
