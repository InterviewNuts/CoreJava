package com.sahu.spring.springCore.list;

import java.util.Iterator;
import java.util.List;

public class Question{
	private int id;
	private String name;
	private List<String> answers;

//	public Question(int id, String name, List<String> answers) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.answers = answers;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
