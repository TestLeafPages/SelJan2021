package testng.day2;

import org.testng.annotations.Test;

public class LearnDependencyInjection {
	
	//packageName.ClassName.methodName
	@Test(dependsOnMethods="testng.day2.LeadsTestCases.createLead", alwaysRun = true)
	public void duplicateLead() {
		System.out.println("duplicate lead");

	}

}
