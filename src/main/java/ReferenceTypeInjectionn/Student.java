package ReferenceTypeInjectionn;

public class Student {
	
	String studentName;
	Address studentAddress;
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	

}
