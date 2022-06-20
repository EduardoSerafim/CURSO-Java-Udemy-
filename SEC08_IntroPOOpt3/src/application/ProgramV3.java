package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorStatic;


//usando uma classe com métodos estáticos
public class ProgramV3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = CalculatorStatic.circumference(radius);
		
		double v = CalculatorStatic.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", CalculatorStatic.PI);
		
		
		sc.close();

	}

}
