package com.test.cubumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecearioOutlineTest {

	@Given("^there are (\\d+) cucumbers$")
	public void there_are_cucumbers(int arg1) throws Throwable {
		System.out.println("******** there are " + arg1 + "cucumber");
	}

	@When("^I eat (\\d+) cucumbers$")
	public void i_eat_cucumbers(int arg1) throws Throwable {
		System.out.println("******** I eat " + arg1 + "cucumber");
	}

	@Then("^I should have (\\d+) cucumbers$")
	public void i_should_have_cucumbers(int arg1) throws Throwable {
		System.out.println("******** I should have " + arg1 + "cucumber");
	}

}
