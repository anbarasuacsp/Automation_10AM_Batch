package Seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_22052025 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement signilink = driver.findElement(By.xpath("//*[text()='Sign in']"));
        signilink.click();

        WebElement textpopup = driver.findElement(By.xpath("//div[@class='page-notice__main']"));
        String Expectednpopuptext = textpopup.getText();
        System.out.println("Text on Popup:   "+Expectednpopuptext);

        String actualtextonpopup = "To buy and sell on www.ebay.com or other eBay sites internationally, existing users can login using their credentials or new users can register an eBay account on ebay.in. Kindly note you can no longer buy or sell on eBay.in.";

        assert actualtextonpopup.equals(Expectednpopuptext);


        Thread.sleep(1000);

        WebElement createaccount = driver.findElement(By.id("create-account-link"));
        createaccount.click();
        Thread.sleep(1000);

        WebElement personaltag = driver.findElement(By.xpath("//button[@id='personalaccount-radio']"));
        personaltag.click();
        Thread.sleep(1000);

        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("gokila");
        Thread.sleep(3000);


        //Fluient wait///

//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(30))         // Maximum wait time
//                .pollingEvery(Duration.ofSeconds(2))         // Check every 2 seconds
//                .ignoring(NoSuchElementException.class);     // Ignore this exception while waiting
//
//
//















        driver.quit();







    }
}
