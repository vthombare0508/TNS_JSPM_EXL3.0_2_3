package com.dayfive.multilevelinhertitance;

public class Employee extends Person{
	
	private String deptName;
	private long baseSalary;
	
	
	public Employee(String name, long contactNo, String deptName, long baseSalary) {
		super(name, contactNo);
		this.deptName= deptName;
		this.baseSalary= baseSalary;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public long getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(long baseSalary) {
		this.baseSalary = baseSalary;
	}


	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", baseSalary=" + baseSalary + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	

}
