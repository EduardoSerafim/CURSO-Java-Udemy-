package app;

import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many rooms will be rented? ");
		int roomQuantity = sc.nextInt();
		
		Student[] vect = new Student[10];
		
		for (int i = 1; i < roomQuantity; i++) {
			System.out.printf("Rent #%d:\n", i);
			
			sc.nextLine();			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();			
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Student(name, email, room);
			
			System.out.println();
			
		}
		
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
			
		}
		
		

		
		sc.close();

	}

}
