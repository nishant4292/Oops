package com.raystech.java;

public class ProfesionalMan implements CurrentAccount,Human {

	@Override
	public void firstname() {
		System.out.println("nishant");
		
	}

	@Override
	public void lastname() {
		System.out.println("jain");
		
	}

	@Override
	public void dob() {
		System.out.println("10/01/1992");
		
	}

	@Override
	public void address() {
		System.out.println("indore");
		
	}

	@Override
	public void gender() {
		System.out.println("male");
		
	}

	@Override
	public void accountno() {
		System.out.println(772310);
		
	}

	@Override
	public void mobileno() {
		System.out.println(956011314);
		
	}

	@Override
	public void bank() {
	System.out.println("bank of india");
		
	}
public static void main(String[] args) {
	ProfesionalMan p =new ProfesionalMan();
	p.accountno();
	p.address();
	p.bank();
	p.dob();
	p.firstname();
	p.gender();
	p.lastname();
	p.mobileno();
}
}
