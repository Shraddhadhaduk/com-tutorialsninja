package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisterners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LaptopAndNotebooksPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement laptopAndNotebooksLinkText;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement price;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement selectProduct;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macBookText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macBookText1;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement updateQty;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement modifiedText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOut;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckOut;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonLast;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement comments;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement agree;

    @CacheLookup
    @FindBy(xpath = "//input[@name = 'agree']")
    WebElement guestContinueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-warning alert-dismissible']")
    WebElement warningText;

    public String getLaptopAndNotebooksLinkText(){
        String message = getTextFromElement(laptopAndNotebooksLinkText);
        CustomListeners.test.log(Status.PASS, "verify text");
        return message;
    }

    public void sortByPrice(String sortBy){
        selectByVisibleTextFromDropDown(price, sortBy);
        CustomListeners.test.log(Status.PASS, "Verify price");
    }

    public void selectProductMacBook(){
        clickOnElement(selectProduct);
        CustomListeners.test.log(Status.PASS, "select product macbook");
    }

    public String verifyMacBook(){
       String message = getTextFromElement(macBookText);
       CustomListeners.test.log(Status.PASS, "verify product macbook");
       return message;
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "click on add to cart");
    }

    public String verifySuccessMessage(){
        String message = getTextFromElement(successText);
        CustomListeners.test.log(Status.PASS, "verify success message");
        return message;
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "click on shoppingcart");
    }
    public String verifyShoppingCartText(){
        String message = getTextFromElement(shoppingCartText);
        CustomListeners.test.log(Status.PASS, "verify text");
        return message;
    }
    public String verifyMacbookText(){
        String message = getTextFromElement(macBookText1);
        CustomListeners.test.log(Status.PASS, "verify macbook1 text");
        return message;
    }
    public void changeQuality(){
        Reporter.log(" enter Quantity" + changeQty.toString());
        CustomListeners.test.log(Status.PASS, " enterQuantity");
        sendTextToElement(changeQty, "");
    }
    public void clickOnUpdate(){
        clickOnElement(updateQty);
        CustomListeners.test.log(Status.PASS, "click on Update");

    }
    public String VerifyModifyText(){
        String message = getTextFromElement(modifiedText);
        CustomListeners.test.log(Status.PASS, "verify modify text");
        return message;
    }
    public String verifyTotalAmount(){
        String message = getTextFromElement(total);
        CustomListeners.test.log(Status.PASS, "verify total amount");
        return message;
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOut);
        CustomListeners.test.log(Status.PASS, "click on checkout");
    }
    public String verifyCheckOut(){
        String message = getTextFromElement(checkOutText);
        CustomListeners.test.log(Status.PASS, "verify checkout text");
        return message;
    }
    public String verifyNewCustomerText(){
        String message = getTextFromElement(newCustomerText);
        CustomListeners.test.log(Status.PASS, "verify new customer text");
        return message;
    }
    public void clickOnGuestCheckOut(){
        clickOnElement(guestCheckOut);
        CustomListeners.test.log(Status.PASS, "Click On guest CheckOut");
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button");
    }
    public void enterFirstName(String first){
        sendTextToElement(firstName, first);
        CustomListeners.test.log(Status.PASS, "Enter FirstName");
    }

    public void enterLastName(String last){
        sendTextToElement(lastName, last);
        CustomListeners.test.log(Status.PASS, "Enter Lastname");
    }
    public void enterEmail(String mail){
        sendTextToElement(email, mail);
        CustomListeners.test.log(Status.PASS, "Enter email");
    }
    public void enterPhoneNumber(String number){
        sendTextToElement(telephone, number);
        CustomListeners.test.log(Status.PASS, "Enter Phone Number");
    }
    public void enterAddress1(String address){
        sendTextToElement(address1, address);
        CustomListeners.test.log(Status.PASS, "Enter address");
    }
    public void enterCity(String town){
        sendTextToElement(city, town);
        CustomListeners.test.log(Status.PASS, "Enter city");
    }
    public void enterPostCode(String code){
        sendTextToElement(postcode, code);
        CustomListeners.test.log(Status.PASS, "Enter postcode");
    }
    public void selectCountry(String value){
        selectByVisibleTextFromDropDown(country, value);
        CustomListeners.test.log(Status.PASS, "Enter country");
    }
    public void selectRegion(String value){
        selectByVisibleTextFromDropDown(region, value);
        CustomListeners.test.log(Status.PASS, "Enter region");
    }
    public void clickOnContinueCheckOut(){
        clickOnElement(continueButtonLast);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button");
    }
    public void enterComment(String comment){
        sendTextToElement(comments, comment);
        CustomListeners.test.log(Status.PASS, "Enter comment");
    }
    public void clickOnAgree(){
        clickOnElement(agree);
        CustomListeners.test.log(Status.PASS, "Click on Agree");
    }
    public void clickOnGuestContinue(){
        clickOnElement(guestContinueButton);
        CustomListeners.test.log(Status.PASS, "Click on Guest Continue Button");
    }
    public String verifyPaymentWarning(){
        String message = getTextFromElement(warningText);
        CustomListeners.test.log(Status.PASS, "verify Warning text");
        return message;

    }


}
