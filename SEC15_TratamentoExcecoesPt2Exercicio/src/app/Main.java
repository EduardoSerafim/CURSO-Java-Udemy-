package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.next();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();		
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
						
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		
		sc.close();
	}

}
