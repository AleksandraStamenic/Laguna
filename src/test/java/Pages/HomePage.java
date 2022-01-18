package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.Keys.ENTER;

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
        public void searchByText(String searchText){
            String inputXpath= "//*[@id=\"pretraga_rec\"]";
            driver.findElement(By.xpath(inputXpath)).sendKeys(searchText);
            driver.findElement(By.xpath(inputXpath)).sendKeys(ENTER);

        }
    public ZmajevaRiznica clickOnZmajevaRiznica(){
        driver.findElement(By.xpath("//*[@id=\"spisak-knjiga-knjige\"]/div[3]/div[2]/a[1]")).click();
        return new ZmajevaRiznica(driver);
    }

    public void clickOnDodajUKorpuButton(){
        driver.findElement(By.xpath("//*[@id=\"dugme-korpa\"]")).click();
    }





        }






