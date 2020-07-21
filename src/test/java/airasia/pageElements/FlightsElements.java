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
}