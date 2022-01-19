package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class OpenYouTubeChannel extends BaseTest{

    @Test
    public void testOpenYouTubeChannel(){
        ChromeDriver driver=new ChromeDriver();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnYouTubeButton();
        String ActualTitle= driver.findElement(By.xpath("//*[@id=\"inner-header-container\"]")).getText();
        assertTrue(ActualTitle.contains("Laguna"));









    }



}
