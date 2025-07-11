package com.tnsif.dayfour.accessmodifiers;

public class Base {
	
	// Declaring default, public, private and protected variables
	
	int varDefault= 10;
	public int varPublic=20;
	private int varPrivate=30;
	private int varProtected=40;
	
	// Declaring default, public, private and protected methods
	
	void methodDefault()
	{
		System.out.println("Default Access Modifier");
		System.out.println("Default Variable"+ varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Access Modifier");
		System.out.println("Public Variable"+ varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private Access Modifier");
		System.out.println("Private Variable"+ varPrivate);
	}
	
    protected void methodProtected()
	{
		System.out.println("Protected Access Modifier");
		System.out.println("Protected Variable"+ getVarProtected());
	}

	public int getVarProtected() {
		return varProtected;
	}

	public void setVarProtected(int varProtected) {
		this.varProtected = varProtected;
	}
	

}
