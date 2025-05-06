package Seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

        public class seleniumworkshop {

            public static void main(String[] args) {
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.ebay.com");
                driver.manage().window().maximize();

//        WebDriver driver1 = new EdgeDriver();
//        WebDriver driver2 = new FirefoxDriver();
//        WebDriver driver3 = new SafariDriver();
//        WebDriver driver4 = new ChromeDriver();





    }
}
