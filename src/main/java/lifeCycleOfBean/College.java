package lifeCycleOfBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class College {
	
	public void getCollegeName() {
		System.out.println("COCSIT Ambajogai.");
	}
	
	@PostConstruct
	public void start() {
		System.out.println("in College init method");		
	}
	
	@PreDestroy
	public void end() {
		System.out.println("college destroy");		

	}

}
