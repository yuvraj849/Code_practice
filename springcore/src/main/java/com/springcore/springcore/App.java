package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	//Student student1 = (Student) context.getBean("student1");
    	//Student student1 = (Student) context.getBean("student0");
    	Student student1 = (Student) context.getBean("student2");
    	System.out.println(student1);
    }
}
//