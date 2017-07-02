package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by tanya on 02.07.2017.
 */
public class DismissMess extends BasePage{

    public DismissMess(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "button2")
    private MobileElement dismissButton;

    public MainPage clickOnDismissButton() {
        dismissButton.click();
        return new MainPage(driver);
    }

}
