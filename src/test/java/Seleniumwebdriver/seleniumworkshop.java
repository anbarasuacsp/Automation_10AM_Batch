package Seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class seleniumworkshop {
public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.ebay.com");

     driver.manage().window().maximize();

     driver.findElement(By.id("gh-ac")).sendKeys("iphone 16 pro max");

     driver.findElement(By.id("gh-search-btn")).click();

     driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 16 Pro Max - 256 GB - Black Titanium ')]")).click();


     Thread.sleep(4000);








     driver.quit();
    }
}
