package com.sunbeam.collection;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int id;
	double marks;
	String name;
	
	public Student() {
		
	}
	
	
	public Student(int id, String name,double marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}


		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}


	@Override
	public int compareTo(Student o) {
		int value = this.id - o.id;
		return value;
	}  
	
	
	
	
	
	
} 


