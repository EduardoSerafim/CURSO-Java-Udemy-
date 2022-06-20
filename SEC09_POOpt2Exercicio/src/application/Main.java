package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		Account account = new Account();
		
		if(option == 'y') {
			System.out.printf("Enter initial deposit value:");
			double deposit= sc.nextDouble();
			account = new Account(number, name, deposit);
		}else {
			account = new Account(number, name);
			
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		
		System.out.printf("Enter a deposit value:");
		double deposit = sc.nextDouble();
		
		account.toDeposit(deposit);
		
		System.out.println("Updtade account data:");
		System.out.println(account);
		
		System.out.println();

		System.out.printf("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		
		account.toWithdraw(withdraw);
		
		System.out.println("Updtade account data:");
		System.out.println(account);
		
		
		sc.close();
		
		
	}

}
