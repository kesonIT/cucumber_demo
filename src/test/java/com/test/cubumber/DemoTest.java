package com.test.cubumber;


import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoTest {
	@Given("^I have (\\d+) green cukes$")
	public void i_have_green_cukes(int arg1) throws Throwable {
	    System.out.println("xx");
	}

	@When("^I add a table$")
	public void i_add_a_table(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> list = arg1.asList(String.class);
		for (String string : list) {
			System.out.println("*******" + string);
		}
	}

	@Then("^I should have (\\d+) green cukes$")
	public void i_should_have_green_cukes(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("xx");
	}

	@Then("^I should have (\\d+) yellow cukes$")
	public void i_should_have_yellow_cukes(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("xx");
	}

	@When("^I add a string$")
	public void i_add_a_string(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("xx");
	}

	@Given("^I have (\\d+) yellow cukes$")
	public void i_have_yellow_cukes(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("xx");
	}

	@Then("^I should have (\\d+) yellow bananas$")
	public void i_should_have_yellow_bananas(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("xx");
	}

	@Given("^a pending step$")
	public void a_pending_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("xx");
	}

	@Given("^a failing step that is preceded by a pending$")
	public void a_failing_step_that_is_preceded_by_a_pending() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("xx");
	}

	@Given("^a table that we convert:$")
	public void a_table_that_we_convert(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    System.out.println("xx");
	}

}
