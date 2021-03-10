package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TextBoxDemoTest {

//     Requirements
//     1. Go to https://demoqa.com/text-box
//     2. Manually test the form by entering all the fields and submitting the form
//     3. Identify the locators for all the fields (Right click > inspect element > grab the value of id)
//     4. Start writing the automation script
//     5. Verify form is getting submitted and all the entered fields are showing up on the output section

    public static void main(String[] args) throws InterruptedException{

        // Setup chrome driver
        System.setProperty("webdriver.chrome.driver",
                "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch the website to be tested
        driver.get("https://demoqa.com/text-box");

        // Implicit Wait directs the Selenium WebDriver to wait for a certain measure of
        // time before throwing an exception. Once this time is set,
        // WebDriver will wait for the element before the exception occurs.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Identify Full Name field's ID and enter Full Name
        WebElement fullName=driver.findElement(By.id("userName"));
        fullName.sendKeys("Test Full Name");

        // Identify Email field's ID and enter a valid email



        // Identify Current Address field's ID and enter a valid Address



        // Identify Permanent Address field's ID and enter a valid Address



        // Identify Submit button's ID and click the button
        // Hint: use click()



        // Put some sleep and scroll down so that we can see the execution and output of the form submission
        // Sleep is not a good practice to use in the script. This is used only for debugging and see how the browser behaves
        sleep(6000);
        WebElement element = driver.findElement(By.id("output"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        // Now verify whether the form is submitted and all fields are shown



        // Identify the ID of the Name value from the output section
        WebElement nameElement=driver.findElement(By.id("name"));
        Assert.assertEquals(nameElement.getText(), "Name:Test Full Name");

        // Identify the ID of the Email value from the output section



        // Identify the ID of the Current Address value from the output section
        // Note: Have to use By.cssSelector and grab #output as #currentAddress is not unique ID
        WebElement currentAddressElement=driver.findElement(By.cssSelector("#output #currentAddress"));
        Assert.assertEquals(currentAddressElement.getText(), "Current Address :134 ABC Road, Calgary");

        // Identify the ID of the Permanent Address value from the output section
        // Note: Have to use By.cssSelector and grab #output along with #permanentAddressas above example #permanentAddress
        // is not unique ID - follow above example



        // Close the driver - close the browser
        driver.close();
    }
}