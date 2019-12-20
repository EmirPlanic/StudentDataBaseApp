package studentDataBaseApp;

import java.util.Scanner;

public class studentDataBaseApp {

	public static void main(String[] args) {
	  
		
		
		System.out.println("Ente number os new students to enroll");
		Scanner input = new Scanner (System.in);
		int numOfStudents = input.nextInt();
		Student [] students = new Student [numOfStudents];
		
		
		for (int n = 0; n <numOfStudents; n++) {
			students[n] = new Student ();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
	}

}
