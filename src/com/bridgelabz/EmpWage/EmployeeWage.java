package com.bridgelabz.EmpWage;

import java.util.Scanner;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		Calculation tata = new Calculation(15, 6, 3, 50, 15);
		Calculation mahindra = new Calculation(20, 8, 4, 75, 20);
		Calculation reliance = new Calculation(25, 10, 5, 100, 25);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n 1) Tata \n 2) Mahindra \n 3) Reliance");
		System.out.println("Choose company from above");
		int company = scan.nextInt();
		
		
		
		switch (company) {
		
		case 1 -> tata.cal();

		case 2 -> mahindra.cal();

		case 3 -> reliance.cal();

		default -> System.out.println("Entered option is invalid");

		}

scan.close();
	}

}
