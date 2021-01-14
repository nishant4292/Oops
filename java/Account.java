package com.raystech.java;

public class Account {
protected String name;
	protected String accounttype;
	protected String address;
    private int accountno;
	public Account() {
		System.out.println("default cons");
	}

	public Account(String name, String accounttype,String address) {
		this();
		this.name = name;
		this.accounttype = accounttype;
        this.address=address;
		System.out.println("cons is called " + name + accounttype +address);

	}

	public Account(String name, String accounttype, String address,int accountno) {
	this(name, accounttype, address);
		this.accountno = accountno;
		System.out.println("cons1 is called " + name + accounttype + address +accountno);

	}

	public static void main(String[] args) {

		Account a = new Account(" nishant ", " saving ", " indore ",52368);
	}
}
