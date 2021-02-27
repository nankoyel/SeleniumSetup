package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;



public class SampleTest {

    public static void main(String[] args) {
//setting the driver executable
        System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");

//Initiating your chromedriver
        WebDriver driver=new ChromeDriver();

//Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
        driver.manage().window().maximize();

//open browser with desried URL
        driver.get("https://www.youtube.com");
        WebElement searchField = driver.findElement(By.id("search"));
        searchField.sendKeys("Funny Developer Videos");
        searchField.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//closing the browser
        //driver.close();

    }

}
