package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaliPrinc extends BasePage{
    ChromeDriver driver;
    String MaliPrincUrl="https://laguna.rs/n3092_knjiga_mali_princ_laguna.html";

    public MaliPrinc(ChromeDriver driver){
        super(driver);
        driver.get(MaliPrincUrl);
        this.driver=driver;
    }

    public MaliPrinc clickonMaliPrinc(){
        driver.findElement(By.xpath("//*[@id=\"top-lista-spiska\"]/div[2]/div/div[2]/div[1]/div/div[12]/div/div[2]/a[2]")).click();
        return new MaliPrinc(driver);
    }


}
