package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		
	} 
		
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	
	@Override
	public double tax() {
		double incomeTax = 0;
		double healthTax = 0;
		if(anualIncome < 20000) {
			incomeTax = anualIncome * 0.15;
		}else {
			incomeTax = anualIncome * 0.25;			
		}
		
		if(healthExpenditures > 0) {
			healthTax = healthExpenditures * 0.5; 
		}
		
		return incomeTax - healthTax;
	}

}
