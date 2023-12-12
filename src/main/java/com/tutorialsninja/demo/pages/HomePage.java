package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisterners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

     //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
     //1.2 This method should click on the menu whatever name is passed as parameter.
     //Write the following Test:
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAllDesktopsLink;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNotebooksLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement showAllLaptopAndNotebooksPage;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllComponents']")
    WebElement showAllComponentLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;

    public void mouseHoverOnDesktopsLink(){
        mouseHoverToElement(desktopsLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover on desktops");
    }

    public void clickOnShoeAllOptions(){
        clickOnElement(showAllDesktopsLink);
        CustomListeners.test.log(Status.PASS, "Click on show all desktops link");
    }
    public void mouseHoverOnLaptopAndNotebooksLink(){
        mouseHoverToElement(laptopAndNotebooksLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover on laptopsAndNotebooks");
    }

    public void clickOnShowAllLaptopAndNotebooksLink(){
        clickOnElement(showAllLaptopAndNotebooksPage);
        CustomListeners.test.log(Status.PASS, "Click on show all laptopsAndNotebooks link");
    }
    public void mouseHoverOnComponentLink(){
        mouseHoverToElement(componentLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover on component");
    }
    public void clickOnShowAllComponentLink(){
        clickOnElement(showAllComponentLink);
        CustomListeners.test.log(Status.PASS, "Click on show all component link");
    }

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
        CustomListeners.test.log(Status.PASS, "Click on my account link");
    }
}
