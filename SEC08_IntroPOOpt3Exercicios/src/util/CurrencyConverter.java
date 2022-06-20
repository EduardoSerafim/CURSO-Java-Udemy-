package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double price, double amount) {
		return price * amount * (1 + IOF);
	}
	
}
