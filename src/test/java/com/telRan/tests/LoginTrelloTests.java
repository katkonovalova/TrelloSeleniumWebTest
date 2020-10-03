package com.telRan.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
       if(app.isAvatarPresent()){
           app.logout();
       }
    }

    @Test
    public void testLoginPositiveTest() throws InterruptedException {

        app.login("katerynakonovalov@gmail.com", "A123123a_");
        Assert.assertTrue(app.isAvatarPresent());
    }

    @Test
    public void negativeTestLoginPositiveTest() throws InterruptedException {

        app.login("katerynakonovalov@gmail.com", "A123123a");

        Assert.assertTrue(app.isLoginErrorPresent());
        Assert.assertFalse(app.isAvatarPresent());
    }


}
