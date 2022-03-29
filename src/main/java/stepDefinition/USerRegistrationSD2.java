package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class USerRegistrationSD2 {

    @Given("I am on subscribe page")
    public void i_am_on_subscribe_page() {
        System.out.println("I am on subscribe page");
    }
  /*  @When("I enter Amol , {int} , a@gmail.com")
    public void i_enter_amol_a_gmail_com(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/


    @When("I click on subscribe button")
    public void i_click_on_subscribe_button() {
        System.out.println("I click on subscribe button");
    }
    @Then("user should be subscribe")
    public void user_should_be_subscribe() {
        System.out.println("user should be subscribe");
    }

    @When("^I enter (.+) , (.+) , (.+)$") // created using tidy gherkin
    public void i_enter_(String name, String contactno, String emailid) {

        System.out.println("User Details");
        System.out.println("name="+name);
        System.out.println("contactno="+contactno);
        System.out.println("emailid="+emailid);
    }


}
