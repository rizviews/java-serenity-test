package airasia.pageElements;

import org.openqa.selenium.By;

public class SignupElements {
    public static By EMAIL_FIELD = By.id("sso-signup-email-input");
    public static By PASSWORD_FIELD = By.id("sso-signup-password-input");
    public static By SIGNUP_BUTTON = By.xpath("//button[@class=\"sso-button\" and contains(text(),\"Sign up\")]");
    public static By ERROR_MESSAGE = By.xpath("//div[@class=\"sso-error-message\"]/div");
    public static By SIGNUP_TAB = By.id("loginOrSignUp1");
    public static By SIGNUP_MODAL_CLOSE = By.xpath("//div[@id=\"sso-login-signup-widget\"]/button");
}