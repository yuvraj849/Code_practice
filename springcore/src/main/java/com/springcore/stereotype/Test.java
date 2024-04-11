package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student p = con.getBean("student",Student.class);
		System.out.println(p.hashCode());
		Student p1 = con.getBean("student",Student.class);
		System.out.println(p1.hashCode());

	}

}
