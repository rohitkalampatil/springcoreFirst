package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring/autowiring.xml");
		Student s1 = context.getBean("student",Student.class);
		System.out.println(s1);
		System.out.println("College Name = "+s1.collegeName());
	}

}
