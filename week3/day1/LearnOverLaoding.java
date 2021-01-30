package week3.day1;

public class LearnOverLaoding {
	
	public String getName(String course) {
		return "Gopinath Jayakuamr";
	}
	
	public String getName(int index) {
		String[] name = {"Babu", "Sarath", "Hari", "Sam", "Divya", "Navin"};
		return name[index];
	}
	
	public static void main(String[] args) {
		String name = new LearnOverLaoding().getName("Java");
		System.out.println(name);
		
		
		String name1 = new LearnOverLaoding().getName(1);
		System.out.println(name1);
	}

}
