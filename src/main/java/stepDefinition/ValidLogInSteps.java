package stepDefinition;

import base.CommonAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class ValidLogInSteps extends CommonAPI {
    @Given("^user is on the printercloud page$")
    public void user_is_on_the_printercloud_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on the printercloud page");
    }

    @When("^user input correct username$")
    public void user_input_correct_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("relogin_user")).sendKeys("OrfattChowdhury");
    }

    @Then("^user input correct password$")
    public void user_input_correct_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("relogin_password")).sendKeys("Shadowdirge12");
    }

    @Then("^user clicks the submit button$")
    public void user_clicks_the_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@id='admin-login-btn']//span[@class='ui-button-text'][contains(text(),'Log In')]")).click();
    }

}
