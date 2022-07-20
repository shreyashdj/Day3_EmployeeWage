package com.bridgelabz.day3EmpWage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		int wagePerHour = 20;
		int fullDayHours = 8;
		
		 int attendance = (int) (Math.random()*2);		// used random function to get output (0 or 1)
	     
		 /*
		  * 	applied if-else condition to check employee attendance and
		  * 	calculated employee daily wage
		  */
		 
	        if (attendance == 0) {
	            System.out.println("Emloyee is Absent");
	            System.out.println("Daily Employee Wage = 0");
	       } else {
	            System.out.println("Employee is Present");
	        	int dailyWage = wagePerHour * fullDayHours;
	        	System.out.println("Daily Employee Wage = " +dailyWage);
	       }	
		
	}

}
