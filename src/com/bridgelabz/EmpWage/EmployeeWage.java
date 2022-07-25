package com.bridgelabz.EmpWage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		final int workingDayInMonth = 20;
		final int wagePerHour = 20;
		final int fullDayHours = 8;
		final int partTimeHours = 4;
		final int maxEmpHours = 100;
		int extraHours = 0;
		int totalEmpHours = 0;
		int day = 0;

		 /*
		  * 	used while loop till 20 working days
		  * 	used switch case to
		  * 	check employee attendance.
		  * 	calculated employee monthly wage
		  */
		 
		while (totalEmpHours < maxEmpHours && day < workingDayInMonth) {				
				day++;
		
		 int attendance = (int) (Math.random()*3);		// used random function to get output (0/1/2)
		 
		 switch (attendance) {
		 
		    case 0 : 
		    		System.out.println("\n Day: " + day);
					System.out.println("Employee is Absent & Emp Hour : 0");
		      break;
		    	
		    case 1 :	        
			    	 totalEmpHours += fullDayHours;
			    	 if (totalEmpHours>maxEmpHours) {
						extraHours = fullDayHours;
						break;}
					System.out.println("\n Day: " + day);											
					System.out.println("Employee is Present & Emp Hour : " + fullDayHours);
	          break;
	        	
	       default :
		    	    totalEmpHours += partTimeHours;	
		    	    if (totalEmpHours>maxEmpHours) {
						extraHours = fullDayHours;
						break;}
		    	    System.out.println("\n Day: " + day);
					System.out.println("Employee is Part Time & Emp Hour : " + partTimeHours);     
			}

		}
		 totalEmpHours = totalEmpHours - extraHours;
		 int totalEmpWage = totalEmpHours * wagePerHour;
		 System.out.println("\n Total Employee Hours = " + totalEmpHours);
		 System.out.println(" Monthly Employee Wage = " + totalEmpWage);
	}

}
