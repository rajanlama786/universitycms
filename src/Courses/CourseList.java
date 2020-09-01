package Courses;

import java.util.ArrayList;

public class CourseList {
	
	private ArrayList<String> courseList = new ArrayList<String>();
	
	public void addCourseBook( String item) {
		courseList.add(item);
	}

	public void printCourseBook() {
		System.out.println("You have " + courseList.size() + " books in your course list");
		for( int i=0; i<courseList.size(); i++) {
			System.out.println((i+1) + ". " + courseList.get(i));
		}
	}
	
	public void modifyCourseBook( int position, String newItem) {
		courseList.set(position, newItem);
		System.out.println("You have " + courseList.size() + " books in your course list");
	}
	
	public void removeCourseBook( int position) {
		String theCourse = courseList.get(position);
		courseList.remove(position);
		
		//science
		//mgmt
		//humanity
		//education
	}
	
	public String findCourseItem( String searchCourseItem ) {
		//boolean exists = courseList.contains(searchCourseItem);
		
		int position = courseList.indexOf(searchCourseItem);
		if( position >= 0) {
			return courseList.get(position);
		}
		return null;
		
	}

}
