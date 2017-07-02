package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by tanya on 02.07.2017.
 */
public class SignUpForm extends BasePage{

    public SignUpForm(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "sign_up")
    private MobileElement signupButton;

    public MainPage clickOnSignupButton() {
        signupButton.click();
        return new MainPage(driver);
    }

}
