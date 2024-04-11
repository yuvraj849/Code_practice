package com.springcore.springlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycleconfig.xml");
		context.registerShutdownHook();
		Samosa s = (Samosa) context.getBean("samosa");
		System.out.println(s.getPrice());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Pepsi p = (Pepsi) context.getBean("pepsi");
		System.out.println(p);
		Example e = (Example) context.getBean("example");
		System.out.println(e.getSubject());

	}

}
