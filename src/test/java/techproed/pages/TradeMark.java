package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class TradeMark {
    public TradeMark(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href='/bin/gate.exe?f=login&p_lang=english&p_d=trmk']")
    public WebElement homeEnterClickElement;

    @FindBy(linkText = "Basic Word Mark Search (New User)")
    public WebElement BasicwordMarkSearch;

    @FindBy(xpath = "//*[text()='No thanks']")
    public WebElement noThanksButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchTermInput;

    @FindBy(xpath = "//table[@id='searchResultTable']//tbody//tr//td[4]")
    public List<WebElement> nameOfRugsList;

}
