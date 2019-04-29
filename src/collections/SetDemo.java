package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set is an inbuilt data structure in Java
 * Set is not index based and Set does not allows duplicate data
 * Set is an interface and is implemented by 3 classes
 * 1 HashSet it will not maintain any order of the data
 * 2 LinkedHashSet it will maintain insertion order
 * 3 TreeSet it will maintain alphabetical order for character data and ascending order
 * for numeric data
 */

public class SetDemo {
	public static void main(String[] args) {
//		Set<String> courses = new HashSet<>();
//		Set<String> courses = new LinkedHashSet<>();
		Set<String> courses = new TreeSet<>();
		//verify set is empty or not
		System.out.println(courses.isEmpty());
		
		//find the number of elements in a set
		System.out.println(courses.size());
		
		//add the data to the set
		courses.add("c");
		courses.add("c++");
		courses.add("Java");
		courses.add("Andriod");
		courses.add("Testing tools");
		courses.add("Java");
		courses.add("python");
		courses.add("selenium");
		
		//print the data of the set on the console
		System.out.println(courses);
		
		
		//retrieve the data using for each loop
		for(String course : courses) {
			System.out.println(course);
		}
		
		
		//retrieve the data using Iterator interface
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//delete the data
		System.out.println(courses);
		courses.remove("selenium");
		System.out.println(courses);
		
		
		//search for an element in the set
		System.out.println(courses.contains("Java"));
		
		//remove all the data from the set
		courses.clear();
		
		System.out.println(courses);
		
	}
}
