package com.maponetoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		//creating question
		Question q1=new Question();
		q1.setQuestionid(1212);
		q1.setQuestion("what is java");
		
		//creating answer
		Answer answer=new Answer();
		answer.setAnswerid(343);
		answer.setAnswer2("java is programing answer");
		answer.setQuestion(q1);
		
		Answer answer1=new Answer();
		answer1.setAnswerid(43);
		answer1.setAnswer2("java is independent programming answer");
		answer1.setQuestion(q1);
		//q1.setAnswerslist(answer);
		
		List<Answer> list= new ArrayList<Answer>();
		list.add(answer);
		list.add(answer1);
		
		q1.setAnswerslist(list);
		Session s=factory.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		s.save(answer);
		s.save(answer1);
		tx.commit();
		
		//fetching detail
		Question fetch=s.get(Question.class,1212);
		System.out.println(fetch.getQuestionid());
		System.out.println(fetch.getQuestion());
		System.out.println(fetch.getAnswerslist().size());
		s.close();
		factory.close();
	}

}
