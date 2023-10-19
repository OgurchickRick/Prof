package service;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Pages;
import steps.Steps;

public class BaseTest implements Steps, Pages {

    Driver driver = new Driver();

    @BeforeMethod
    public void initTest() {
        driver.initDriver();
        Selenide.open("https://idemo.bspb.ru/");
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}

