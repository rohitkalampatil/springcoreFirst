package Autowiring;

public class Student {

	private String name;
	private College college;
	
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public College getCollege() {
//		return college;
//	}
//
//	public void setCollege(College college) {
//		this.college = college;
//	} 

	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + this.college.getCollegeName() + "]";
	}


	public Student(String name, College college) {
	super();
	this.name = name;
	this.college = college;
}


	public String collegeName() {
		return  this.college.getCollegeName();
	}


}
