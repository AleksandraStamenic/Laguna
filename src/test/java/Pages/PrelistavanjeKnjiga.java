package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrelistavanjeKnjiga extends BasePage{
    ChromeDriver driver;
    String PrelistavanjeKnjigaUrl="https://www.laguna.rs/n5388_knjiga_put_ludog_konja_istorija_plemena_lakota_laguna.html";

     public PrelistavanjeKnjiga(ChromeDriver driver) {
        super(driver);
        driver.get(PrelistavanjeKnjigaUrl);
        this.driver=driver;
     }


}

