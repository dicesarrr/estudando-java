package entities;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double area() {
		
		double areaRetangulo = largura * altura;
		return areaRetangulo;
		
	}
	
	public double perimetro() {
		
		double perimetroRetangulo = (largura * 2) + (altura * 2);
		return perimetroRetangulo;
		
	}
	
	public double diagonal() {
		
		double diagonalRetangulo = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
		return diagonalRetangulo;
		
	}
	
	public String toString() {
		
		return "AREA: " + String.format("%.2f%n", area()) + "PERIMETRO: " + String.format("%.2f%n", perimetro()) + "DIAGONAL: " + String.format("%.2f%n", diagonal());
		
		
	}
	
}
