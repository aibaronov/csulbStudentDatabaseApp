package csulbStudentDatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 800;
	private static int id = 12800000;
	//Get name and year of student
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first name of the student: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter last name of the student: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the Students class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		

		 

		
	}
	//Create Student ID 
	private void setStudentID(){
		id++;
		this.studentID = gradeYear + ""+ id;
	}
	//Enroll in courses
	public void enroll(){
		do{
			System.out.print("Enter the course to enroll in(Press Q to exit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")){
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
				
			}
			else{

				break;
			}
		}
			while (1 != 0);
		System.out.println("Enrolled IN: " +courses);
		System.out.println("Tuition Balance: "+ tuitionBalance);
	}
	
	//View balance
	public void viewBalance(){
		System.out.println("Your balance is: $"+tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition(){
		viewBalance();
		System.out.print("How much would you like to pay?: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("You have just made a payment of $" + payment);
		viewBalance();
	}
	
	//Show status of the student
	public String showInfo(){
		return "Name: " +firstName+ " " +lastName+ 
				"\nGrade Level: " + gradeYear+
				"\nStudent ID: " +studentID+
				"\nCourses Enrolled in: " + courses +
				"\nBalance is: $" +tuitionBalance;
	}

}
