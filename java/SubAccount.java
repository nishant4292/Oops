package com.raystech.java;

public class SubAccount extends Account {
	private String accountno;
	public SubAccount() {
		System.out.println("default cons");
	}
	public SubAccount(String name,String address,String accounttype,String accountno) {
		
		
		System.out.println(super.name);
		System.out.println(super.address);
		System.out.println(super.accounttype);
		this.accountno=accountno;
		
		
	}
	public static void main(String[] args) {
		SubAccount s=new SubAccount("nishant","indore","saving","sbi45632");
	}

}
