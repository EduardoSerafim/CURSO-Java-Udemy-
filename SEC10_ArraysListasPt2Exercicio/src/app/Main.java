package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Employee #%d:\n", i);

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			System.out.println();
			
			list.add(new Employee(id, name, salary));
			
		}
		
		System.out.printf("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		
		
		Employee findedEmployee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(findedEmployee == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			findedEmployee.raiseSalary(percentage);
		}
		
		System.out.println();

		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		
		
		
		sc.close();
	}

}
