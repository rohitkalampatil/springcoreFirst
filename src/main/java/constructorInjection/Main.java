package constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection/constructorConfig.xml");
		//Student s1 = (Student)context.getBean("student");
		//System.out.println(s1);
		
		Addition addition = context.getBean("addition",Addition.class);
		addition.sum();
	}

}
