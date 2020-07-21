package airasia.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import airasia.pageElements.*;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import net.serenitybdd.core.steps.UIInteractionSteps;




public class Flights extends UIInteractionSteps {

    public void clickFlights() {
        $(TopMenuElements.FLIGHTS_MENU).click();
        $(FlightsElements.FROM_TEXT).waitUntilClickable();
    }

    public void selectFrom(final String from) {

        $(FlightsElements.FROM_TEXT).clear();
        $(FlightsElements.FROM_TEXT).type(from);
        $(FlightsElements.FROM_DROPDOWN_ITEM).click();
    }

    public void selectTo(final String to) {
        $(FlightsElements.TO_TEXT).clear();
        $(FlightsElements.TO_TEXT).type(to);
        $(FlightsElements.TO_DROPDOWN_ITEM).click();
    }

    public void selectFlightType(final String flightType) {
        $(FlightsElements.getFlightTypeField(flightType)).click();
    }

    public void enterDepartDate(final String date) {    
        $(FlightsElements.DEPART_DATE_FIELD).clear();
        this.setAttribute(FlightsElements.DEPART_DATE_FIELD,"");
        this.setAttribute(FlightsElements.DEPART_DATE_FIELD,date);
        System.out.println("test data depart: "+$(FlightsElements.DEPART_DATE_FIELD).getAttribute("value"));
    }

    public void enterReturnDate(final String date) {
        $(FlightsElements.RETURN_DATE_FIELD).clear();
        this.setAttribute(FlightsElements.RETURN_DATE_FIELD,"");
        this.setAttribute(FlightsElements.RETURN_DATE_FIELD,date); 
        System.out.println("test data: "+$(FlightsElements.RETURN_DATE_FIELD).getAttribute("value"));       
        $(FlightsElements.RETURN_DATE_FIELD).sendKeys(Keys.TAB);
    }

    public void clickSearch() {        
        $(FlightsElements.SEARCH_BUTTON).click();        
        $(FlightsElements.DEPART_HEADER).waitUntilVisible();
    }

    public String getRoute() {
        return $(FlightsElements.ROUTE_DESC).getText();
    }

    public String getDepartTime(){
        return $(FlightsElements.DEPART_TIME).getText();
    }

    public String getArrivalTime(){
        return $(FlightsElements.ARRIVAL_TIME).getText();
    }

    public boolean isContinueButtonVisible(){
        return $(FlightsElements.CONTINUE_BUTTON).isDisplayed();
    }

    void setAttribute(By by, String value){
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', '"+value+"');", $(by));        
        $(by).sendKeys(value);
    }
}