package airasia.stepdefinitions;

import airasia.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.*;

public class FlightsStepDefinitions {

    @Steps
    Flights flights;

    @Given("I click on {string}")
    public void i_click_on(String menuText){
        flights.clickFlights();
    }

    @When("I enter proper data")
    public void i_enter_proper_data(DataTable dataTable){
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class); 
        flights.selectFrom(list.get(0).get("From"));
        flights.selectTo(list.get(0).get("To"));
        //flights.selectFlightType(list.get(0).get("Type"));
        flights.enterDepartDate(list.get(0).get("DepartDate"));
        flights.enterReturnDate(list.get(0).get("ReturnDate"));        
    }

    @When("I hit the search button")
    public void i_hit_the_search_button(){
        flights.clickSearch();
    }

    @Then("Depart section should display proper data")
    public void depart_section_should_display_proper_data(DataTable dataTable){
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);    

    }
    
    @Then("Total should show total Price")
    public void total_should_show_total_Price(){

    }

    @Then("I should see a continue button")
    public void i_should_see_a_continue_button(){

    }
}