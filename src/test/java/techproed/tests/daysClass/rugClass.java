package techproed.tests.daysClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.TradeMark;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.List;

public class rugClass {
    TradeMark tradeMark;

    @Test
    public void test(){

        tradeMark=new TradeMark();
        Driver.getDriver().get(ConfigReader.getProperty("url_tradeMark"));
        tradeMark.homeEnterClickElement.click();
        tradeMark.BasicwordMarkSearch.click();
        ReusableMethods.waitFor(2);

        tradeMark.noThanksButton.click();
        ReusableMethods.waitFor(2);
       tradeMark.searchTermInput.sendKeys("RUG");
       tradeMark.searchTermInput.sendKeys(Keys.ENTER);
       List<WebElement> rugNameList=tradeMark.nameOfRugsList;


        for (WebElement w:tradeMark.nameOfRugsList){
            System.out.println(w.getText());
        }

    }

}
