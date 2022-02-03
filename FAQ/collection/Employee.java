package com.sahu.spring.springCore.collection;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	public static String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	static public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
//
//	@Override
//	public int compareTo(Employee o) 
//	{
//	       if (this.age > o.age) {
//	    	   
//	            // if current object is greater,then return 1
//	            return 1;
//	        }
//	        else if (this.age < o.age) {
//	 
//	            // if current object is greater,then return -1
//	            return -1;
//	        }
//	        else {
//	 
//	            // if current object is equal to o,then return 0
//	            return 0;
//	        }
//	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
//
//	@Override
//	public int compareTo(Employee o) 
//	{
//	       if (this.name.equals(o.name)) {
//	    	   
//	            return 0;
//	        }
//	        else if (!this.name.equals(o.name)) {
//	 
//	            // if current object is greater,then return -1
//	            return -1;
//	        }
//	        else {
//	 
//	            // if current object is equal to o,then return 0
//	            return 1;
//	        }
//	}
	
	
	
}
