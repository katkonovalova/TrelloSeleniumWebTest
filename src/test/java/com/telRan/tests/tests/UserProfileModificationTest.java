package com.telRan.tests.tests;

import org.testng.annotations.Test;

public class UserProfileModificationTest extends TestBase{

    @Test

    public void testChangeAvatarFromUser() throws InterruptedException {
        app.header().clickOnAvatar();
        app.header().openProfile();
        app.profile().switchToAtlassianAccWindow();
        app.profile().changeAvatar();


    }
}
