package ReferenceTypeInjectionn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ReferenceTypeInjectionn/ReferenceConfig.xml");
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1);

	}

}
