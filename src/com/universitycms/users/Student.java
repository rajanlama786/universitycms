package com.universitycms.users;

public class Student extends Person {
	String symbol;
	String myClass;
	int rollNo;
	String Subject;
	

	public String getMyClass() {
		return "Intermediate";
	}

	public void setMyClass(String myClass) {
		this.myClass = myClass;
	}


	public static void main(String[] args ) {
		System.out.println("Hello Student");
	}
	
	
}
