package techproed.tests.daysClass;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.XYZBankPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.util.List;

public class Xyztekrar {
    @Test
    public void test() {


//
//        //Open 5 Accounts, deposit 100 USD and withdraw 100 USD from any account and delete all accounts.

//    Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
        Driver.getDriver().get(ConfigReader.getProperty("xyzBank_URL"));
        XYZBankPage xyzBankPage =new XYZBankPage();
//    Click on "Bank Manager Login" button
        xyzBankPage.bankManagerLoginButton.click();
//    Click on "Add Customer" button
       xyzBankPage.addCustomerButton.click();
//    Fill inputs and click on "Add Customer" submit button
        Faker faker=new Faker();
        for (int i=1;i<6;i++) {
            xyzBankPage.firstnameInput.sendKeys(faker.name().firstName());
            xyzBankPage.lastnameInput.sendKeys(faker.name().lastName());
            xyzBankPage.postCodeInput.sendKeys(faker.address().zipCode());
            xyzBankPage.addCustomerButton.click();
            try {
                Driver.getDriver().switchTo().alert().accept();
            } catch (Exception Ignored) {
            }
        }


//    Accept alert
//And
//    Add 4 more customers
//And
//    Click on "Open Account"  button
        xyzBankPage.openAccountButton.click();
//And
//    Click on "Customer" dropdown


        xyzBankPage.openAccountButton.click();

//    Select customer name
        for (int i=6;i<11;i++) {


            Select select = new Select(xyzBankPage.customerDropdown);
            select.selectByIndex(i);
            Select select1 = new Select(xyzBankPage.currencyDropdown);
            select1.selectByIndex(0);
            xyzBankPage.processButton.click();
            try {
                Driver.getDriver().switchTo().alert().accept();
            } catch (Exception ignored) {
            }
        }

//    Click on "Customers" button
xyzBankPage.customersButton.click();
//    Count table row numbers
int rownum=xyzBankPage.numberOfCustomerRows.size();
//    Assert that you created 5 customers
        Assert.assertEquals(rownum,10);
//    Click on "Home" button
        xyzBankPage.homeButton.click();
//    Click on "Customer Login" button
        xyzBankPage.customerLoginButton.click();
//    Click on "Your Name" dropdown

//    Select the any name you created
        Select select=new Select(xyzBankPage.yourNameDropdown);
        select.selectByValue("7");
//    Click on "Login" button
        xyzBankPage.loginButton.click();
//    Click on "Deposit" button
        xyzBankPage.depositButton.click();
//    Type 100 into "Amount to be Deposited" input
        xyzBankPage.depositAmountInput.sendKeys("100");
        xyzBankPage.depositSubmitButton.click();
//    Assert that "Deposit Successful" is displayed
        ReusableMethods.verifyElementDisplayed(xyzBankPage.depositSuccessfulMessage);

xyzBankPage.withdrawalButton.click();
//    Type 100 into "Amount to be Withdrawn" input
xyzBankPage.withdrawalAmountInput.sendKeys("100");
//    Click on "Withdraw"(Submit) button
        Actions actions=new Actions(Driver.getDriver());
        actions.click(xyzBankPage.withdrawSubmitButton);
//    Assert that "Transaction  Successful" is displayed
        ReusableMethods.verifyElementDisplayed(xyzBankPage.transactionSuccessfulMessage);

//When
//    Click on "Logout" button
xyzBankPage.logOutButton.click();
//    Click on "Home" button
        xyzBankPage.homeButton.click();
//    Click on "Bank Manager Login" button
        xyzBankPage.bankManagerLoginButton.click();
//    Click on "Customers" button
        xyzBankPage.customersButton.click();
//    Click on each "Delete" button

           List<WebElement> list= xyzBankPage.deleteButtonList;
           for (WebElement w:list){
               w.click();
           }

//    Count table row numbers

//Then
//    Assert that number of customers is 0
        Assert.assertEquals(xyzBankPage.numberOfCustomerRows.size(),0);
//
// */

    }


}
