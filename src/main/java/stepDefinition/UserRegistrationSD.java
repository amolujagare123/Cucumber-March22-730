package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistrationSD {

    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("I am on user registration page");
    }
    @When("I enter below data")
    public void i_enter_below_data(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));
        System.out.println(data.get(0).get(2));
        System.out.println(data.get(0).get(3));

    }


    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("user should be registered")
    public void user_should_be_registered() {
        System.out.println("user should be registered");
    }
}
