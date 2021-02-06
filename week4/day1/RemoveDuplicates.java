package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] charArray = str.toCharArray();
		
		//declare set
		Set<Character> chars = new LinkedHashSet<Character>();
		
		for (Character eachChar : charArray) {
			chars.add(eachChar);
		}
		
		for (Character ch : chars) {
			
			if(ch!=' ')
			System.out.print(ch);
			
		}

	}

}
