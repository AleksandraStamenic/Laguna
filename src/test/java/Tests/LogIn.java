package Tests;

import Pages.HomePage;
import Pages.Prijava;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn extends BaseTest{
    @Test
    public void testInvalidLogiIn(){
        ChromeDriver driver=new ChromeDriver();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnPrijavaButton();
        driver.findElement(By.xpath("//*[@id=\"broj-f\"]")).sendKeys("alexandra@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"lozinka-f\"]")).sendKeys("Password");
        Prijava prijava=new Prijava(driver);
        prijava.clickOnButtonPrijava();
        driver.quit();



    }
}
