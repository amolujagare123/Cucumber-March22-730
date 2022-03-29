package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before  ("@userReg")
    public void beforeScenario()
    {
        System.out.println("***** This is Before Scenario *****");
    }

    @After ("@userReg")
    public void afterScenario()
    {
        System.out.println("***** This is After Scenario *****");
    }

    @Before  ("@login")
    public void beforeScenario1()
    {
        System.out.println("***** LOGIN BEFORE *****");
    }

    @After ("@login")
    public void afterScenario1()
    {
        System.out.println("***** LOGIN AFTER *****");
    }



}
