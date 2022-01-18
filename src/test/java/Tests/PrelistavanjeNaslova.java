package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrelistavanjeNaslova extends BaseTest{
   @Test
    public void testPrelistavanjeNaslova(){
       ChromeDriver driver= new ChromeDriver();
       HomePage homePage=new HomePage(driver);
       homePage.clickOnSecondPoint();
       homePage.clickOnThirdPoint();
       homePage.clickOnFourthPoint();
       homePage.clickOnPrelistavanjeKnjiga();



   }

}
