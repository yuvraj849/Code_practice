package com.springcore.configration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Demo d = con.getBean("firststudent",Demo.class);
		System.out.println(d);
		d.study();

	}

}
