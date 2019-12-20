package studentDataBaseApp;

import java.util.Scanner;

public class Student {

 private String firstName;
 private String lastName;
 private int gradeYear;
 private String studentID;
 private String courses;
 private int tuitionBalance;
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
 
 
 
	
}
