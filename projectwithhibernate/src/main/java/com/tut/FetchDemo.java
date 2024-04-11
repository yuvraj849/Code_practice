package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		  System.out.println( "projected started" );
	      SessionFactory factory = new Configuration().configure().buildSessionFactory();
	      Session session=factory.openSession(); 
	      Student student=session.get(Student.class,3);
	      System.out.println(student);
	      Address ad =session.get(Address.class,1);
	      System.out.println(ad);
	      factory.close();
	      session.close();
	}

}
