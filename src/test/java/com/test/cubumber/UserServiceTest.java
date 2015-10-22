package com.test.cubumber;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserServiceTest {
	String userName;
	String password;
	List<String> userInWhiteList;

	@Given("^user login$")
	public void user_login() throws Throwable {
	}

	/** valid user name & password **/
	@When("^the login username is _userName,the password is _userName_password$")
	public void the_login_username_is__userName_the_password_is__userName_password()
			throws Throwable {
		userName = "keson";
		password = "keson_password";
	}

	@Then("^return true$")
	public void return_true() throws Throwable {
		Assert.assertTrue(UserService.login(userName, password));
	}

	/** invalid user name or password **/
	@When("^the login username is _userName,the password is not _userName_password$")
	public void the_login_username_is__userName_the_password_is_not__userName_password()
			throws Throwable {
		userName = "keson";
		password = "keson_password_password";
	}

	@Then("^return false$")
	public void return_false() throws Throwable {
		Assert.assertFalse(UserService.login(userName, password));
	}

	/** get list(separate by ,) from feature **/
	@When("the login username include text:(.*)")
	public void the_login_username_include_keson_mike_steven_yanni_uwen(
			List<String> userInWhiteList) throws Throwable {
		this.userInWhiteList = userInWhiteList;
	}

	/** get list(separate by ||) from feature **/
	@When("the login username include:(.*)")
	public void the_login_username_include_keson_mike_steven_yanni_uwen(
			String test, List<String> userInWhiteList) throws Throwable {
		this.userInWhiteList = userInWhiteList;
	}

	@Then("^user in white list$")
	public void return_user_in_white_list() throws Throwable {
		boolean allInWhiteList = true;
		for (String user : userInWhiteList) {
			System.out.println("----------" + user);
			allInWhiteList = UserService.isUserInWhiteList(user);
			if (!allInWhiteList) {
				break;
			}
		}
		Assert.assertTrue(allInWhiteList);
	}

	@Then("^user not in white list$")
	public void return_user_not_in_white_list() throws Throwable {
		boolean allInWhiteList = true;
		for (String user : userInWhiteList) {
			System.err.println(user);
			allInWhiteList = UserService.isUserInWhiteList(user);
			if (!allInWhiteList) {
				break;
			}
		}
		Assert.assertFalse(allInWhiteList);
	}

	/** get variable from feature **/
	@When("^I'm a variable$")
	public void i_m_a_variable__variable() throws Throwable {
	}

	@Then("output my value:(.*)")
	public void output_my_value(String variable) throws Throwable {
		System.err.println(variable);
	}
}
