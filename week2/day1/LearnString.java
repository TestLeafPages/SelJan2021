package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		
			String str1 = "Welcome to java session"; //sequence of characters; each character will be having index; first character index is 0
			
			
			String[] words = str1.split(" ");
			
			System.out.println(words[2]);
			
		/*
		 * for (String eachWord : words) {
		 * 
		 * System.out.println(eachWord);
		 * 
		 * }
		 */
			
			
			
			//taking the starting index and go till end of the string
			//System.out.println(str1.substring(3));
			
			
			//System.out.println(str1.substring(3, 7));
			
			
			//replace single old character with new character
			//System.out.println(str1.replace('e', 'x'));
			
			//replace the sequence of
			//System.out.println(str1.replace("wel", "out"));
			
			//System.out.println(str1.replace("wel",""));
			
			//System.out.println(str1.replaceAll("[0-9]", ""));
			
		//	System.out.println(str1.replaceAll(" ", ""));
			
			
			
			//to convert string into character of array
			//char[] charArray = str1.toCharArray();
			
			//System.out.println(charArray[2]);
			
			//used to get the single character from a string
			//System.out.println(str1.charAt(0));
			
			//to get the length of the string
		//	int len = str1.length();
		//	System.out.println(len);
			
			//to get the last character from the string
		//	System.out.println(str1.charAt(len-1));
			
		/*
		 * for (int i = len-1; i >= 0; i--) { System.out.print(str1.charAt(i));
		 * 
		 * }
		 */
			
			
		/*
		 * String str2 = "WELCOME";
		 * 
		 * //used to compare the values between 2 strings
		 * System.out.println(str1.equals(str2));
		 * 
		 * //compare the values by ignoring the case
		 * System.out.println(str1.equalsIgnoreCase(str2));
		 * 
		 * //to concatenate 2 strings System.out.println(str1.concat(str2));
		 * System.out.println(123+str1); System.out.println(str1+str2);
		 */
			
			
			
			
		/*
		 * System.out.println(str1.hashCode());
		 * 
		 * str1 = str1+"Java Learning";
		 * 
		 * System.out.println(str1.hashCode());
		 */
		
		/*
		 * //declare using Sting literal String str1 = "welcome"; // Case Sensitive
		 * //String Contant pool
		 * 
		 * String str3 = "Welcome"; // Memory will be effectively used
		 * 
		 * //Declare string using new Keyword String str2 = new String("Welcome");
		 * 
		 * //will compare the memory address of 2 string System.out.println(str1 ==
		 * str2); System.out.println(str1 == str3);
		 * 
		 * System.out.println("************************Values*****************");
		 * 
		 * System.out.println(str1.equals(str2)); System.out.println(str1.equals(str3));
		 */
	}

}
