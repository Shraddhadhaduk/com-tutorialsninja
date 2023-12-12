package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisterners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='input-sort'])[1]")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement poundSterling;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='input-sort'])[1]")
    WebElement sortByAtoZ;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='HTC Touch HD'])[1]")
    WebElement selectHTCTouchHD;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='iPhone'])[1]")
    WebElement selectIphone;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Palm Treo Pro'])[1]")
    WebElement selectPalmTreoPro;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='input-quantity'])[1]")
    WebElement qtyHTC;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='input-quantity'])[1]")
    WebElement qtyIphone;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='input-quantity'])[1]")
    WebElement qtyPalm;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(id = "input-limit")
    WebElement enterQty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart1;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Model']")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Total')]")
    WebElement total;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;



    public String verifyDesktopsText(){
        String message = getTextFromElement(desktopsText);
        CustomListeners.test.log(Status.PASS, "Verify desktops Text");
        return message;
    }

    public void clickOnSortBy(){
        clickOnElement(sortBy);
    }
    public void mouseHoverOnCurrency(){
        mouseHoverToElement(currency);
    }

    public void clickOnCurrency(){
        clickOnElement(currency);
    }

    public void clickOnAtoZ(){
        clickOnElement(sortByAtoZ);
    }
    public void clickOnShowAllDesktops() {
        clickOnElement(showAllDesktops);
        CustomListeners.test.log(Status.PASS, "click on AllDesktops");
    }


    public void enterQuantity() {
        CustomListeners.test.log(Status.PASS, " enterQuantity");
        sendTextToElement(enterQty, "");
    }
    public void clickOnAddToCart() {
        CustomListeners.test.log(Status.PASS, "click on add to cart");
        clickOnElement(addToCart);
    }
    public String getSuccessText() {
        CustomListeners.test.log(Status.PASS, "get success text");
        return getTextFromElement(successMessage);

    }
    public String clickOnShoppingCart(){
        CustomListeners.test.log(Status.PASS, "click on shopping cart");
        return getTextFromElement(shoppingCart1);

    }
    public void clickOnShoppingCart1() {
        CustomListeners.test.log(Status.PASS, "click on shopping cart");
        clickOnElement(shoppingCart);
    }
    public String verifyProductName() {
        CustomListeners.test.log(Status.PASS, "verify ProductName");
        return getTextFromElement(productName);

    }
    public String verifyModel(){
        CustomListeners.test.log(Status.PASS, "verify Model");
        return getTextFromElement(model);

    }
    public String verifyTotal(){
        CustomListeners.test.log(Status.PASS, "verify Total");
        return getTextFromElement(total);

    }



}
