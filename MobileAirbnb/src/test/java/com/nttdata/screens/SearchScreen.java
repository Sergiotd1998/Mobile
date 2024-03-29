package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "com.airbnb.android:id/search_bar")
    private WebElement searchInput;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_simple_search_footer_link\"]")
    private WebElement clickSkipe;
    @AndroidFindBy(id = "2131431007")
    private WebElement resultText;



    public void clickSearchInput(){
        searchInput.click();
    }

    public String getResultText(){
        return resultText.getText();
    }

    public void clickSkipe() {
        searchInput.click();
    }
}
