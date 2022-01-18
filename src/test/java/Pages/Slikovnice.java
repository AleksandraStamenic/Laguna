package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Slikovnice extends BasePage{

    ChromeDriver driver;
    String SlikovniceUrl="https://laguna.rs/mala-laguna-knjige.html?g[]=1&z[]=33";

    public Slikovnice(ChromeDriver driver){
        super(driver);
        driver.get(SlikovniceUrl);
        this.driver=driver;

    }
}
