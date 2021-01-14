package com.raystech.java;

public class Account1 {
	private String name;
	private String acctype;
	private String accno;
	public Account1() {
		System.out.println("default cons");
	}
	public Account1(String name,String acctype) {
		this();
		this.name=name;
		this.acctype=acctype;
		System.out.println(" 2 para is called " + name  + acctype);
		
	}
public Account1(String name,String accno,String acctype) {
	this(name, acctype);
	this.accno=accno;
	System.out.println(" 3 para is called " + name  + acctype  + accno);
	
}
public static void main(String[] args) {
	Account1 a=new Account1(" nishant " ," saving" ," sbi258369 ");
}
}
