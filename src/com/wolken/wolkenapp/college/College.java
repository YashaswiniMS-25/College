package com.wolken.wolkenapp.college;

import com.wolken.wolkenapp.DTO.StudentDTO;

public class College {
	public StudentDTO[] studentDTO;
	int index;
	public College(int size) {
		studentDTO=new StudentDTO[size];
		
	}
	
	public void addStudentDetails(StudentDTO studentDTO) {
		if(studentDTO!=null) {
			System.out.println("student is added");
			this.studentDTO[index++]=studentDTO;
		}
		else {
			System.out.println("student object is null.....:(");
		}
	}
	public void getDetails() {
		for(int i=0;i<this.studentDTO.length;i++) {
			System.out.println("student name"+this.studentDTO[i].getStudentname());
			System.out.println("Student usn"+this.studentDTO[i].getUsn());
			System.out.println("Student fee"+this.studentDTO[i].getStudentfee());
			System.out.println("\n");
		}
	}
	public StudentDTO getDetailsByUsn(String s) {
		StudentDTO studentDTO=null;
		for(int i=0;i<this.studentDTO.length;i++) {
		if(this.studentDTO[i]!=null) {
			if(this.studentDTO[i].getUsn().equalsIgnoreCase(s)) {
				studentDTO=this.studentDTO[i];
			
			}
			//else {
			//	System.out.println("student not found");
				
			//}
		}
			
		}
		
		return studentDTO;
	}
	public void updateFeeByUsn(String usn, int fee) {
		for(int i=0;i<this.studentDTO.length;i++) {
			if(studentDTO!=null) {
				if(this.studentDTO[i].getUsn().equalsIgnoreCase(usn)) {
					this.studentDTO[i].setStudentfee(fee);
				}
			}
			else {
				System.out.println("not found");
			}
		}
	}
	public void deleteStudentByUsn(String usn) {
		for(int i=0;i<this.studentDTO.length;i++) {
			if(studentDTO!=null) {
				if(this.studentDTO[i].getUsn().equalsIgnoreCase(usn)) {
					this.studentDTO[i]=null;
				}
			}
			else {
				System.out.println("not found");
			}
		}
	}
	
	
	

}
