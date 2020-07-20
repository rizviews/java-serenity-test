package airasia.stepdefinitions;

import airasia.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import com.ibm.icu.impl.LocaleDisplayNamesImpl.DataTable;

public class FlightsStepDefinitions {

    @Given("I click on {string}")
    public void i_click_on(String menuText){

    }

    @When("I enter proper data")
    public void i_enter_proper_data(DataTable dataTable){

    }

    @When("I hit the search button")
    public void i_hit_the_search_button(){

    }

    @Then("Depart section should display proper data")
    public void depart_section_should_display_proper_data(DataTable dataTable){

    }
    
    @Then("should show total Price")
    public void should_show_total_price(){

    }

    @Then("I should see a continue button")
    public void i_should_see_a_continue_button(){

    }
}