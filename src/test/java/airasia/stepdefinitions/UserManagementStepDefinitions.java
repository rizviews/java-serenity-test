package airasia.stepdefinitions;

import airasia.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

public class UserManagementStepDefinitions {
    
    @Steps
    Signup signup;

    //@Steps
    //SearchResult searchResult;

    @Given("I click on Signup menu")
    public void i_click_on_signup_menu(){
        signup.clickSignup();
    }
    
    @Given("I enter email and password")
    public void i_enter_as_email(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);    
        signup.enterSignupData(list.get(0).get("email"), list.get(0).get("password"));
    }

    @When("I press signup button")
    public void i_press_signup_button() {
        signup.clickSignupButton();           
    }

    @Then("Error message should appear with text {string}")
    public void error_message_should_appear_with_text(String expectedMessage) {
        String actualText = signup.getErrorString();
        assertThat(actualText).isEqualToIgnoringCase(expectedMessage.trim());
    }

    @Then("I should remain in the signup page")
    public void i_should_remain_in_the_signup_page() {
        assertThat(signup.isSignupButtonVisible()).isEqualTo(true);
    }
}
