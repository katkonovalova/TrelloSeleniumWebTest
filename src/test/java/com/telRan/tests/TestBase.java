package com.telRan.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws InterruptedException {
        app.init();
        app.login("katerynakonovalov@gmail.com", "A123123a_");
    }

    @AfterClass(enabled = true)
    public void tearDown() {
        app.stop();
    }

}
