package org.student;

import org.college.College;

public class Student extends College{
	
	public void studentName()
	{
		System.out.println("Student Name- Lavanya");
	}
	public void studentDept()
	{
		System.out.println("Student Department- CSE");
	}
	public void studentId()
	{
		System.out.println("Student ID- 735787");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		System.out.println("*****************");
		obj.deptName();
		System.out.println("*****************");
		obj.studentDept();
		obj.studentId();
		obj.studentName();
	
	}

}
