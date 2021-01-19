package com.telran.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener extends AbstractWebDriverEventListener {

    public MyListener() {

    }

    Logger logger = LoggerFactory.getLogger(MyListener.class);


    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver wd) {
        logger.info("Start search ->" +by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver wd) {
        logger.info(by + "<- found");
    }

    @Override
    public void onException(Throwable throwable, WebDriver wd) {
        logger.error(throwable.toString());
        String pathToScreenshot = "src/test/screenshots/screen-"+ System.currentTimeMillis()+ ".png";

        HelperBase helperBase = new HelperBase(wd);
        helperBase.takeScreenshot(pathToScreenshot);
        logger.error(pathToScreenshot);
    }

}
