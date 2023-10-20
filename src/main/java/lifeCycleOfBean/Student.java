package lifeCycleOfBean;

public class Student {
	
	private int rn;
	
	public void init() {
		System.out.println("in init method");
	}
	
	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	@Override
	public String toString() {
		return "Student [rn=" + rn + "]";
	}
	public void destroy() {
		System.out.println("in destroy method");
	}

}
