package com.dio.calculator;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Enter the first value: ");
		a = sc.nextInt();
		System.out.println("Enter the second value: ");
		b = sc.nextInt();
		
		double sum = sum(a, b);
		double subtraction = subtraction(a, b);
		double multiplication = multiplication(a, b);
		double division = division(a, b);
		
		System.out.println("Sum = " + sum);
		System.out.println("Subtraction = " + subtraction);
		System.out.println("Multiplication = " + multiplication);
		System.out.println("Division = " + division);
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static double subtraction(double a, double b) {
		return a - b;
	}
	
	public static double multiplication(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		return a / b;
	}
	
}
