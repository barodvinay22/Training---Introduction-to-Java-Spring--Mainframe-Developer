// A Java program to demonstrate use of Comparable
import java.io.*;
import java.util.*;


class ComparableDemo
{
	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Raj", 5, 2015));
		list.add(new Student("Suraj", 1, 1977));
		list.add(new Student("Akash", 2, 1980));
		list.add(new Student("Dev", 3, 1983));
		Collections.sort(list);

		System.out.println("Students after sorting : ");
		for (Student student: list)
		{
			System.out.println(student.getName() + " " +
            student.getId() + " " +
            student.getYear());
		}
	}
}

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private int year;

	// Used to sort student by year
	public int compareTo(Student student)
	{
		return this.year - student.year;
	}

	// Constructor
	public Student(String nm, int id, int yr)
	{
		this.name = nm;
		this.id = id;
		this.year = yr;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    

}


