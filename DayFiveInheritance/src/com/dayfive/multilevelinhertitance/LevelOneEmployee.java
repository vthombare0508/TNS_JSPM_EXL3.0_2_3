package com.dayfive.multilevelinhertitance;

public class LevelOneEmployee extends Employee{

	private int noofShares; 
	private String authority;
	
	public LevelOneEmployee(String name, long contactNo, String deptName, long baseSalary, int noofShares,String authority ) {
		super(name, contactNo, deptName, baseSalary);
		
		this.noofShares= noofShares;
		this.authority= authority;
	}

	public int getNoofShares() {
		return noofShares;
	}

	public void setNoofShares(int noofShares) {
		this.noofShares = noofShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee [noofShares=" + noofShares + ", authority=" + authority + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
