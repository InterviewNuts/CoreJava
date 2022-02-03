package com.sahu.spring.springCore;

public class Employee {

	private int id;
	private String name;
	private Address add;

	public Employee(int id, String name, Address a) {
		super();
		System.out.println(" int  and string called");

		this.id = id;
		this.name = name;
		this.setAdd(a);
	}

	public Employee(String name) {
		super();
		System.out.println(" string cotr called");

		this.name = name;
	}

	public Employee(int id) {
		super();
		System.out.println("Only in called");

		this.id = id;
	}

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

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

}
