package com.bridgelabz.EmpWage;

import java.util.Scanner;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		Calculation tata = new Calculation();
		Calculation reliance = new Calculation();
		Calculation mahindra = new Calculation();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n 1) Tata \n 2) Mahindra \n 3) Reliance");
		System.out.println("Choose company from above");
		int company = scan.nextInt();
		
		
		
		switch (company) {
		
		case 1 -> tata.cal(15, 6, 3, 50, 15);

		case 2 -> mahindra.cal(20, 8, 4, 75, 20);

		case 3 -> reliance.cal(25, 10, 5, 100, 25);

		default -> System.out.println("Entered option is invalid");

		}

scan.close();
	}

}
