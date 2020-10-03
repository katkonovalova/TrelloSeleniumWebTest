package com.telRan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {
    @Test
    public void boardCreationTest() {
        int before = app.getBoardsCount();
        app.clickOnPlusButton();
        app.selectCreateBoard();
        app.fillBoardForm("new qa24 board","public");
        app.confirmBoardCreation();
        app.returnOnHomePage();
        int after = app.getBoardsCount();
        //personal boards count before and after
        Assert.assertEquals(after, before+1);
        System.out.println("was: " + before+ "for now :" + after);
    }

    @Test
    public void boardCreationTest2() {
        app.clickOnPlusButton();
        app.selectCreateBoard();
        app.fillBoardForm("qa24","private");
        app.confirmBoardCreation();
        app.returnOnHomePage();
        //personal boards count before and after
    }

}
