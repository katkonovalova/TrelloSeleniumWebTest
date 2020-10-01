package com.telRan.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTrelloTests {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        //create new instance of WebDriver(ex. open ChromeBrowser)
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        //open site
        wd.navigate().to("https://trello.com/");
    }
    @Test
    public void testLoginPositiveTest() throws InterruptedException {

        login("katerynakonovalov@gmail.com", "A123123a_");
        Assert.assertTrue(isAvatarPresent());
    }

    public void login(String email, String password) throws InterruptedException {
        click(By.cssSelector("[href='/login']"));
        type(By.name("user"), email);

        click(By.id("login"));

        Thread.sleep(10000);
        type(By.id("password"), password);
        click(By.id("login-submit"));
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }
    public boolean isAvatarPresent(){
       // return wd.findElements(By.xpath("//button[@data-test-id='header-member-menu-button']")).size()>0;
        return isElementPresent(By.xpath("//button[@data-test-id='header-member-menu-button']"));
    }
    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }

    @AfterClass
    public void tearDown(){

    }


}
