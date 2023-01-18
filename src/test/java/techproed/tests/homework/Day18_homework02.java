//package techproed.tests.homework;
//
//import com.github.javafaker.Faker;
//import org.testng.annotations.Test;
//import techproed.pages.HomePage;
//import techproed.pages.LoginPage;
//import techproed.utilities.ConfigReader;
//import techproed.utilities.Driver;
//import techproed.utilities.ReusableMethods;
//
//public class Day18_homework02 {
//    HomePage homePageBlueRental;
//    LoginPage loginPage;
//    Faker faker;
//    @Test
//
//    public void wrongEmailTest(){
//
//        Driver.getDriver().get(ConfigReader.getProperty("bluerental_home_url"));
//        loginPage =new LoginPage();
//        homePageBlueRental=new HomePage();
//        faker=new Faker();
//
//        homePageBlueRental.homePageLoginLink.click();
//        loginPage.userName.sendKeys(faker.name().firstName());
//        ReusableMethods.verifyElementDisplayed(loginPage.errorMessageForInvalidUserName);
//        loginPage.userName.sendKeys("jack@gmail.com");
//        ReusableMethods.verifyElementNotDisplayed(loginPage.errorMessageForInvalidUserName);
//
//
//    }
//}
//
///*
//Name:
//Login screen error messages
//Description:
//User should see error message when an invalid email is entered
//Acceptance Criteria:
//As admin or customer, I should be able to see error message, when I do not provide a complete valid email address in email address box
//Error Message: email must be a valid email
//When I enter a valid email domain, then I should not see the error message
//https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
// */
