package com.bridgelabz.day3EmpWage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours = 4;
		
		 int attendance = (int) (Math.random()*3);		// used random function to get output (0/1/2)
	     
		 /*
		  * 	applied if-else condition to check employee attendance and
		  * 	calculated employee daily wage
		  * 	added part time employee & their wage
		  * 	used switch case
		  */
		 
		 switch (attendance) {
		 
		    case 0 : 
		    		System.out.println("Emloyee is Absent");
		    		System.out.println("Daily Employee Wage = 0");
		    	break;
		    	
		    case 1 :	        
	        	int dailyWage = wagePerHour * fullDayHours;
	            	System.out.println("Employee is Present");	        	
	            	System.out.println("Daily Employee Wage = " +dailyWage);
	        	break;
	        	
	       default :
	        	 int dailyWage1 = wagePerHour * partTimeHours;
	        	 System.out.println("Employee is Part Time");
	        	 System.out.println("Daily Employee Wage = " +dailyWage1);	        
			}
	        
	}

}
