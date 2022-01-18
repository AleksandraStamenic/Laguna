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

    public Korpa clickOnKorpaButton(){
            driver.findElement(By.xpath("//*[@id=\"korpa_broj\"]")).click();
            return new Korpa(driver);

    }
    public Prijava clickOnPrijavaButton(){
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[7]/a[1]")).click();
            return new Prijava(driver);
    }
    public void clickOnButtonPrijava(){
            driver.findElement(By.xpath("//*[@id=\"form-prijava-s\"]")).click();
    }
    public MalaLaguna clickOnMalaLagunaButton(){
            driver.findElement(By.xpath("//*[@id=\"glavni-meni\"]/li[6]")).click();
            return new MalaLaguna(driver);
    }
    public NajmladjiDo3 clickOnNajmladjiDo3Button(){
            driver.findElement(By.xpath("//*[@id=\"mala-laguna-meni\"]/div[1]")).click();
            return new NajmladjiDo3(driver);
    }
    public Slikovnice clickOnSlikovniceButton(){
            driver.findElement(By.xpath("//*[@id=\"mala-laguna-sidebar\"]/div[3]/div[33]/labe")).click();
            return new Slikovnice(driver);
    }

    public void clickOnSecondPoint(){
            driver.findElement(By.xpath("//*[@id=\"slider-naslovna\"]/div[2]/span[2]")).click();
    }
    public void clickOnThirdPoint(){
            driver.findElement(By.xpath("//*[@id=\"slider-naslovna\"]/div[2]/span[3]")).click();
    }
    public void clickOnFourthPoint(){
            driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/span[4]")).click();
    }
    public PrelistavanjeKnjiga clickOnPrelistavanjeKnjiga(){
            driver.findElement(By.xpath("//*[@id=\"slider-naslovna\"]/div[1]/div[4]/div/a/picture/img")).click();
            return new PrelistavanjeKnjiga(driver);
    }





        }






