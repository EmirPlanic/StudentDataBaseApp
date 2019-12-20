package studentDataBaseApp;

import java.util.Scanner;

public class Student {

 private String firstName;
 private String lastName;
 private int gradeYear;
 private String studentID;
 private String courses = null;
 private double tuitionBalance = 0;
 private static int costOfCourse = 600;
 private static int id = 1000;	
 
 public Student () {
	 Scanner input = new Scanner (System.in);
	 
	 System.out.println("Enter student first name");
	 this.firstName = input.nextLine();
	 
	 System.out.println("Enter student last name");
	 this.lastName = input.nextLine();
	 
	 System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level");
	 this.gradeYear = input.nextInt();
	 
	 setStudentID();
	 
	
	 
	
	 
 }
 
 private void  setStudentID() {
	 id++;
	 this.studentID = gradeYear + "" + id;
	 
 }
 
 
 public void enroll () {
	 
	 do {
	 System.out.println("Enter course to enroll (Q to quit): ");
	 Scanner input = new Scanner (System.in);
	 String course = input.nextLine();
	 if (!course.equals("Q") && !course.equals("q")) {
		 courses = courses +"\n " + course;
		 tuitionBalance = tuitionBalance + costOfCourse;
	 }
	 
	 else {
		 break;
	 }
	 
	 }while (1!=0);
	
	
 }
 
 public void viewBalance () {
	 System.out.println("Your balance is: $" + tuitionBalance);
 }
 public void payTuition () {
	 viewBalance();
	 System.out.print("Enter your payment: $");
	 Scanner input = new Scanner(System.in);
	 double payment = input.nextDouble();
	 tuitionBalance = tuitionBalance - payment;
	 System.out.println("Thank you for your payment of " + payment);
	 viewBalance();
 }
 
 
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGradel Level:" + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}
