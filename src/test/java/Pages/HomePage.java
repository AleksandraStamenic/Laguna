package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

    public class HomePage extends BasePage{
        ChromeDriver driver;
        String homePageUrl="https://laguna.rs/";


        public HomePage(ChromeDriver driver) {
            super(driver);
            driver.get(homePageUrl);
            this.driver = driver;

        }

        public Knjige clickonKnjigeButton(ChromeDriver driver){
            driver.findElement(By.xpath("//*[@id=\"glavni-meni\"]/li[2]")).click();
            return new Knjige(driver);
        }

        public KnjigeZaDecu clickonKnjigeZaDecuButton(){
            driver.findElement(By.xpath("//*[@id=\"spisak-knjiga-sidebar\"]/div/a[26]")).click();
            return new KnjigeZaDecu(driver);

        }





}
