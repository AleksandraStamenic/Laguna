package Tests;

import Pages.HomePage;
import Pages.Knjige;
import graphql.VisibleForTesting;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class KnjigeZaDecu extends BaseTest {
     @Test
    public void testKnjigeZaDecu() {
         ChromeDriver driver = new ChromeDriver();
         HomePage homePage = new HomePage(driver);
         homePage.clickonKnjigeButton(driver);
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(5,500)");
         Pages.KnjigeZaDecu knjigeZaDecu=homePage.clickonKnjigeZaDecuButton();
         knjigeZaDecu.acceptCookies();
         ArrayList<String>listaDecijeKnjige=knjigeZaDecu.getNaslovKnjige();
        for (int i=0; i<listaDecijeKnjige.size();i++)
            if (listaDecijeKnjige.get(i).contains("Mali princ")){
                knjigeZaDecu.getlistOfDecijeKnjige().get(i).click();

             }
        driver.quit();
     }

}






















