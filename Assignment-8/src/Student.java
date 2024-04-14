import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student  {
	private int rollno;
	private String name;
	private String city;
	private double marks;

	public Student() {

	}

	public Student(int rollno, String name, String city, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {

		return "[Roll No : " + rollno + " ,Name : " + name + ", City : " + city + ", Marks : " + marks + "]";
	}

	public static void main(String[] args) {
		int choice = 0;
		Student stud[] = new Student[5];
		stud[0] = new Student(2, "Utkarsh", "Praygraj", 83.6);
		stud[1] = new Student(4, "Mansi", "Delhi", 56.6);
		stud[2] = new Student(3, "Raj", "Pune", 96.6);
		stud[3] = new Student(1, "Sumit", "Mathura", 78.7);
		stud[4] = new Student(5, "Ankur", "Mumbai", 99.9);

//		for(Student student : stud)
//			System.out.println(student);
//		
//		Arrays.sort(stud);
//		
//		System.out.println("After Sorting");
//		
//		for (Student student : stud)
//			System.out.println(student);

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 0: To Exit ");
			System.out.println("Press 1: To Sort On city ");
			System.out.println("Press 2: To Sort On Marks ");
			System.out.println("Press 3: To Sort On Name ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("See You Again");
				break; 
				
			case 1:
				System.out.println("******************  Sorted On City Basis  *********************");
				class cityComaparator implements Comparator<Student>{
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.city.compareTo(o2.city);
						return value;
					}
				}
				System.out.println("----------  Before Sorting -->  --------------");
				for(Student student : stud)
					System.out.println(student);
				
				Comparator<Student> studentCityComparator = new cityComaparator();
				Arrays.sort(stud,studentCityComparator);
				
				System.out.println("----------  After Sorting -->  --------------");
				for (Student student : stud)
					System.out.println(student);
				break;
				
			case 2:
				System.out.println("**************** Sorting On the Basis of  Marks in Descending Order ***********************");				
				class marksComparator implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						int value =Double.compare(o2.marks,o1.marks );
						return value;
					}	
					
				}
				
				System.out.println("----------  Before Sorting -->  --------------");
				for(Student student : stud)
					System.out.println(student);
				
				Comparator<Student> studentMarksComparator = new marksComparator();
				Arrays.sort(stud,studentMarksComparator);
				
				System.out.println("----------  After Sorting -->  --------------");
				
				for(Student student: stud)
					System.out.println(student);
				
				break; 
				
			case 3:
				System.out.println("**************** Sorting On the Basis of  Names in Ascending Order ***********************");
				
				class nameComparator implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						int value=o1.name.compareTo(o2.name);
						return value;
					} 
					
					
				} 
				
				System.out.println("----------  Before Sorting -->  --------------");
				for(Student student : stud)
					System.out.println(student);
				
				
				Comparator<Student> StudentNameComparator = new nameComparator();
				Arrays.sort(stud,StudentNameComparator);
				
				System.out.println("----------  Before Sorting -->  --------------");
				for(Student student:stud)
					System.out.println(student);
				
				
				break;

			default:
				System.out.println("Wrong Choice !!!!");
				break;
			}

		} while (choice != 0);

	}

//	@Override
//	public int compareTo(Student o) {
//		int value = Double.compare(this.marks, o.marks);
//		if (value == 0)
//			value = Integer.compare(this.rollno, o.rollno);
//
//		if (value == 0)
//			value = this.name.compareTo(o.name);
//
//		return value;
//	}

	

}
