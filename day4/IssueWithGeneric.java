// Java program to demonstrate that NOT using
// generics can cause run time exceptions

import java.util.*;

class IssueWithGeneric
{
	public static void main(String[] args)
	{
		// Creatinga an ArrayList without any type specified
		ArrayList al = new ArrayList();

		al.add("Sachin");
		al.add("Rahul");
		al.add(10); // Compiler allows this
		al.add("C");

		for(Object s:al){
			System.out.println(s);
		}
		// String s1 = (String)al.get(0);
		// String s2 = (String)al.get(1);

		// // Causes Runtime Exception
		// String s3 = (String)al.get(2);
	}
}


// array
int[] a =new int[10];
1 2 3 4  5 6 7 8 9 10

a[0]

a[9]

//Linked List 
Key Address  Key Address key Address 
1    10		2      20	  3  40

// Stack 
push pop 
LIFO 

//Queue 
 FIFO 