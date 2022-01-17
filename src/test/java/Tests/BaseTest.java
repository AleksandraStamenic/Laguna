package Tests;

import Pages.BasePage;
import Pages.HomePage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    public HomePage clickonLagunaLogo(ChromeDriver driver){
        BasePage page=new BasePage(driver);
        page.LagunaLogo.click();
        return new HomePage(driver);
    }
    public void clickonSearchButton(ChromeDriver driver){
        BasePage page=new BasePage(driver);
        page.Search.click();
    }



}
