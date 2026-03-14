package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_13 {

    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByTagNameTest(){
        WebElement strong = driver.findElement(By.tagName("strong"));
        System.out.println(strong.getText());
    }
    @Test
    public void findElementByClassName(){
        WebElement account = driver.findElement(By.className("account"));
        System.out.println(account.getText());
    }
    @Test
    public void findElementById(){
        WebElement id = driver.findElement(By.id("mob-menu-button"));
        System.out.println(id.getDomAttribute("id"));
    }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
