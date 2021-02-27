package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class SampleTest {

    public static void main(String[] args) {


//setting the driver executable
        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

//Initiating your chromedriver
        WebDriver driver=new ChromeDriver();

//Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
        driver.manage().window().maximize();

//open browser with desried URL
        driver.get("https://www.google.com");

//closing the browser
        driver.close();

    }

}
