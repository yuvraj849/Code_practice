package com.springcore.expressionlang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/expressionlang/spelconfig.xml");
		Demo d =  con.getBean("demo",Demo.class);
		System.out.println(d);

	}

}
