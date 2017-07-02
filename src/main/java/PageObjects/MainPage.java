package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by tanya on 02.07.2017.
 */
public class MainPage extends BasePage{

    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "username")
    private MobileElement fieldForEmailMain;

    @AndroidFindBy(id = "password")
    private MobileElement fieldForPasswordMain;

    @AndroidFindBy(id = "login")
    private MobileElement loginButton;

    @AndroidFindBy(id = "sign_up")
    private MobileElement createAccount;


    public LoginPage clickOnLoginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }

    public LoginPage clickOnCreateAccount() {
        createAccount.click();
        return new LoginPage(driver);
    }

    public void forEmail (String email) {
        fieldForEmailMain.setValue(email);
    }

    public void forPassword (String password) {
        fieldForPasswordMain.setValue(password);
    }


}
