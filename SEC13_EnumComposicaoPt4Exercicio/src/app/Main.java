package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;



public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth data (DD/MM/YYYY): ");
		Date bitrhDate = sdf.parse(sc.next());		
		
		
		Client client = new Client(name, email, bitrhDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How Many itens to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client );
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data\n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(nameProduct, price);
			
			order.addItem(new OrderItem(quantity, price, product));
			
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + sdf2.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println(client);
		System.out.println("Order itens:");
		System.out.println(order);
		System.out.println("Total price: " + order.total());
		

		sc.close();
		
	}

}
