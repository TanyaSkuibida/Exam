import PageObjects.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by tanya on 02.07.2017.
 */
public class SignUpTest extends BaseTest{

    @Test
    public void testCalculateTip(){

        DismissMess dismissMess = new DismissMess(driver);
        dismissMess.clickOnDismissButton();

        MainPage mainPage = new MainPage(driver);

        mainPage.clickOnCreateAccount();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.forFirstName("test");
        loginPage.forLastName("test");
        loginPage.forEmail("1@gmail.com");
        loginPage.forPassword("test1TEST");
        loginPage.forConfirmPass("test1TEST");
        loginPage.forDiagnosis();
        loginPage.setNoneForDiagnosis();
        loginPage.forCountry();
        loginPage.setUkraine();
        loginPage.forPhone("0939185060");
        loginPage.clickOnContinue();

        SignUpForm signUpForm = new SignUpForm(driver);
        signUpForm.clickOnSignupButton();

        CheckPage checkPage = new CheckPage(driver);
        checkPage.clickOnLogin();

    }

}
