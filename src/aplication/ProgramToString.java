package aplication;

import java.util.Locale;
import java.util.Scanner;

import entity.ProductToString;

public class ProgramToString {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		ProductToString product = new ProductToString(name, price, quantity);
		
		
		System.out.println(product);
		
		sc.close();
		}
}
