package com.wolken.wolkenapp.DTO;

public class StudentDTO {
	private String studentname;
	private String usn;
	private int studentfee;

	public StudentDTO() {
		System.out.println(this.getClass().getSimpleName() + "  object created");
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public int getStudentfee() {
		return studentfee;
	}

	public void setStudentfee(int studentfee) {
		this.studentfee = studentfee;
	}

}
