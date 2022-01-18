package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class PrelistavanjeNaslova extends BaseTest{
   @Test
    public void testPrelistavanjeNaslova(){
       ChromeDriver driver= new ChromeDriver();
       HomePage homePage=new HomePage(driver);
       homePage.clickOnSecondPoint();
       homePage.clickOnThirdPoint();
       homePage.clickOnFourthPoint();
       homePage.clickOnPrelistavanjeKnjiga();
       String actualString= driver.findElement(By.xpath("//*[@id=\"sadrzaj\"]")).getText();
      assertTrue(actualString.contains("Put Ludog Konja: Istorija plemena Lakota"));




   }

}
