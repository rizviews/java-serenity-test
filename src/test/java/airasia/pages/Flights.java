package airasia.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;

import airasia.pageElements.*;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class Flights extends UIInteractionSteps {

    public void clickFlights(){
        $(TopMenuElements.FLIGHTS_MENU).click();
        $(FlightsElements.FROM_TEXT).waitUntilClickable();
    }
    
    public void selectFrom(String from){

        $(FlightsElements.FROM_TEXT).clear();
        $(FlightsElements.FROM_TEXT).type(from);
        $(FlightsElements.FROM_DROPDOWN_ITEM).click();
    }

    public void selectTo(String to){
        $(FlightsElements.TO_TEXT).clear();
        $(FlightsElements.TO_TEXT).type(to);
        $(FlightsElements.TO_DROPDOWN_ITEM).click();
    }
    public void selectFlightType(String flightType){
        $(FlightsElements.getFlightTypeField(flightType)).click();
    }

    public void enterDepartDate(String date){
        $(FlightsElements.DEPART_DATE_FIELD).type(date);
    }

    public void enterReturnDate(String date){        
        $(FlightsElements.RETURN_DATE_FIELD).typeAndTab(date);        
    }

    public void clickSearch(){
        $(FlightsElements.SEARCH_BUTTON).click();
        $(FlightsElements.DEPART_HEADER).waitUntilVisible();
    }
}