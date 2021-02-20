package testng.day1;

import org.testng.annotations.Test;

public class LearnTestNGAttributes {
	
	@Test(priority = 1,invocationCount =2)
	public void createLead() {
		System.out.println("create Lead");

	}

	@Test(priority = 2)
	public void editLead() {
		System.out.println("edit Lead");

	}
	
	@Test(priority = 3, enabled=false)
	public void deleteLead() {
		System.out.println("delete Lead");

	}
		
}
