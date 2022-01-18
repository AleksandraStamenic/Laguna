package Tests;

import Pages.HomePage;
import Pages.ZmajevaRiznica;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest extends BaseTest{
   @Test
    public void testSearch(){
       ChromeDriver driver=new ChromeDriver();
       HomePage homePage=new HomePage(driver);
       homePage.searchByText("Zmajeva riznica");
       homePage.acceptCookies();
       homePage.clickOnZmajevaRiznica();
   }

   @Test
   public void testDodajuKorpu(){
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://laguna.rs/n3112_knjiga_zmajeva_riznica_laguna.html");
      ZmajevaRiznica zmajevaRiznica=new ZmajevaRiznica(driver);
      zmajevaRiznica.acceptCookies();
      driver.findElement(By.xpath("//*[@id=\"dugme-korpa\"]")).click();

   }
}
