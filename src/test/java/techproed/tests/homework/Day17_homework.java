package techproed.tests.homework;

import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.pages.TestcenterTechproEducation;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day17_homework {
 //   https://testcenter.techproeducation.com/index.php?page=form-authentication
//   Login the application using page object model
 @Test
         public void testcenterTechpro(){
  TestcenterTechproEducation testcenterTechproEducation=new TestcenterTechproEducation();
  Driver.getDriver().get(ConfigReader.getProperty("url_techPro_testCenter"));
  testcenterTechproEducation.usernameofTestCenter.sendKeys("ali");
  testcenterTechproEducation.passofTestCenter.sendKeys("baba");
  testcenterTechproEducation.submitofTestCenter.click();
  ReusableMethods.verifyElementDisplayed(testcenterTechproEducation.verifyBaslik);

  ////        verifying login is successful
//        Assert.assertTrue(testHomePage.loginMessage.isDisplayed());    hocanin cozumu


 }



}
