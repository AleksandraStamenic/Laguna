package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZmajevaRiznica extends BasePage{
    ChromeDriver driver;
    String ZmajevaRiznicaUrl="https://laguna.rs/n3112_knjiga_zmajeva_riznica_laguna.html";

    public ZmajevaRiznica clickOnZmajevaRiznica(){
        driver.findElement(By.xpath("//*[@id=\"spisak-knjiga-knjige\"]/div[3]/div[2]/a[1]")).click();
        return new ZmajevaRiznica(driver);
    }

    public ZmajevaRiznica(ChromeDriver driver){
        super(driver);
        driver.get(ZmajevaRiznicaUrl);
        this.driver=driver;
    }
    public void clickOnDodajUKorpuButton(){
        driver.findElement(By.xpath("//*[@id=\"dugme-korpa\"]")).click();
    }
    public Korpa clickOnKorpaButton(){
        driver.findElement(By.xpath("//*[@id=\"korpa_broj\"]")).click();
        return new Korpa(driver);

    }
}
