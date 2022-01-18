package Tests;

import Pages.HomePage;
import Pages.Korpa;
import Pages.ZmajevaRiznica;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
      ZmajevaRiznica zmajevaRiznica=new ZmajevaRiznica(driver);
      zmajevaRiznica.acceptCookies();
      String actualString = driver.findElement(By.xpath("//*[@id=\"sadrzaj\"]/div[2]")).getText();
      assertTrue(actualString.contains("Mesto na Mala Laguna Top-listi: 8"));
      driver.findElement(By.xpath("//*[@id=\"dugme-korpa\"]")).click();
      zmajevaRiznica.clickOnKorpaButton();


      driver.quit();


   }
}
