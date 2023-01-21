package techproed.tests.listeners;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.Driver;
public class ListenersTest4 {
    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)  //retry dan dolayi ekledik 3 defa daha run demek istiyoruz cunku
    public void test1(){
        Driver.getDriver().get("https://techproeducation.com/");
        Assert.assertTrue(false);
    }
}