import java.io.*;
import java.util.*;

class ComparatorDemo {
	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Rajesh", 4, 2015));
		list.add(new Student("Dev", 3, 1977));
		list.add(
			new Student("Suraj", 1, 1980));
		list.add(
				new Student("Suraj1", 1, 1980));
		list.add(
			new Student("Akash", 2, 1983));

		// Sort by id : (1) Create an object of
		// idCompare
		//				 (2) Call Collections.sort
		//				 (3) Print Sorted list
		System.out.println("Sorted by id");
		// IdCompare idCompare = new IdCompare();
		// Collections.sort(list, idCompare);
		Collections.sort(list,(s1,s2)-> s1.getId()-s2.getId());
		for (Student student : list)
			System.out.println(student.getId() + " "
							+ student.getName() + " "
							+ student.getYear());

		// Call overloaded sort method with Name
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Student student : list)
			System.out.println(student.getName() + " "
							+ student.getId() + " "
							+ student.getYear());

		// Uses Comparable to sort by year
		// System.out.println("\nSorted by year");
		// Collections.sort(list);
		// for (Student student : list)
		// 	System.out.println(student.getYear() + " "
		// 					+ student.getId() + " "
		// 					+ student.getName() + " ");
	}
}
// A class 'Student' that implements Comparable
class Student //implements Comparable<Student> 
{
	private int id;
	private String name;
	private int year;

	// // Used to sort student by year
	// public int compareTo(Student m)
	// {
	// 	return this.year - m.year;
	// }

	// Constructor
	public Student(String nm, int id, int yr)
	{
		this.name = nm;
		this.id = id;
		this.year = yr;
	}

	// Getter methods for accessing private data
    public int getId(){return id;}
	public String getName() { return name; }
	public int getYear() { return year; }
}

// Class to compare Student by ids
class IdCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2)
	{
		if (s1.getId() < s2.getId())
			return -1;
		if (s1.getId() > s2.getId())
			return 1;
		else
			return 0;
	}
}

// Class to compare Student by name
class NameCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}


