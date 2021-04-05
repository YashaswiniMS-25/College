package com.wolken.wolkenapp.college;

import java.util.Scanner;

import com.wolken.wolkenapp.DTO.StudentDTO;

public class collegeUtil {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		College college = new College(size);
		for (int i = 0; i < size; i++) {
			StudentDTO studentDTO = new StudentDTO();
			System.out.println("enter student name");
			studentDTO.setStudentname(scan.next());
			System.out.println("enter student usn");
			studentDTO.setUsn(scan.next());
			System.out.println("enter student fee");
			studentDTO.setStudentfee(scan.nextInt());
			college.addStudentDetails(studentDTO);
		}
		college.getDetails();
		System.out.println("\n");
		
		System.out.println("enter the student usn");
		 StudentDTO studentdto=college.getDetailsByUsn(scan.next());
		 if(studentdto!=null) {
		 System.out.println(studentdto.getUsn()+"  "+studentdto.getStudentname()+"  "+studentdto.getStudentfee());
		
		 }
		 else {
			 System.out.println("student not found");
		 }
		
		
		
		System.out.println("enter the usn and fee to be updated ");
		System.out.println("USN:");
		String usn=scan.next();
		System.out.println("Updated fee");
		int fee=scan.nextInt();
		college.updateFeeByUsn(usn,fee);
		System.out.println("UPDATED DATA:");
		college.getDetails();
		System.out.println("\n");
		System.out.println("enter the usn to be deleted");
		String usn1=scan.next();
		college.deleteStudentByUsn(usn1);
		
		
		
		
		

		
	}

}
