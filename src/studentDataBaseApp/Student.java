package studentDataBaseApp;

import java.util.Scanner;

public class Student {

 private String firstName;
 private String lastName;
 private int gradeYear;
 private String studentID;
 private String courses = null;
 private int tuitionBalance = 0;
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
	 
	 System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	 
	
	 
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
		 courses = courses + "\n" + course;
		 tuitionBalance = tuitionBalance + costOfCourse;
	 }
	 
	 else {
		 break;
	 }
	 
	 }while (1!=0);
	 System.out.println("ENROLLED IN: " + courses);
	 System.out.println("TUITION BALANCE: " + tuitionBalance);
 }
 
 
	
}
