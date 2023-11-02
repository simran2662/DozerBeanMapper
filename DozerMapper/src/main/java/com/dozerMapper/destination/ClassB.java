package com.dozerMapper.destination;

public class ClassB {
	private String studentName;
	private String studentUsn;
	private String studentAddress;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentUsn() {
		return studentUsn;
	}
	public void setStudentUsn(String studentUsn) {
		this.studentUsn = studentUsn;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public ClassB(String studentName, String studentUsn, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentUsn = studentUsn;
		this.studentAddress = studentAddress;
	}
	public ClassB() {
		super();
	}
	@Override
	public String toString() {
		return "ClassB [studentName=" + studentName + ", studentUsn=" + studentUsn + ", studentAddress="
				+ studentAddress + "]";
	}
	

}
