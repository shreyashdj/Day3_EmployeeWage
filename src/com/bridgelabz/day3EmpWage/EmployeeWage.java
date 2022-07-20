package com.bridgelabz.day3EmpWage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		 int attendance = (int) (Math.random()*2);		// used random function to get output (0 or 1)
	     
		 /*
		  * 	applied if-else condition to check employee attendance
		  */
		 
	        if (attendance == 0) {
	            System.out.println("Emloyee is Absent");
	       } else
	            System.out.println("Employee is Present");
		
	}

}
