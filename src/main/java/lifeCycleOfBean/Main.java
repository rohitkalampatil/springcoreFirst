package lifeCycleOfBean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleOfBean/lifecycle.xml");
		//to use or for init and destroy methods use AbstractApplicationContext instead of ApplicationnContext
		// its obj requires or we need regesterShutdownHook() method from AbstractApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleOfBean/lifecycle.xml");
		context.registerShutdownHook();
		
		Student s1 = context.getBean("student",Student.class);
		System.out.println(s1);
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		Teacher t1 = context.getBean("teacher",Teacher.class);
		System.out.println(t1);


		
		
	}

}
