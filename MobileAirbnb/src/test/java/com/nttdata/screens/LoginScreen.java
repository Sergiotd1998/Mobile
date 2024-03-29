package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    //@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    @AndroidFindBy(className = "android.widget.ImageButton")
    private WebElement btnClose;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_simple_search_footer_link\"]")
    private WebElement skiptest;

    public void clickClose(){

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnClose));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        btnClose.click();



    }

    }

