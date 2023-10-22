package lifeCycleOfBean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//	ApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleOfBean/lifecycle.xml");
//  to use or for init and destroy methods use AbstractApplicationContext instead of ApplicationnContext
//  its obj requires or we need regesterShutdownHook() method from AbstractApplicationContext
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleOfBean/lifecycle.xml");
		context.registerShutdownHook();
		
		System.out.println("\n+++++++ Setting properties +++++++\n");

		//  Student class : using xml
		
		Student s1 = context.getBean("student",Student.class);
		System.out.println(s1);
		
		System.out.println("\n++++++++++++++++++++++++++++++++\n");
		
		// Teacher class : using interface 
		Teacher t1 = context.getBean("teacher",Teacher.class);
		System.out.println(t1);
		
		System.out.println("\n++++++++++++++++++++++++++++++++\n");

		// College class : using Annotation
		
		College c1 = context.getBean("college",College.class);
		c1.getCollegeName();

		System.out.println("\n+++++++ Calling Destroy +++++++\n");

		
		
	}

}
