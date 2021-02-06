package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String>  values = new LinkedHashSet<String>();
		
		values.add("Hari");
		values.add("Dhivya");
		values.add("Sam");
		values.add("Naveen");
		values.add("Bowya");
		values.add("Hari");
		
		System.out.println(values.size());
		
		//Create empty list - pass the set into list to copy
		List<String> listValues = new ArrayList<String>(values);
		
		//to add all the values from one collection to another collection
		//listValues.addAll(values);
		
		System.out.println(listValues.get(2));
		
		/*
		 * for (String eachValue : listValues) { System.out.println(eachValue); }
		 */
		
		
		/*
		 * for (String eachValue : values) { System.out.println(eachValue);
		 * 
		 * }
		 */
		
		
		

	}

}
