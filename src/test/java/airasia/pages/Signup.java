package airasia.pages;

import airasia.pageElements.*;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class Signup extends UIInteractionSteps {

    public void clickSignup(){
        $(TopMenuElements.SIGNUP_MENU).click();
        $(SignupElements.SIGNUP_TAB).click();
    }

    @Step("Signup with {0} and {1}")
    public void enterSignupData(String email, String password) {
        $(SignupElements.EMAIL_FIELD).clear();
        $(SignupElements.EMAIL_FIELD).type(email);
        $(SignupElements.PASSWORD_FIELD).clear();
        $(SignupElements.PASSWORD_FIELD).type(password);        
    }

    public void clickSignupButton(){
        $(SignupElements.SIGNUP_BUTTON).click();
    }

    public String getErrorString(){
        return $(SignupElements.ERROR_MESSAGE).getTextContent().trim();
    }

    public boolean isSignupButtonVisible(){
        return $(SignupElements.SIGNUP_BUTTON).isVisible();
    }

}