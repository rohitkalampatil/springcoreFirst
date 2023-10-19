package com.springcorefirst.collectionTypeInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcorefirst/collectionTypeInjection/CollectionnConfig.xml");
		Student student1 =(Student) context.getBean("student");
		System.out.println(student1);
	}

}
