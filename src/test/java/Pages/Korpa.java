package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Korpa extends BasePage{
    ChromeDriver driver;
    String KorpaUrl="https://laguna.rs/spisak_korpa.html";

    public Korpa(ChromeDriver driver){
        super(driver);
        driver.get(KorpaUrl);
        this.driver=driver;
    }
    public Korpa clickOnKorpaButton(){
        driver.findElement(By.xpath("https://laguna.rs/spisak_korpa.html")).click();
        return new Korpa(driver);
    }
}
