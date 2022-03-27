package com.greatlearning.OOPsGradedAssessment1.Departments;

import com.greatlearning.OOPsGradedAssessment1.MainDriver.*;

public class SuperDepartment {

	private String departmentName ="Welcome to Super Department";
	private String todaysWork;
	private String workDeadline;
	private static String isitaholiday = "Today is not a holiday"; 
	
	public SuperDepartment() {

	}

/*	public SuperDeptt(String departmentName, String todayswork, String workDeadline, String isTodayaholiday) {
		// constructor
		this.departmentName = departmentName;
		this.todaysWork = todaysWork;
		this.workDeadline = workDeadline;
		this.isTodayaholiday = isTodayaholiday;
	}*/

	public String getDepartmentName() {
		return departmentName;
	}

/*	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
*/
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

	public String isTodayaholiday() {
		return isitaholiday;
	}

/*	public void setIsTodayaholiday(String isTodayaholiday) {
		this.isTodayaholiday = isTodayaholiday;
	}*/

	
	@Override
	public String toString() {
		return "\n"+ departmentName + "\n" + todaysWork +"\n"
				+ workDeadline + "\n" + isTodayaholiday() +"\n";
	}
}