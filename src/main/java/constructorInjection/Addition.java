package constructorInjection;

public class Addition {
	private int a;
	private int b;
	
	/*
	 * in configuration file arguments passing through constructor-arg are by default String type.
	 * if we not mention type bean check for constructor from top to bottom and first one will call.
	 * if is there any constructor with string arguments them that constructor will call no matter where 
	 * we write
	 * */
	
	
	Addition(int a, int b){
		System.out.println("int, int\n");
		this.a = a;
		this.b = b;
	}
	
	Addition(double a, double b){
		System.out.println("double, double\n");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	Addition(String a, String b){
	// type casting from string to int
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public void sum() {
		System.out.println("sum = "+(this.a + this.b));
	}

}
