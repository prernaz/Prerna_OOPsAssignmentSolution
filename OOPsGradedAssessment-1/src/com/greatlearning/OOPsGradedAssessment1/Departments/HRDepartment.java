package com.greatlearning.OOPsGradedAssessment1.Departments;

import com.greatlearning.OOPsGradedAssessment1.MainDriver.*;

public class HRDepartment extends SuperDepartment{
	
	private String departmentName = "Welcome to HR Department";
	private String todaysWork;
	private String workDeadline;  
	private String doActivity = "Team Lunch";
		
	public HRDepartment() 
	{ 
		
	};
	
	/*	Incase we want to initialize values using constructor
* then we can use following lines of code but i have used 
* setter and getter methods instead as strings to pass in the 
* constructor as arguments were very large

	public HRHRDepartment(String departmentName, String todaysWork, String workDeadline, String doActivity) {
		// constructor
		this.departmentName = departmentName;
		this.todaysWork = todaysWork;
		this.workDeadline = workDeadline;
		this.doActivity = doActivity;
	}
*/

	public String getDepartmentName() {
		return departmentName;
	}


/*	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}*/


	public String getTodaysWork() {
		return todaysWork;
	}


	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}


	public String getWorkDeadline() {
		return workDeadline;
	}


	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}


	public String getDoActivity() {
		return doActivity;
	}


/*	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}*/
	
	public String toString() {
		return "\n"+ departmentName + "\n" +doActivity + "\n"+ todaysWork +"\n"
				+ workDeadline+"\n"+isTodayaholiday() ;  
				//isTodayaholiday;
	}
	
	}// End of HR Department Class
