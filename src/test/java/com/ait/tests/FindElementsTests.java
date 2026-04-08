package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://icarro-v1.netlify.app/search?page=0&size=10");
        driver.manage().window().maximize(); //открывает полноразмерное окно браузера
        //driver.manage().window().setSize(new Dimension(900, 400)); //открывает окно браузера по заданным параметрам
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // указывается время ожидания всех элементов на странице
       //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //для тяжёлых сайтов

    }
    @Test
    public void findElementByTagNameTest(){
        // Поиск WEB ELEMENT
        // Поиск элемента по тексту стратегия ByTagName h1
        WebElement element = driver.findElement(By.tagName("h1")); // Alt+Enter горячие клавиши
        System.out.println(element.getText());

        // Поиск элемента по тексту стратегия ByTagName h2
       // driver.findElement(By.tagName("h2")); после написания этой строки зажимаем горячие клавиши, и ещё раз энтер,
        //получается такая строка:
        WebElement element1 = driver.findElement(By.tagName("h2"));
        System.out.println(element1.getText());

        // Поиск элемента по тексту стратегия ByTagName - <a
        WebElement link = driver.findElement(By.tagName("a"));
        System.out.println(link.getText());

        // Поиск WEB elementS по - a
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        // Поиск WEB element по - label
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println(label.getText());

    }
    @Test
    public void findElementById(){
        // Поиск WEB element по - id
        WebElement city = driver.findElement(By.id("city"));
        System.out.println(city.getDomAttribute("id"));

        WebElement dates = driver.findElement(By.id("dates"));
        System.out.println(dates.getDomAttribute("id"));

    }
    @Test
    public void findElementByClassName(){
        WebElement telephone = driver.findElement(By.className("telephone"));
        System.out.println(telephone.getText());

        WebElement search = driver.findElement(By.className("navigation-link"));
        System.out.println(search.getText());
        System.out.println(search.getDomAttribute("class"));
    }

    @Test
    public void findElementByLinkText(){
        WebElement linkText = driver.findElement(By.linkText("Let car work"));
        System.out.println(linkText.getText());

        WebElement linkText2 = driver.findElement(By.linkText("Los Angeles"));
        System.out.println(linkText2.getText());
    }

    @Test
    public void findElementByPartialLinkText(){
        WebElement partialLinkText = driver.findElement(By.partialLinkText("work"));
        System.out.println(partialLinkText.getText());
    }

    @Test
    public void findElementByCssSelector(){
        // driver.findElement(By.tagName("h1"));
        // tagName h1 -> css "h1"
        driver.findElement(By.cssSelector("h1"));

        // driver.findElement(By.id("city"));
        // id = ''city -> css #city
        driver.findElement(By.cssSelector("#city"));

        // driver.findElement(By.className("telephone"));
        // className = 'telephone' -> css .telephone
        driver.findElement(By.cssSelector(".telephone"));

        // contains -> * (звёздочка это - ищи везде)
        driver.findElement(By.cssSelector("[class*='container']"));

        // start -> ^ (крышечка это - ищи в начале)
        driver.findElement(By.cssSelector("[class^='input']"));

        // end to -> $ (доллар это - ищи в конце)
        driver.findElement(By.cssSelector("[class$='icon']"));

        // [key='value']
        driver.findElement(By.cssSelector("[placeholder='City']"));

        // composite tag + class + class ( это составной cssSelector)
        driver.findElement(By.cssSelector("a.navigation-link.active"));

        // one step below (один шаг в низ)
        driver.findElement(By.cssSelector(".logo>img"));

        //<tag> or >class> or <id>:nth-child(n)
        WebElement feedback = driver.findElement(By.cssSelector(".feedback-card:nth-child(1)"));
        System.out.println(feedback.getText());

        //
        WebElement search = driver.findElement(By.cssSelector("navigation-link:nth-child(2)"));
        System.out.println(search.getText());

    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }

}
