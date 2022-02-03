package com.sahu.spring.springCore.reflection;

public class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Creating a public method with int as argument
	public void method2(int n) {
		System.out.println("The number is " + n);
	}

	private void display() {
		System.out.println("Student [id=" + id + ", name=" + name + "]");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
