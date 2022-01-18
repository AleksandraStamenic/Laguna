package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NajmladjiDo3 extends BasePage{
    ChromeDriver driver;
    String NajmladjiDo3Url="https://laguna.rs/sg1_starosne_grupe_najmladji_do_3_god_laguna.html";

    public NajmladjiDo3(ChromeDriver driver){
        super(driver);
        driver.get(NajmladjiDo3Url);
        this.driver=driver;
    }
    public NajmladjiDo3 clickOnNajmladjiDo3Button(){
        driver.findElement(By.xpath("//*[@id=\"mala-laguna-meni\"]/div[1]")).click();
        return new NajmladjiDo3(driver);
    }

    public Slikovnice clickOnSlikovniceButton(){
        driver.findElement(By.xpath("//*[@id=\"mala-laguna-sidebar\"]/div[3]/div[33]/label")).click();
        return new Slikovnice(driver);
    }




}
