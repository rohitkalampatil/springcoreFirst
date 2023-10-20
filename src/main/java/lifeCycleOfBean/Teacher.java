package lifeCycleOfBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("in Teachers init method");		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Teachers destroy method called");

	}
	
	

}
