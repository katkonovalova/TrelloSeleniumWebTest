package com.telRan.tests.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
       if(app.header().isAvatarPresent()){
           app.header().logout();
       }
    }

    @Test
    public void testLoginPositiveTest() throws InterruptedException {

        app.session().login("katerynakonovalov@gmail.com", "A123123a_");
        Assert.assertTrue(app.header().isAvatarPresent());
    }

    @Test
    public void negativeTestLoginPositiveTest() throws InterruptedException {

        app.session().login("katerynakonovalov@gmail.com", "A123123a");

        Assert.assertTrue(app.session().isLoginErrorPresent());
        Assert.assertFalse(app.header().isAvatarPresent());
    }


}
