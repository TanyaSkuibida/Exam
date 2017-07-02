package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by tanya on 02.07.2017.
 */
public class LoginPage extends BasePage{

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "first_name_value")
    private MobileElement fieldForFirstName;

    @AndroidFindBy(id = "last_name_value")
    private MobileElement fieldForLastName;

    @AndroidFindBy(id = "email_value")
    private MobileElement fieldForEmail;

    @AndroidFindBy(id = "password_value")
    private MobileElement fieldForPass;

    @AndroidFindBy(id = "confirm_password_value")
    private MobileElement fieldForConfirmPass;

    @AndroidFindBy(id = "diagnosis_value")
    private MobileElement fieldForDiagnosis;

    @AndroidFindBy(id = "country_value")
    private MobileElement fieldForCountry;


    @AndroidFindBy(id = "sign_up")
    private MobileElement continueBtn;

    public void forFirstName (String firstName) {
        fieldForFirstName.setValue(firstName);
    }

    public void forLastName (String lastName) {
        fieldForLastName.setValue(lastName);
    }

    public void forEmail (String email) {
        fieldForEmail.setValue(email);
    }

    public void forPassword (String pass) {
        fieldForPass.setValue(pass);
    }

    public void forConfirmPass (String confirmPass) {
        fieldForConfirmPass.setValue(confirmPass);
    }

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='None']")
    private MobileElement setNoneForDiagnosis;

    public LoginPage forDiagnosis () {
        fieldForDiagnosis.click();
        return new LoginPage(driver);
    }

    public LoginPage setNoneForDiagnosis () {
        setNoneForDiagnosis.click();
        return new LoginPage(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='com.medicom.maven.debug:id/parentPanel']//*[@text='Ukraine']")
    private MobileElement setUkraine;

    public LoginPage forCountry () {
        fieldForCountry.click();
        return new LoginPage(driver);
    }

    public LoginPage setUkraine () {
        setUkraine.click();
        return new LoginPage(driver);
    }


    @AndroidFindBy(id = "phone_number_value")
    private MobileElement fieldForPhone;

    public void forPhone (String phone) {
        fieldForPhone.setValue(phone);
    }


    public SignUpForm clickOnContinue() {
        continueBtn.click();
        return new SignUpForm(driver);
    }

}
