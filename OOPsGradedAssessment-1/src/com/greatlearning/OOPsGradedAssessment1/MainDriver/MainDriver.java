package com.greatlearning.OOPsGradedAssessment1.MainDriver;

import com.greatlearning.OOPsGradedAssessment1.Departments.*;

public class MainDriver {

	public static void main(String[] args) { 
	
	// create objects
		
	SuperDepartment superDepartment = new SuperDepartment();
	AdminDepartment adminDepartment  = new AdminDepartment();
	HRDepartment hrDepartment = new HRDepartment();
	TechDepartment techDepartment = new TechDepartment();
	
	//I m using setter methods to set values which may be set from outside 
	//their classes. e.g in Class SuperDepartment variables departmentname 
	//and holiday may not be required to be set
	// from outside class so they are declared 
	//as private local variables in the resp. class 
	//other two variables i am setting here
	//Similarly for other classes also
	

	superDepartment.setTodaysWork("No work as of now");
	superDepartment.setWorkDeadline("Nil");
	 
	adminDepartment.setTodaysWork("Complete your Document Submission");
	adminDepartment.setWorkDeadline("Complete by EOD");
	
	hrDepartment.setTodaysWork("Fill Todays Worksheet and mark your attendance");
	hrDepartment.setWorkDeadline("Complete by EOD");
	
	techDepartment.setTodaysWork("Complete coding of module1");
	techDepartment.setWorkDeadline("Complete by EOD");
	techDepartment.setTechStackInformation("corejava");
	
	
	//get and print functionalities of admindepartment
	// HRdepartment and TechDepartment respectively

	System.out.println(adminDepartment.toString());
	
	System.out.println(hrDepartment.toString());
		
	System.out.println(techDepartment.toString());
	
		}
}
	
/*Comment section - alternate ways of program writing
 * Point 1
 * In the program above i have replaced so many println statements
  given below by toString method to reduce a lengthy code.
  get and print functionalities of adminDepartment

	System.out.println(adminDepartment.getDepartmentName());
	System.out.println(adminDepartment.getTodaysWork());
	System.out.println(adminDepartment.getWorkDeadline());
	System.out.println(adminDepartment.getIsTodayaholiday());
	System.out.println();
	
	//get and print functionalities of HR Department
	
	System.out.println(hrDepartment.getDepartmentName());
	System.out.println(hrDepartment.getTodaysWork());
	System.out.println(hrDepartment.getWorkDeadline());
	System.out.println(hrDepartment.getDoActivity());
	System.out.println(hrDepartment.getIsTodayaholiday());
	System.out.println();
	
	// get and print functionalities of Tech Department
	
	System.out.println(techDepartment.getDepartmentName());
	System.out.println(techDepartment.getTodaysWork());
	System.out.println(techDepartment.getWorkDeadline());
	System.out.println(techDepartment.getTechStackInformation());
	System.out.println(techDepartment.getIsTodayaholiday());
	
	*/

/*  2.alternate way use parameterized Constructors
 * WE can create objects and initialize constructor in way given below,
 * however, this list of argument consists of very long strings
 * so instead in my program i have used setter method to set values */
 /* 
 	
   SuperDepartment superDepartment = new SuperDepartment("Welcome to Super Department","nil" ,"No work as of now","Today is not a holiday");
  
	AdminDepartment adminDepartment  = new AdminDepartment("Welcome to Admin Department", "Complete your Document Submission", "Complete by EOD");
	
	HRDepartment hrDepartment = new HRDepartment(Welcome to HR Department", "Fill Todays Worksheet and mark your attendance", "Complete by EOD","Team Lunch");
	
	TechDepartment techDepartment = new TechDepartment("Welcome to Tech Department", "Complete coding of module1", "Complete by EOD", "corejava");
	
*/