package com.sunbeam.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

public class StudentProgram {

	public static void main(String[] args) {
		
		List<Student> studentList = new LinkedList<Student>();
		
		studentList.add(new Student(1,"Utkarsh",78.6));
		studentList.add(new Student(3,"Aditya",90.6));
		studentList.add(new Student(4,"Rushikesh",68.6));
		studentList.add(new Student(2,"Digvijay",34.6));
		studentList.add(new Student(5,"Pratiksha",49.6)); 
		
		System.out.println("Before Natural Sorting -->");
		for(Student stuel: studentList)
			System.out.println(stuel); 
		
		Collections.sort(studentList);
		
		System.out.println("After Natural Sorting -->");
		for(Student stuel: studentList)
			System.out.println(stuel); 
		
		
		class StudentNameComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.name.compareTo(o2.name);
				return value;
			}
			
		}
		
		Comparator<Student> studNameComp = new StudentNameComparator();
		Collections.sort(studentList,studNameComp); 
		
		System.out.println("After Sorting on basis of Name -->");
		for(Student stuel: studentList)
			System.out.println(stuel); 
		
		Student stud = new Student();
		stud.id = 3;
		if(studentList.contains(stud.id))
			System.out.println("Student Exists");
		else
			System.out.println("Student Does not Exist !!!");
		
		
		
	}

}
