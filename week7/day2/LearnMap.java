package week7.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		Map<Integer,String> empInfo = new LinkedHashMap<Integer,String>();
		
		empInfo.put(100, "Hari");
		empInfo.put(500, "Sheriba");
		empInfo.put(300, "Naveen");
		empInfo.put(400, "Dhivya");
		empInfo.put(200, "Bowya");
	//	empInfo.put(100, "Sam");
		
		
		
		Set<Entry<Integer, String>> entrySet = empInfo.entrySet();
		
		for (Entry<Integer, String> eachEntry : entrySet) {
			
			System.out.println(eachEntry.getValue());
			
		}
		
		
		
		
	//	System.out.println(empInfo);

	}

}
