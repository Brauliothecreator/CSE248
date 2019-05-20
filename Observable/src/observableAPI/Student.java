package observableAPI;

import java.util.Observable;

public class Student extends Observable{
	private String name;
	private double gpa;
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
		setChanged();
		notifyObservers("Hello");
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	
}