package com.telRan.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        //click on login button on welcome page
        wd.findElement(By.cssSelector("[href='/login']")).click();
        //fillLoginForm
        //fillEmail
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("katkonovalova88@gmail.com");
        //wait
        Thread.sleep(10000);
        //fillPassword
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Aa123123_");
        //clickSubmitButton
        wd.findElement(By.id("login")).click();
        //userLoggedIn


    }
    @AfterClass
    public void tearDown(){

    }

}
