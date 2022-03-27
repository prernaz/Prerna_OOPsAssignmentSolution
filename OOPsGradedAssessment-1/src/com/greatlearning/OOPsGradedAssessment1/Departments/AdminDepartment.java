package com.greatlearning.OOPsGradedAssessment1.Departments;

import com.greatlearning.OOPsGradedAssessment1.MainDriver.*;

public class AdminDepartment extends SuperDepartment{
	
	private String departmentName = "Welcome to Admin Department";
	private String todaysWork;
	private String workDeadline;

	public AdminDepartment() 
	{ 
		
	};
	
/*	To initialize values using constructor
*  we can use following lines of code but i have used 
* setter and getter methods instead as i feel strings 
* very long to be passed in the constructor as arguments

 public AdminDeptt(String departmentName, String todayswork, String workDeadline)
	{
	    this.departmentName = departmentName;
		this.todayswork = todayswork;
		this.workDeadline = workDeadline;
		
	} */
	
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

	
	public String toString() {
		return "\n"+ departmentName + "\n" + todaysWork +"\n"
				+ workDeadline+ "\n"+ isTodayaholiday();
	}
}
