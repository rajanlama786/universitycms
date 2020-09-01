package Courses;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner  = new Scanner(System.in);
	
	private static CourseList courseList = new CourseList();
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstruction();
		while(!quit) {
			System.out.println("Enter your choice");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstruction();
				break;
			case 1:
				courseList.printCourseBook();
				break;
			case 2:
				addCourseItem();
				break;
			case 3:
				modifyCourseItem();
				break;
			case 4:
				removeCourseItem();
				break;
			case 5:
				searchForCourseItem();
				break;
			case 6:
				quit = true;;
				break;
			}
		}
		
	}
	
	public static void printInstruction() {
		System.out.println("\n 0 - To print choice options.");
		System.out.println("\n 1 - To print the list of Courses.");
		System.out.println("\n 2 - To add course to list.");
		System.out.println("\n 3 - To Modify course from list.");
		System.out.println("\n 4 - To remove course from list.");
		System.out.println("\n 5 - To search course.");
		System.out.println("\n 6 - To Quit the application.");
	}
	
	public static void addCourseItem() {
		System.out.print("Please enter the course: ");
		courseList.addCourseBook(scanner.nextLine());
	}
	
	public static void modifyCourseItem() {
		System.out.print("Enter course number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter replacement course number : ");
		String newItem = scanner.nextLine();
		courseList.modifyCourseBook(itemNo-1, newItem);
	}
	
	public static void removeCourseItem() {
		System.out.print("Please enter the course number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		courseList.removeCourseBook(itemNo-1);
	}
	
	public static void searchForCourseItem() {
		System.out.println("Course to search for:");
		String searchItem = scanner.nextLine();
		
		if(courseList.findCourseItem(searchItem) != null) {
			System.out.println("Found " + searchItem + "in the list.");
		}else {
			System.out.println( searchItem + "is ot in the list.");
		}
	}

}
