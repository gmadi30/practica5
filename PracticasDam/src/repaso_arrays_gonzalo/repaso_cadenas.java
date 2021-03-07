package repaso_arrays_gonzalo;

public class repaso_cadenas {

	public static void main(String[] args) {
		
		String[] array1 = {"Georges", "Gonzalo", "Maria", "Alex"};
		String[] array2 = {"Alvaro", "Cristian", "Pablo", "Mirna"};
		
		ordenacionBurbuja(array1);
		
		System.out.println(array1);
	}

	public static void ordenacionBurbuja(String[] array) {
	
		boolean hayIntercambio;
		
		do {
			hayIntercambio = false;
			for(int i = 0; i < array.length; i++) {
				if(array[i].equalsIgnoreCase(array[i+1])) {
					
				}
			}
			
			
		}while(hayIntercambio);
	}
}
