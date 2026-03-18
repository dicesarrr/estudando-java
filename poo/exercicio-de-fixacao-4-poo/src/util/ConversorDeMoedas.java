package util;

public class ConversorDeMoedas {

	public static double cotacaoDolar;
	public static double quantidadeDolar;
	
	public static double calculoCustoDolar() {
		
		return (cotacaoDolar + cotacaoDolar * 6 / 100) * quantidadeDolar;
		
	}

}
