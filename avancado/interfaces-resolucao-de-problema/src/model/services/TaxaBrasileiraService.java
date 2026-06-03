package model.services;

public class TaxaBrasileiraService implements TaxaService{

	public double taxa (double quantidade) {
		if (quantidade <= 100) {
			return quantidade * 0.20;
		} else {
			return quantidade * 0.15;
		}
	}
	
}
