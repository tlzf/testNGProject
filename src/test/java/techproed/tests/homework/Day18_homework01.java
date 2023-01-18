package techproed.tests.homework;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day18_homework01 {

    HomePage homePage;
    LoginPage loginPage;
    Faker faker;


    @Test
    public void negativeLoginTest(){
      faker=new Faker();
      homePage =new HomePage();
      loginPage =new LoginPage();

      String fakePassword=faker.internet().password();

        Driver.getDriver().get(ConfigReader.getProperty("bluerental_home_url"));
        homePage.homePageLoginLink.click();
        ReusableMethods.waitFor(2);
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(2);
        loginPage.password.sendKeys(fakePassword);
        ReusableMethods.waitFor(2);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(2);
        //ReusableMethods.verifyElementDisplayed(homePageBlueRental.popupMessage);



    }

}


/*
    Name:
    Login screen error messages
    Description:
    User should see error message when user tries to login with incorrect credentials
    Acceptance Criteria:
    As admin or customer, I should be able to see error message,
    when I provide a correct email address BUT incorrect password in a pop up window
    Error Message: Bad credentials
    https://www.bluerentalcars.com/
    Admin email: jack@gmail.com
    Admin wrong password: 56789
     */