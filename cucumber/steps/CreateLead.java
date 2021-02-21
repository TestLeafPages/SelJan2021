package steps;

import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	@When("click on crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	@When("click on Leads link")
	public void clickLeadsLink() {
		driver.findElementByLinkText("Leads").click();

	}

}
