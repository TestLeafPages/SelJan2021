package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGrouping {
	
	@Test(groups = {"smoke"})
	public void createLead() {
		System.out.println("Create Lead");

	}

	@Test(groups = {"smoke"})
	public void editLead() {
		System.out.println("editLead");
	//	throw new NoSuchElementException();

	}

	
	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}

	
	@Test (groups = "regression", dependsOnGroups = "smoke")
	public void mergeLead() {
		System.out.println("mergeLead");

	}

	
	@Test (groups = "regression", dependsOnGroups = "smoke")
	public void deleteLead() {
		System.out.println("deleteLead");

	}

}
