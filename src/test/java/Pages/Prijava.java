package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prijava extends BasePage{
    ChromeDriver driver;
    String PrijavaUrl="https://laguna.rs/prijava.html";

    public Prijava(ChromeDriver driver){
        super(driver);
        driver.get(PrijavaUrl);
        this.driver=driver;
    }
    public Prijava clickOnPrijavaButton(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[7]/a[1]")).click();
        return new Prijava(driver);

    }
    public HomePage clickOnButtonPrijava(){
        driver.findElement(By.xpath("//*[@id=\"form-prijava-s\"]")).click();
        return new HomePage(driver);
    }
}
