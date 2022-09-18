package org.student;

import org.department.Department;

public class Student extends Department {
	
	public static void studentName()
	{
		System.out.println("My name is Govind");
	}
	public static void studentDept()
	{
		System.out.println("I belongs to department BCA");
	}
	public static void studentId()
	{
		System.out.println("My ID is 382");
	}
	
	public static void main(String[] args)
	{
		collegeRank();
		studentName();
		studentDept();
		studentId();
		deptName();
		
		
	}

}
