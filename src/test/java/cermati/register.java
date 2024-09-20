package cermati;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class register {

    WebDriver driver;

    @BeforeTest

    private void init(){
        System.setProperty("webdriver.chrome.driver","/Users/macbook/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();

        driver.navigate().to("https://www.cermati.com/app/gabung");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    private void testGabung(){
        WebElement phoneField = driver.findElement(By.id("mobilePhone"));
        phoneField.sendKeys("08128649707");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("syarifudinzuhri45@gmail.com");
        WebElement inputFirstName = driver.findElement(By.id("firstName"));
        inputFirstName.sendKeys("Syarifudin");
        WebElement inputLastName = driver.findElement(By.id("lastName"));
        inputLastName.sendKeys("Zuhri");
        WebElement buttonRegister1 = driver.findElement(By.xpath("//button[contains(text(),'Daftar')]"));
        buttonRegister1.click();
    }

    @AfterTest
    private void closeBrowser(){
        driver.quit();
    }

}
