package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.sql.DriverManager.getDriver;

public class BasePage {
    private ChromeDriver driver;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]")
    public WebElement LagunaLogo;

    @FindBy(xpath = "//*[@id=\"header\"]/div[4]")
    public WebElement Search;

    @FindBy(xpath = "//*[@id=\"header\"]/div[7]")
    public WebElement Prijava;

    @FindBy (id= "korpa_broj")
    public WebElement Korpa;

    @FindBy(id = "pretraga_submit")
    public WebElement SearchButton;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    private Object getDriver() {
        return new ChromeDriver();
    }

    public void setDriver(Object driver) {
        this.driver = (ChromeDriver) driver;
    }

    public void acceptCookies (){
     driver.findElement(By.xpath("//*[@id=\"gdpr-box\"]/div/div[2]/a")).click();

    }




    public void setDriver(ChromeDriver driver) {
        this.driver = driver;
    }
}



