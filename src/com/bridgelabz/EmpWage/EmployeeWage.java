package com.bridgelabz.EmpWage;

public class EmployeeWage {
	
	final static int workingDayInMonth = 20;
	final static int wagePerHour = 20;
	final static int fullDayHours = 8;
	final static int partTimeHours = 4;
	final static int maxEmpHours = 100;
	static int extraHours = 0;
	static int totalEmpHours = 0;
	static int day = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Calculation");
		
		// used while loop till 20 working days or 100 hours
		while (totalEmpHours < maxEmpHours && day < workingDayInMonth) {
			dailyCalculation();
		}
		
		monthlyCalculation();
	}
	
	public static void dailyCalculation() {
		
		 /*
		  * 	used switch case to
		  * 	check employee daily attendance & wage
		  */
		
		 day++;
		 int attendance = (int) (Math.random()*3);		// used random function to get output (0/1/2)
		 
		 switch (attendance) {
		 
		    case 0 : 
		    		System.out.println("\n Day: " + day);
					System.out.println("Employee is Absent & Emp Hour : 0");
		      break;
		    	
		    case 1 :	        
			    	 totalEmpHours += fullDayHours;
			    	 if (totalEmpHours > maxEmpHours) {
						extraHours = fullDayHours;
						break;
						}
					System.out.println("\n Day: " + day);											
					System.out.println("Employee is Present & Emp Hour : " + fullDayHours);
	          break;
	        	
	       default :
		    	    totalEmpHours += partTimeHours;	
		    	    if (totalEmpHours > maxEmpHours) {
						extraHours = fullDayHours;
						break;
						}
		    	    System.out.println("\n Day: " + day);
					System.out.println("Employee is Part Time & Emp Hour : " + partTimeHours);     
			}
		 
	}
	
	public static void monthlyCalculation() {
		
		// calculated employee total hours & monthly wage
		
		totalEmpHours = totalEmpHours - extraHours;
		int totalEmpWage = totalEmpHours * wagePerHour;
		System.out.println("\n Total Employee Hours = " + totalEmpHours);
		System.out.println(" Monthly Employee Wage = " + totalEmpWage);
	}

}
