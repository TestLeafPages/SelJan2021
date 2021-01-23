package week2.day1;

public class LearnSwitchStatement {

	public static void main(String[] args) {

		String day = "Thursday";

		switch (day) {
		case "Monday":
			System.out.println("day1");
			break;
		case "Tuesday":
			System.out.println("day2");
			break;
		case "Wednesday":
			System.out.println("day3");
			break;
		case "Thursday":
			System.out.println("day4");
			break;
		case "Friday":
			System.out.println("day5");
			break;
		default:
			System.out.println("Invalid input");
		
		}

		/*
		 * if(day == 1) { System.out.println("Monday"); } else if(day == 2) {
		 * System.out.println("Tuesday"); } else if(day == 3) {
		 * System.out.println("Wednesday"); } else if(day == 4) {
		 * System.out.println("Thursday"); } else if(day == 5) {
		 * System.out.println("Friday"); } else { System.out.println("Holiday"); }
		 */

	}

}
