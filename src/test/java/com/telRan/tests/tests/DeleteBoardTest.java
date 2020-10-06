package com.telRan.tests.tests;

import com.telRan.tests.fw.HelperBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase{
    @Test
    public void deleteBoardTest(){
        int before = app.board().getBoardsCount();
        app.board().clickOnTheFirstBoard();
        app.header().exitFromAboutThisBord();
        app.header().clickOnMoreFromMenu();
        app.header().closeBoardPlusConfirm();
        app.header().clickOnPermanentlyDeletePlusConfirm();
        app.header().returnOnHomePageFromHeader();
        int after = app.board().getBoardsCount();
        System.out.println("was: " + before + " now: " + after);
        Assert.assertEquals(after, before-1);

    }




}
