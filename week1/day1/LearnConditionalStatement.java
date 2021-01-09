package week1.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {

		int age = 65;
		
		if(age < 18) {
			System.out.println("minor");
			System.out.println("not eligible to vote");
		}
		
		else if(age >= 18 && age < 60) {
			System.out.println("adult");
		}
		
		else if(age >= 60) {
			System.out.println("senior citizen");
		}
		
		/*
		 * else { System.out.println("major"); System.out.println("eligible to vote"); }
		 */
				

	}

}
