package com.springcorefirst.collectionTypeInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	int studentId;
	String studentName;
	List<String> studentPhones;
	Set<String> studentAddress;
	Map<String, String> studentCourses;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getStudentPhones() {
		return studentPhones;
	}
	public void setStudentPhones(List<String> studentPhones) {
		this.studentPhones = studentPhones;
	}
	public Set<String> getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Set<String> studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Map<String, String> getStudentCourses() {
		return studentCourses;
	}
	public void setStudentCourses(Map<String, String> studentCourses) {
		this.studentCourses = studentCourses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhones=" + studentPhones
				+ ", studentAddress=" + studentAddress + ", studentCourses=" + studentCourses + "]";
	}
	
	
	
	
	

}
