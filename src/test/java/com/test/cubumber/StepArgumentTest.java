package com.test.cubumber;

import cucumber.api.java.en.Then;

public class StepArgumentTest {

	@Then("^printTheStepArgument$")
	public void printthestepargument(String arg1) throws Throwable {
		System.out.println(arg1);
	}
}
