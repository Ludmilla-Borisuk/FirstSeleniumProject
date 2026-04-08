// Homework
//В домашнем тестовом классе создайте, пожалуйста, тестовый метод,
// где вы будете искать 10 элементов используя локаторы By.CSS
package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_16 {

    public class FindDemoWebShopElement {
        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        @Test
        public void findElementByCssSelector() {
            // 1. register link
            driver.findElement(By.cssSelector("[href='/register']"));

            // 2. search input
            driver.findElement(By.cssSelector("#small-searchterms"));

            // 3. login link
            driver.findElement(By.cssSelector("[href='/login']"));

            // 4. shopping cart link
            driver.findElement(By.cssSelector(".cart-label"));

            // 5. wishlist link
            driver.findElement(By.cssSelector("[href='/wishlist']"));

            // 6. search button
            driver.findElement(By.cssSelector("input.button-1.search-box-button"));

            // 7. main page logo
            driver.findElement(By.cssSelector(".header-logo img"));

            // 8. top menu (Books category)
            driver.findElement(By.cssSelector(".top-menu [href='/books']"));

            // 9. newsletter input
            driver.findElement(By.cssSelector("#newsletter-email"));

            // 10. subscribe button
            driver.findElement(By.cssSelector("#newsletter-subscribe-button"));

        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }
}
