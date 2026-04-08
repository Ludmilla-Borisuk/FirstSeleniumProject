package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_17 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByxPath(){
        // 1. register link
        driver.findElement(By.xpath("//a[@href='/register']"));

        // 2. search input
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        // 3. login link
        driver.findElement(By.xpath("//a[@href='/login']"));

        // 4. shopping cart link
        driver.findElement(By.xpath("//span[@class='cart-label']"));

        // 5. wishlist link
        driver.findElement(By.xpath("//a[@href='/wishlist']"));

        // 6. search button
        driver.findElement(By.xpath("//input[contains(@class,'search-box-button')]"));

        // 7. main page logo
        driver.findElement(By.xpath("//div[@class='header-logo']//img"));

        // 8. top menu (Books category)
        driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/books']"));

        // 9. newsletter input
        driver.findElement(By.xpath("//input[@id='newsletter-email']"));

        // 10. subscribe button
        driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

