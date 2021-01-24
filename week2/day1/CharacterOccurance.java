package week2.day1;

public class CharacterOccurance {

	public static void main(String[] args) {
		String input = "WElcome to Chennai";
				
		String newOriginal = input.toLowerCase();
		
		System.out.println(newOriginal);
		
		//find the length of the given string
		int originalLength = newOriginal.length();
		
		//remove 'e' from the given string
		String strWithoutE = newOriginal.replace("e", "");
		
		//find the length of the new string
		int newStrLength = strWithoutE.length();
		
		System.out.println(originalLength - newStrLength);
		
	}

}
