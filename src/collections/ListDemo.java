package collections;
/*
 * List is an inbuilt data structure in Java and it is an interface in java.util package
 * List is index based and List allows duplicate data also
 * It is implemented by two classes 
 * ArrayList
 * LinkedList
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// create an object of List
		List<String> courses = new LinkedList<>();

		// verify a list is empty or not
		System.out.println(courses.isEmpty());

		// find the number of elements in a list
		System.out.println(courses.size());

		// add the data to the list
		courses.add("c");
		courses.add("CPP");
		courses.add("Java");
		courses.add("Python");

		// print data in the list
		System.out.println(courses);

		// retrieve the data
		System.out.println(courses.get(2));

		// iterate over the list using normal for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		
		//iterate over the data using for each loop
		for(String course : courses) {
			System.out.println(course);
		}
		
		
		//iterate over the data using Iterator interface
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//insert the data in the list
		courses.add(2, "DS");
		System.out.println(courses);
		
		
		//update the data in the list
		courses.set(1, "C++");
		System.out.println(courses);
		
		//delete the data from the list
		courses.remove(1);
		System.out.println(courses);
		
		courses.remove("DS");
		System.out.println(courses);
		
		//search for an element in the list
		System.out.println(courses.contains("DS"));
		
		//clear all the data from the list
		courses.clear();
		
		System.out.println(courses.isEmpty());

	}

}
