package com.studentmanagementapi;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String standard;
	private int studentID;
	private static int id=1000;

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name");
		this.firstName = in.nextLine();
		System.out.println("Enter Student Last Name");
		this.lastName = in.nextLine();
		System.out.println("Enter standard");
		this.standard = in.nextLine();
		setStudentID();
		System.out.println(firstName + " " +lastName+ " " +"Studying in"+ " " +standard+ " " +"Class Level"+ " " +"ID" +studentID);
}
	private void setStudentID() {
		id++;
		this.studentID=id;
	}
	
}
