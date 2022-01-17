package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class Knjige extends BasePage{
    ChromeDriver driver;
    String KnjigeUrl= "https://laguna.rs/s_laguna_knjige_spisak_naslova.html";

   @FindBy (xpath = "//*[@id=\"spisak-knjiga-sidebar\"]/div/a[26]")
   private WebElement knjigeZaDecuButton;

   public Knjige(ChromeDriver driver) {
        super(driver);
        driver.get(KnjigeUrl);
        this.driver=driver;

    }
    public void clickonKnjigeZaDecuButton(){
        scrollIntoView(knjigeZaDecuButton);
        knjigeZaDecuButton.click();

    }



}
