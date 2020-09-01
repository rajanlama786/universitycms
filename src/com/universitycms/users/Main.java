package com.universitycms.users;

public class Main {
	
	public static void main( String[] args ) {
		
		//Student s1 =  new Student();
		
		//UnderGraduate s1 =  new UnderGraduate();
		//Graduate s1 =  new Graduate();
		PostGraduate s1 =  new PostGraduate();
		
		System.out.println("Student Details");
		
		s1.setFirstName("Rajan");
		s1.setLastName( "Lama");
		s1.setId(1);
		s1.setAge(31);
		s1.setContact("9860102809");
		
		//System.out.println(s1);
		
		s1.getFirstName();
		s1.getLastName();
		s1.getId();
		s1.getAge();
		s1.getContact();
		
		/** System.out.println(s1); // not working **/

		System.out.println(s1.getId());
		System.out.println(s1.getFirstName());
		System.out.println(s1.getLastName());
		System.out.println(s1.getAge());
		System.out.println(s1.getContact());
		System.out.println(s1.getMyClass());
		
	}

}
