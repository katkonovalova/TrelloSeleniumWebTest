package com.telRan.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ProfileHelper extends HelperBase{

    public ProfileHelper(WebDriver wd) {
        super(wd);
    }



    public void switchToAtlassianAccWindow() {

            String trello = wd.getWindowHandle();
            System.out.println(trello);
            click(By.cssSelector("a[href$=manage-profile]"));

            List<String> availableWindows = new ArrayList<>(wd.getWindowHandles());
            if (!availableWindows.isEmpty()){
                wd.switchTo().window(availableWindows.get(1));
            }

            //now selenium on Atlassian page
            String atlassianAcc = wd.getWindowHandle();
            System.out.println(atlassianAcc);

        }


    public void changeAvatar() {
        new Actions(wd).moveToElement(wd.findElement(By.cssSelector("[class='sc-esOvli bGTaHH']"))).perform();
        click(By.cssSelector("[class='sc-kGXeez hVWWLl']"));
    }
}

