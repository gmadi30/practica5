package poo;

public class Rectangulo {
	
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		
		this.base = base;
		this.altura = altura; 
	
	}
	
	public Rectangulo() {
		this.base = 10;
		this.altura = 5;
	}
	
	public Rectangulo(Rectangulo copia) {
		
		base = copia.base;
		altura = copia.altura;
		
		
	}
	
	
	// Metodos getters
	
	public int getBase() {
		return base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int getArea() {
		return base * altura;
	}
	
	public int getPerimetro() {
		return (2*base) + (2*altura);
	}
	
	// Metodos setters
	
	public void setBase(int base) {
		this.base = base;
		
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
		
	}
	
	
	
	
	
	

}
