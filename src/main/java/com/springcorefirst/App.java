package com.springcorefirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("config.xml" );
		Student student = (Student) context.getBean("student");
		System.out.println(student);
    }
}
