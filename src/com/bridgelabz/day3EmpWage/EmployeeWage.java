package com.bridgelabz.day3EmpWage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		final int workingDayInMonth = 20;
		final int wagePerHour = 20;
		final int fullDayHours = 8;
		final int partTimeHours = 4;
		int day = 0;
		int totalEmpHours = 0;
		
		 /*
		  * 	used while loop till 20 working days
		  * 	used switch case to
		  * 	check employee attendance.
		  * 	calculated employee monthly wage
		  */
		
		while (day < workingDayInMonth) {				
				day++;
		
		 int attendance = (int) (Math.random()*3);		// used random function to get output (0/1/2)
		 
		 switch (attendance) {
		 
		    case 0 : 
		    		System.out.println("\n Day: " + day);
					System.out.println("Employee is Absent & Emp Hour : 0");
		      break;
		    	
		    case 1 :	        
			    	 totalEmpHours += fullDayHours;	
					System.out.println("\n Day: " + day);
					System.out.println("Employee is Present & Emp Hour : " + fullDayHours);
	          break;
	        	
	       default :
		    	    totalEmpHours += partTimeHours;	
					System.out.println("\n Day: " + day);
					System.out.println("Employee is Part Time & Emp Hour : " + partTimeHours);     
			}

		}
		 int totalEmpWage = totalEmpHours * wagePerHour;
		 System.out.println("\n Total Employee Hours = " + totalEmpHours);
		 System.out.println(" Monthly Employee Wage = " + totalEmpWage);
	}

}
