package com.test.cubumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VariableNumberTest {

	@Given("^I have (\\d+) cukes in my belly$")
	public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
		System.out.println("cukes number:" + cukes);
	}
	@When("^I wait (\\d+) hour$")
	public void i_wait_hour(int arg1) throws Throwable {
		System.out.println("I wailt " + arg1 + " hours");
	}

	@Then("^my belly should growl$")
	public void my_belly_should_growl() throws Throwable {
		System.out.println("xxx");
	}

}

