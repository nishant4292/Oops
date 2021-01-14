package com.raystech.java;

public class SubAccount2  extends Account1{
	private String address;
	private int balance;
	public SubAccount2() {
		System.out.println("default cons");
		
	}
	public SubAccount2(String name,String acctype,String accno,String address,int balance) {
		super(name, accno, acctype);
		this.address=address;
		this.balance=balance;
		System.out.println("5 is called" +name +acctype +accno +address +balance);
	}
public static void main(String[] args) {
	SubAccount2 d= new SubAccount2(" nishant " ," saving " ," sbi258369 " ," indore " ,1000);
}
}
