package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;



public class KnjigeZaDecu extends BasePage{
    ChromeDriver driver;
    String KnjigeZaDecuUrl= "https://laguna.rs/z32_zanr_knjige_za_decu_laguna.html";

    public KnjigeZaDecu clickonKnjigeZaDecuButton(){
        driver.findElement(By.xpath("//*[@id=\"spisak-knjiga-sidebar\"]/div/a[26]"));
        return new KnjigeZaDecu(driver);
    }


    public KnjigeZaDecu(ChromeDriver driver) {
        super(driver);
        driver.get(KnjigeZaDecuUrl);
        this.driver=driver;
    }

    public ArrayList<WebElement>getlistOfDecijeKnjige(){
        ArrayList<WebElement>listOfDecijeKnjige=new ArrayList <> (driver.findElements(By.xpath("//*[@id=\"top-lista-spiska\"]/div[2]/div/div[2]/div[1]/div/div")));
        return listOfDecijeKnjige;

    }
    public ArrayList<String>getNaslovKnjige(){
        ArrayList<WebElement>listOfDecijeKnjige=new ArrayList <> (driver.findElements(By.xpath("//*[@id=\"top-lista-spiska\"]/div[2]/div/div[2]/div[1]/div/div")));
        ArrayList<String>nasloviknjiga= new ArrayList<>();
        for (int i=0; i< listOfDecijeKnjige.size();i++){
            String naslovknjige=listOfDecijeKnjige.get(i).getText();
            nasloviknjiga.add(naslovknjige);
        }
        return nasloviknjiga;

    }

 //   public String getDecijaKnjigaofDecijeKnjige(WebElement product){
 //       return product.getText();
 //   }



}



