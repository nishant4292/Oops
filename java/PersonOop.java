package com.raystech.java;

public class PersonOop extends Object {
	protected String firstname = null;
	protected String lastname = null;
	private String address = null;

	public PersonOop() {
		super();
		System.out.println("default cons");
	}

	public PersonOop(String fn, String ln) {
		
		firstname = fn;
		lastname = ln;
		System.out.println("2 params constructor is called " +firstname +lastname);
		
	}

	public PersonOop(String fn, String ln, String address) {
        this(fn, ln);
		this.address = address;
		System.out.println("3 params constructor is called" +firstname +lastname +address);
	}

	public static void main(String[] args) {
		PersonOop p = new PersonOop(" nishant " ," jain " ," indore ");
		
		
		

	}
}
