package Seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumworkshop {
public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.ebay.com");

     driver.manage().window().maximize();
     //Implicit wait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


     // Explicit wait
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
     WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='hgfjhf']")));
     input.sendKeys();
     input.getText();





     WebElement inputfield = driver.findElement(By.id("gh-ac"));
//     inputfield.sendKeys("iphone 16 pro");

     System.out.println(inputfield.getText());
     WebElement searchbtn = driver.findElement(By.id("gh-search-btn"));
     searchbtn.click();

     Thread.sleep(4000); // Default wait
     // driver.findElement(By.id("gh-search-btn")).click();
    // driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 16 Pro Max - 256 GB - Black Titanium ')]")).click();
     driver.quit();








    }
}
