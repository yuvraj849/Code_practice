package com.springcore.auto.wireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wireannotation/autoconfig.xml");
		//Emp e= context.getBean("emp1",Emp.class);
		Emp e=(Emp) context.getBean("emp1");
		System.out.println(e);

	}

}
