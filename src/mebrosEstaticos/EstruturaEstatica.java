package mebrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class EstruturaEstatica {
	
	public static final double PI = 3.14159; // static, main= metodo :: PI = constante

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference (radius);
		double v = Calculator.volume (radius);
		
		System.out.printf("Circumrence: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
		
		sc.close();

	}
	
	public static double circumference (double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume (double radius) {
		return 4.0 * PI * radius * radius * radius /3.0;
	}
}
