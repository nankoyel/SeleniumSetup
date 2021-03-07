package tests;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.List;

import static java.lang.Thread.sleep;

public class TextBoxTest {

    public static void main(String[] args) throws InterruptedException{

        //Setup chrome driver
        System.setProperty("webdriver.chrome.driver",
                "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch the website to be tested
        driver.get("https://demoqa.com/text-box");

        // Identify Full Name field's ID and enter Full Name
        WebElement fullName=driver.findElement(By.id("userName"));
        fullName.sendKeys("Test Full Name");

        // Identify Email field's ID and enter a valid email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("test@email.com");

        // Identify Current Address field's ID and enter a valid Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("134 ABC Road, Calgary");

        // Identify Permanent Address field's ID and enter a valid Address
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("134 DEF Road, Calgary");

        // Identify Submit button's ID and click the button
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();

        //Put some sleep and scroll down so that we can see the execution and output of the form submission
        sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");

        //Now verify whether the form is submitted and all fields are shown

        //Identify the ID of the Name value from the output section
        WebElement nameElement=driver.findElement(By.id("name"));
        Assert.assertEquals(nameElement.getText(), "Name:Test Full Name");

        //Identify the ID of the Email value from the output section
        WebElement emailElement=driver.findElement(By.id("email"));
        Assert.assertEquals(emailElement.getText(), "Email:test@email.com");

        //Identify the ID of the Current Address value from the output section
        WebElement currentAddressElement=driver.findElement(By.cssSelector("#output #currentAddress"));
        Assert.assertEquals(currentAddressElement.getText(), "Current Address :134 ABC Road, Calgary");

        //Identify the ID of the Permanent Address value from the output section
        WebElement permanentAddressElement=driver.findElement(By.cssSelector("#output #permanentAddress"));
        Assert.assertEquals(permanentAddressElement.getText(), "Permananet Address :134 DEF Road, Calgary");

        driver.close();
    }
}