package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
    //before test
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com"); // без истории свежий браузер without history
        //driver.navigate().to("https://www.google.com"); // с историей - with history
        driver.navigate().back();
        driver.navigate().forward(); // ворачивает на предидущую страницу
        driver.navigate().refresh(); // обновляет страницу
    }
    //test
    @Test
    public void openBrowser(){
        System.out.println("Google opened!!!");
    }
    //after test
    @AfterMethod(enabled = false)// enabled = false оставляет страницу открытой, true - закрывает браузер автоматически
    public void tearDown(){
        driver.quit(); // all tabs and close browser
        //driver.close();//only one tab(if tab only one-> close browser)
    }
}
