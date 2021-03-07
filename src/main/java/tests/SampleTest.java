package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.List;

import static java.lang.Thread.sleep;

public class SampleTest{
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver",
                "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        // identify element
        WebElement searchBox=driver.findElement(By.id("search"));
        searchBox.sendKeys("Puppy");
        // type enter with sendKeys method and pass Keys.RETURN
        searchBox.sendKeys(Keys.RETURN);
        sleep(6000);

        List<WebElement>  contents = driver.findElements(By.cssSelector("ytd-search-pyv-renderer #img"));

        String srcAttribute = contents.get(0).getAttribute("src");
        System.out.println(srcAttribute);

        Assert.assertEquals(srcAttribute, "https://i2.ytimg.com/vi/IPQAazegMQg/0.jpg");
        driver.close();
    }
}