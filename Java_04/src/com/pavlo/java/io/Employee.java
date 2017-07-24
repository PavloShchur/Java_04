package com.pavlo.java.io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {
	
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	
	public void mailCheck(){
		System.out.println("Mailing a check to " + name + " " + address);
	}

	public static void main(String[] args) {
		
	}

}
