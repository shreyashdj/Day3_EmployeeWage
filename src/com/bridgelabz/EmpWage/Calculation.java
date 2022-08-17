package com.bridgelabz.EmpWage;

/*
 * @author SHREYASH JADHAV
 */
public class Calculation {
	
	public void cal (int wagePerHour, int fullDayHours, int partTimeHours, int maxEmpHours, int workingDayInMonth) {
	
		System.out.println("\n wagePerHour : " + wagePerHour
				+ "\n fullDayHours : " + fullDayHours
				+ "\n partTimeHours : " + partTimeHours
				+ "\n maxEmpHours : " + maxEmpHours
				+ "\n workingDayInMonth : " + workingDayInMonth);

	int totalEmpHours = 0;
	int day = 0;
	
	 /*
	  * 	used while loop till max working days or max hours
	  * 	used switch case to
	  * 	check employee daily attendance & wage
	  */
	
	while (totalEmpHours < maxEmpHours && day < workingDayInMonth) {
		 day++;
		 
		 int attendance = (int) (Math.random()*3);		// used random function to get output (0/1/2)
		 
		 switch (attendance) {
		 
//		    case 0 : 
//		    		System.out.println("\n Day: " + day);
//					System.out.println("Employee is Absent & Emp Hour : 0");
//		      break;
		    	
		    case 1 :	        
			    	 totalEmpHours += fullDayHours;
			    	 if (totalEmpHours > maxEmpHours) {
			    		 totalEmpHours -= fullDayHours;
						break;
						}
//					System.out.println("\n Day: " + day);											
//					System.out.println("Employee is Present & Emp Hour : " + fullDayHours);
	          break;
	        	
	       default :
		    	    totalEmpHours += partTimeHours;	
		    	    if (totalEmpHours > maxEmpHours) {
		    	    	totalEmpHours -= fullDayHours;
						break;
						}
//		    	    System.out.println("\n Day: " + day);
//					System.out.println("Employee is Part Time & Emp Hour : " + partTimeHours);     
			}
		}
		
		int totalEmpWage = totalEmpHours * wagePerHour;
		System.out.println("\n Total Working Days : " +day +" & Total Employee Hours : " + totalEmpHours);
		System.out.println(" Monthly Employee Wage : " + totalEmpWage);

	}
}
