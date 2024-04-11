package com.maponetoone;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int questionid;
	private String question;
//	@OneToOne
	//@JoinColumn(name="a_id")
	//private Answer answer;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
	private List<Answer> answerslist;

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswerslist() {
		return answerslist;
	}

	public void setAnswerslist(List<Answer> answerslist) {
		this.answerslist = answerslist;
	}

	public Question(int questionid, String question, List<Answer> answerslist) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answerslist = answerslist;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
}
