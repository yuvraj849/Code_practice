package com.mapmanytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		//create EMP
		Emp e1=new Emp();
		e1.setEmpid(1);
		e1.setEmpname("yuvraj");
		//create second EMP
		Emp e2=new Emp();
		e2.setEmpid(2);
		e2.setEmpname("sanket");
		
		List<Emp> el1= new ArrayList<Emp>();
		el1.add(e1);
		el1.add(e2);
		//creating project
		Project p1=new Project();
		p1.setProjectid(12);
		p1.setProjectname("firewalling");
		
		//creating second project
		Project p2=new Project();
		p2.setProjectid(13);
		p2.setProjectname("smartbox");
		List<Project> pl1= new ArrayList<Project>();
		pl1.add(p1);
		pl1.add(p2);
		
		List<Project> pl2= new ArrayList<Project>();
		pl2.add(p2);
		
		e1.setProjects(pl1);
		e2.setProjects(pl2);
		p1.setEmp(el1);
		
		Session s=factory.openSession();
		
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(p1);
		s.save(e2);
		s.save(p2);
		tx.commit();
		factory.close();
	}

}
