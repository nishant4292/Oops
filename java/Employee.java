package com.raystech.java;

public class Employee extends PersonOop {
	private String designation;

	public Employee() {
		System.out.println("default emp");
	}

	public Employee(String fn, String ln, String des) {
		super(fn, ln);
		designation = des;
		System.out.println("3 called" + firstname + lastname + designation);
	}

	public static void main(String[] args) {
		Employee e = new Employee(" nishant ", " jain ", " officer ");
	}
}