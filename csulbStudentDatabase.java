package csulbStudentDatabase;

import java.util.Scanner;

import csulbStudentDatabase.Student;

public class csulbStudentDatabase {

	public static void main(String[] args) {

		// How many students we wish to add
		System.out.println("Welcome to CSULB Applied Math Department!");
		System.out.print("How many students would you like to enroll?");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create variable number of students
		for(int i = 0; i < numOfStudents; i++){
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
			
		}


	}

}
