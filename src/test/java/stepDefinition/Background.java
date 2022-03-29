package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Background {
    @Given("I open the browser")
    public void iOpenTheBrowser() {

        System.out.println(">>>>>> I open the browser");
    }

    @And("I maximize it")
    public void iMaximizeIt() {

        System.out.println(">>>>>> I maximize it");
    }
}
