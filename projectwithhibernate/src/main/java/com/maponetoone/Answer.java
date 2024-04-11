package com.maponetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerid;
	
	private String answer2;
	
	
	@ManyToOne
	private Question question;


	public int getAnswerid() {
		return answerid;
	}


	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}


	public String getAnswer2() {
		return answer2;
	}


	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Answer(int answerid, String answer2, Question question) {
		super();
		this.answerid = answerid;
		this.answer2 = answer2;
		this.question = question;
	}
	
	

	
}
