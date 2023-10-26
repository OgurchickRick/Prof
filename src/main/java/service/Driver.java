package service;

import com.codeborne.selenide.Configuration;

public class Driver {

    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.screenshots = false;
    }
}
