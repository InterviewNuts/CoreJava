package com.sahu.spring.springCore.map;

import java.util.Iterator;
import java.util.Map;

public class Question_map {
	private int id;
	private String name;
	private Map<Integer, String> answers;

//	public Question_map(int id, String name, Map<Integer, String> answers) {
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

	public Map<Integer, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Question_map [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Iterator<Integer> itr = answers.keySet().iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(" Key=  " + key + " " + "Value = " + answers.get(key));
		}

	}

}
