package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map is an inbuilt data structure in java.util package
 * May stores the data in key and value pairs
 * we can store, retrieve, update and delete data using key
 * Map is implemented by 3 classes
 * 1 HashMap : it will not maintain any order
 * 2 LinkedHashMap : it will maintain insertion order
 * 3 TreeMap : it will maintain ascending for numeric keys, and alphabetical order for
 * character keys
 */
public class MapDemo {

	public static void main(String[] args) {
		// create a Map
//		Map<String, Integer> courses = new HashMap<>();
//		Map<String, Integer> courses = new LinkedHashMap<>();
		Map<String, Integer> courses = new TreeMap<>();

		// verify map is empty or not
		System.out.println(courses.isEmpty());

		// find the number of elements in a Map
		System.out.println(courses.size());

		// add the data to the Map
		courses.put("c", 30);
		courses.put("c++", 40);
		courses.put("Java", 40);
		courses.put("C#", 45);
		courses.put("Python", 45);
		courses.put("Ruby", 50);
		courses.put("Selenium", 80);
		
		//print the data on the console
		System.out.println(courses);
		
		//retrieve the data from the map
		System.out.println(courses.get("Selenium"));
		
		//update the data
		courses.put("Ruby", 60);
		System.out.println(courses);
		
		//remove the data
		courses.remove("C#");
		System.out.println(courses);
		
		courses.remove("Java", 30);
		System.out.println(courses);
		
		//iterate over the keys
		Set<String> keys = courses.keySet();
		for(String key : keys) {
			System.out.println(key+" : "+courses.get(key));
		}
		
		//iterate over the values
		Collection<Integer> values = courses.values();
		for(Integer value : values) {
			System.out.println(value);
		}
		
		// iterate over the key and value pairs
		Set<Entry<String, Integer>> kvPairs = courses.entrySet();
		
		for(Entry<String, Integer> kvPair : kvPairs) {
			System.out.println(kvPair.getKey() + " - "+kvPair.getValue());
		}
		
		//search for a data in Map
		System.out.println(courses.containsKey("Java"));
		
		System.out.println(courses.containsValue(60));
		
		//remove all the data from a Map
		courses.clear();
		
		System.out.println(courses);
		
	}

}
