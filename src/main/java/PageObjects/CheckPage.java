package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by tanya on 02.07.2017.
 */
public class CheckPage extends BasePage{

    public CheckPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "login")
    private MobileElement loginBtn;

    public MainPage clickOnLogin() {
        loginBtn.click();
        return new MainPage(driver);
    }

}

