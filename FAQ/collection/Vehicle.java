package com.sahu.spring.springCore.collection;

import java.util.Objects;

public class Vehicle {

	@Override
	public int hashCode() {
		return Objects.hash(model, year);
	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Vehicle other = (Vehicle) obj;
//		return Objects.equals(model, other.model) && year == other.year;
//	}

	private int year;
	private String model;

	public Vehicle(int year, String model) {
		super();
		this.year = year;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", model=" + model + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
