package com.telRan.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void clickOnPlusButton() {
        click(By.xpath("//button[@data-test-id='header-create-menu-button']"));
    }

    public void selectCreateBoard() {
        click(By.xpath("//button[@data-test-id='header-create-board-button']"));
    }

    public void selectCreateTeam() {
        click(By.xpath("//button[@data-test-id='header-create-team-button']"));
    }

    public void returnOnHomePageFromBoard() {
        waitForElement(By.cssSelector(".js-add-list"), 30);
        click(By.cssSelector("[data-test-id='header-home-button']"));
    }

    public void returnOnHomePageFromTeam() {
        waitForElement(By.cssSelector(".tabbed-pane-header-content"), 30);
        click(By.cssSelector("[data-test-id='header-home-button']"));
    }

    public void logout() {
        clickOnAvatar();
        clickLogOut();
    }

    public void clickLogOut() {
        click(By.xpath("//button[@data-test-id='header-member-menu-logout']"));
    }

    public void clickOnAvatar() {
        click(By.xpath("//button[@data-test-id='header-member-menu-button']"));
    }

    public boolean isAvatarPresent(){
        return isElementPresent(By.xpath("//button[@data-test-id='header-member-menu-button']"));
    }

    public void clickOnMoreFromMenu() {
        click(By.xpath("//*[@class='board-menu-navigation']//*[@class='board-menu-navigation-item-link js-open-more']"));

    }

    public void exitFromAboutThisBord() {
        click(By.cssSelector("[class='board-menu-header-back-button icon-lg icon-back js-pop-widget-view']"));

    }
    public void closeBoardPlusConfirm() {
        click(By.xpath("//*[@class='board-menu-content-frame']//*[@class='board-menu-navigation-item-link js-close-board']"));
        click(By.cssSelector("[class='js-confirm full negate']"));
    }

    public void clickOnPermanentlyDeletePlusConfirm() {
        click(By.cssSelector("[class='quiet js-delete']"));
        click(By.cssSelector("[class='js-confirm full negate']"));
    }

    public void returnOnHomePageFromHeader() {
        click(By.cssSelector("[data-test-id='header-home-button']"));
    }

    public void openProfile() {

        click(By.cssSelector("[data-test-id='header-member-menu-profile']"));

    }
}
