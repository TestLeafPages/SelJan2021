package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");

	}

	@Test
	public void editLead() {
		System.out.println("editLead");
		throw new NoSuchElementException();

	}

	
	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");
		throw new NoSuchElementException();
	}

	
	@Test
	public void mergeLead() {
		System.out.println("mergeLead");

	}

	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");

	}

}
