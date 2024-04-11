package com.springcore.springcorejdbcproject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.springcorejdbcproject.dao.StudentDao;
import com.springcore.springcorejdbcproject.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/springcorejdbcproject/config.xml");
    	ApplicationContext con = new AnnotationConfigApplicationContext(jdbcConfig.class);
    	StudentDao studentdao = con.getBean("studentdao",StudentDao.class);
    	/*
    	Student student = new Student();
    	student.setId(4);
    	student.setName("sanskar");
    	student.setCity("london");
    	
    int r	= studentdao.insert(student);
    System.out.println("student added" + r);
    	*/
    	/*
    	Student student = new Student();
    	student.setId(2);
    	student.setName("mehul");
    	student.setCity("por");
    	
    int r	= studentdao.change(student);
    System.out.println("student added" + r);
    */
    	
    /*	 	
    int r	= studentdao.delete(2);
    System.out.println("student deleted" + r);*/
    /*	
    Student student = studentdao.getStudent(1);
    System.out.println(student);*/
    	
    List<Student> students = studentdao.getAllStudent();
    for(Student s: students) {
    	System.out.println(s);
    }
    }
}
