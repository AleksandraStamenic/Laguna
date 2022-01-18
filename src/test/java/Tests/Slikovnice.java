package Tests;

import Pages.HomePage;
import Pages.MalaLaguna;
import Pages.NajmladjiDo3;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slikovnice extends BaseTest{
    @Test
    public void testSlikovnice(){
        ChromeDriver driver=new ChromeDriver();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnMalaLagunaButton();
        MalaLaguna malaLaguna=new MalaLaguna(driver);
        malaLaguna.acceptCookies();
        malaLaguna.clickOnNajmladjiDo3Button();
        NajmladjiDo3 najmladjiDo3=new NajmladjiDo3(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        najmladjiDo3.clickOnSlikovniceButton();
        Slikovnice slikovnice=new Slikovnice();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle="Laguna - Mala Laguna - Knjige o kojima se priča";
        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }
}