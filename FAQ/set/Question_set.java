package com.sahu.spring.springCore.set;



import java.util.Iterator;
import java.util.Set;

public class Question_set{
	private int id;
	private String name;
	private Set<String> answers;

	public Question_set(int id, String name, Set<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
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
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
