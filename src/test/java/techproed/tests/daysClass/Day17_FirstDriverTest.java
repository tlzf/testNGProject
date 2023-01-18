package techproed.tests.daysClass;

import org.testng.annotations.Test;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.JSUtils;
import techproed.utilities.ReusableMethods;

public class Day17_FirstDriverTest {

    @Test
    public void firstDriverTest(){
//        driver  ->  Driver.getDriver()
        Driver.getDriver().get("https://www.techproeducation.com");


//        close the driver
        Driver.closeDriver();
    }
}
 //"note1"