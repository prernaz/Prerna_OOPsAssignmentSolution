package com.greatlearning.OOPsGradedAssessment1.Departments;


import com.greatlearning.OOPsGradedAssessment1.MainDriver.*;

public class TechDepartment extends SuperDepartment {
	
	private String departmentName = "Welcome to Tech Department";
	private String todaysWork;
	private String workDeadline;
	private String techStackInformation;

	public TechDepartment()
	{
		
	};
	
	/* we can also initialize values by passing 
	 strings as constructor arguments but since 
	 the strings are very long so setter and getter 
	 methods used instead.

	public TechDeptt(String departmentName, String todayswork, String workDeadline, String techStackInformation) {
		// constructor
		this.departmentName = departmentName;
		this.todayswork = todayswork;
		this.workDeadline = workDeadline;
		this.techStackInformation = techStackInformation;
	}*/
	
	
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

	public String getTechStackInformation() {
		return techStackInformation;
	}

	public void setTechStackInformation(String techStackInformation) {
		this.techStackInformation = techStackInformation;
	}
	
	public String toString() {
		return "\n"+ departmentName + "\n" + todaysWork +"\n"
				+ workDeadline + "\n"  + techStackInformation +"\n"+isTodayaholiday();
				//isTodayaholiday;
	}
	
}