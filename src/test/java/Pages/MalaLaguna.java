package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MalaLaguna extends BasePage{
    ChromeDriver driver;
    String MalaLagunaUrl="https://laguna.rs/mala_laguna.html";

    public MalaLaguna(ChromeDriver driver){
        super(driver);
        driver.get(MalaLagunaUrl);
        this.driver=driver;

    }
    public MalaLaguna clickOnMalaLagunaButton(){
        driver.findElement(By.xpath("//*[@id=\"glavni-meni\"]/li[6]")).click();
        return new MalaLaguna(driver);
    }
    public NajmladjiDo3 clickOnNajmladjiDo3Button(){

        driver.findElement(By.xpath("//*[@id=\"mala-laguna-meni\"]/div[1]")).click();
        return new NajmladjiDo3(driver);
    }
}
