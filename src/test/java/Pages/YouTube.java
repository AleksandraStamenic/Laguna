package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube extends BasePage{
    ChromeDriver driver;
    String YouTubeUrl="https://www.youtube.com/user/lagunaknjige";

    public YouTube(ChromeDriver driver){
        super(driver);
        driver.get(YouTubeUrl);
        this.driver=driver;
    }
}
