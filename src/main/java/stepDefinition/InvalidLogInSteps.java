package stepDefinition;

import base.CommonAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class InvalidLogInSteps extends CommonAPI {
    @Given("^user is on printercloud page$")
    public void user_is_on_printercloud_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on printcloud page");
    }

    @When("^user input incorrect username$")
    public void user_input_incorrect_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("relogin_user")).sendKeys("OrfattChowdhury123");
    }

    @Then("^user input incorrect password$")
    public void user_input_incorrect_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("relogin_password")).sendKeys("jnffnfm5im");
    }

    @Then("^user clicks on the submit button$")
    public void user_clicks_on_the_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@id='admin-login-btn']//span[@class='ui-button-text'][contains(text(),'Log In')]")).click();
    }


}
