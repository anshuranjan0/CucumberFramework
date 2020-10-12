package stepDefinition;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {

	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}
	
	@When("^user enters userID and password$")
	public void user_enters_userID_and_password() {
		System.out.println("user enters user id and password");
		
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		System.out.println("user clicks on login button");
		
	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password(DataTable userDetails) {
		List<List<String>> li = userDetails.asLists();
		for (List<String> col : li) {
	       System.out.println("UserName : "+col.get(0)+" and the password is : "+ col.get(1));
	    }
		
		
	}
}
