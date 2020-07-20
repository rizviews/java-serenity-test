package airasia.pages;

import airasia.pageElements.*;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class Flights extends UIInteractionSteps {

    public void clickFlights(){
        $(TopMenuElements.FLIGHTS_MENU).click();
    }
    
}