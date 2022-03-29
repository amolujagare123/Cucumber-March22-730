package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSD {

    @Given("I am on login page of billing")
    public void i_am_on_login_page_of_billing() throws Throwable {
        System.out.println("I am on login page of billing");
    }

    @When("^I enter correct username and correct password on billing page$")
    public void i_enter_correct_username_and_correct_password_on_billing_page() throws Throwable {
        System.out.println("I enter correct username and correct password on billing page");
    }

    @Then("^I should be redirected to the dashboard$")
    public void i_should_be_redirected_to_the_dashboard() throws Throwable {
        System.out.println("I should be redirected to the dashboard");
    }

    @And("^I click on login$")
    public void i_click_on_login() throws Throwable {
        System.out.println("I click on login");
    }

    @When("I enter incorrect username and incorrect password on billing page")
    public void iEnterIncorrectUsernameAndIncorrectPasswordOnBillingPage() {

        System.out.println("I enter incorrect username and incorrect password on billing page");
    }

    @Then("I should get error message")
    public void iShouldGetErrorMessage() {

        System.out.println("I should get error message");
    }


    @When("^I do not enter username and password on billing page$")
    public void i_do_not_enter_username_and_password_on_billing_page() throws Throwable {
        System.out.println("I do not enter username and password on billing page");
    }

    @Then("^I should get another error message$")
    public void i_should_get_another_error_message() throws Throwable {
        System.out.println("I should get another error message");
    }


    @When("I enter {string} as username and {string} as  password")
    public void i_enter_as_username_and_as_password(String user, String pass) {

        System.out.println("Username:"+user);
        System.out.println("Password:"+pass);

    }


}
