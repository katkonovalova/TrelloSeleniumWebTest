package com.telRan.tests.tests;

import org.testng.annotations.Test;

public class UserProfileModificationTest extends TestBase{

    @Test

    public void testChangeAvatarFromUser(){
        app.header().clickOnAvatar();
        app.header().openProfile();
        app.profile().switchToAtlassianAccWindow();
        app.profile().changeAvatar();

    }
}
