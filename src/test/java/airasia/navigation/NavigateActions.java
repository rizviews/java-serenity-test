package airasia.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateActions {

    AirAsiaHomePage airAsiaHomePage;

    @Step("Open the Airasia home page")
    public void navigateToTheHomepage() {
        airAsiaHomePage.open();
    }
}
