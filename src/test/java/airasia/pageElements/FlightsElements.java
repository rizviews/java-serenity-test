package airasia.pageElements;

import org.openqa.selenium.By;

public class FlightsElements {

    public static By getFlightTypeField(String flightType){
        return By.xpath("//div[text()="+flightType+"]");
    }
    public static By FROM_DROPDOWN_ITEM = By.xpath("//div[text()=\"From\"]/parent::*/parent::*/following-sibling::div/div/div/div/div[2]/div/div/div/div[2]");
    public static By TO_DROPDOWN_ITEM = By.xpath("//div[text()=\"To\"]/parent::*/parent::*/following-sibling::div/div/div/div/div[2]/div/div/div/div[2]");
    public static By FROM_TEXT = By.xpath("//div[text()=\"From\"]/following-sibling::div/input");
    public static By TO_TEXT = By.xpath("//div[text()=\"To\"]/following-sibling::div/input");
    public static By DEPART_DATE_FIELD = By.xpath("//input[@aria-label=\"Depart date\"]");
    public static By RETURN_DATE_FIELD = By.xpath("//input[@aria-label=\"Return date\"]");    
    public static By SEARCH_BUTTON = By.id("aa-web-search-button");
    public static By DEPART_HEADER = By.id("depart-return-label-desc");
    public static By ROUTE_DESC = By.id("origin-destination-label-desc");
    public static By DEPART_TIME = By.id("departing-time-desc-0-0");
    public static By ARRIVAL_TIME = By.xpath("//*[@id=\"journey-line-row-0-0\"]/div[3]/div[1]/span");
    public static By CONTINUE_BUTTON = By.id("select-bottom-booking-summary-airasia-button-inner-button-booking-summary-heatmap");
}