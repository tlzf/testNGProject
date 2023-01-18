package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestcenterTechproEducation {
    public TestcenterTechproEducation(){
//        Used to initiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="exampleInputEmail1")
    public WebElement usernameofTestCenter;
    @FindBy(id="exampleInputPassword1")
    public WebElement passofTestCenter;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitofTestCenter;

    @FindBy(xpath = "//h2")
    public WebElement verifyBaslik;

}
