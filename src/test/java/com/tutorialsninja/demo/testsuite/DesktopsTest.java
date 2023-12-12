package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisterners.CustomListeners;
import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Listeners(CustomListeners.class)
public class DesktopsTest extends BaseTest {
     HomePage homePage;
     DesktopsPage desktopsPage;
    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
    }

    @Test(groups = {"sanity","smoke","regrassion"})
    public void verifyProductArrangeInAlphabeticalOrder(){
        //1.1 Mouse hover on Desktops Tab. and click
        homePage.mouseHoverOnDesktopsLink();
        //1.2 Click on “Show All Desktops”
        homePage.clickOnShoeAllOptions();
        //get list before filter name
        List<WebElement> beforeFilterNameZtoAList = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductName = new ArrayList<>();
        for (WebElement e : beforeFilterNameZtoAList){
            originalProductName.add(e.getText());
        }
        System.out.println(originalProductName);
        Collections.reverse(originalProductName);
        System.out.println(originalProductName);
        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.clickOnSortBy();
        // After filter Z -A Get all the products name and stored into array list
        List<WebElement> afterfilterNameZtoAList = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductName1 = new ArrayList<>();
        for (WebElement a : afterfilterNameZtoAList){
            originalProductName1.add(a.getText());
        }
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(originalProductName, originalProductName1);
    }

      @Test(groups = {"smoke","regrassion"})
      public void verifyProductAddedToShoppingCartSuccessFully(String product, String qty, String successMessage, String productName, String model, String total){
       //2.1 Mouse hover on Currency Dropdown and click
        desktopsPage.mouseHoverOnCurrency();
        // 2.2 Mouse hover on £Pound Sterling and click
        desktopsPage.clickOnCurrency();
        //2.3 Mouse hover on Desktops Tab.
        homePage.mouseHoverOnDesktopsLink();
        //2.4 Click on “Show All Desktops”
        homePage.clickOnShoeAllOptions();
        //2.5 Select Sort By position "Name: A to Z"
        desktopsPage.clickOnAtoZ();
          //2.6 Select product <product>
          desktopsPage.clickOnShowAllDesktops();
          //2.7 Enter Qty <qty> using Select class.
          desktopsPage.enterQuantity();
          //2.8 Click on “Add to Cart” button
          desktopsPage.clickOnAddToCart();
          //2.9 Verify the Message <successMessage>
          String expectedErrorMessage1 = "successMessage";
          String actualErrorMessage1 = desktopsPage.getSuccessText();
          Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, " successMessage");

          //2.10 Click on link “shopping cart” display into success message
          desktopsPage.clickOnShoppingCart1();
          //2.11 Verify the text "Shopping Cart"
          String expectedErrorMessage2 = "Shopping Cart";
          String actualErrorMessage2 = desktopsPage.clickOnShoppingCart();
          Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2, " Shopping Cart");

          //2.12 Verify the Product name <productName>
          String expectedErrorMessage3 = "Product name";
          String actualErrorMessage3 = desktopsPage.verifyProductName();
          Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3, " Product name");


          //2.13 Verify the Model <model>
          String expectedErrorMessage4 = "model";
          String actualErrorMessage4 = desktopsPage.verifyModel();
          Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4, " Model");


          //2.14 Verify the Total <total>
          String expectedErrorMessage5 = "total";
          String actualErrorMessage5 = desktopsPage.verifyTotal();
          Assert.assertEquals(expectedErrorMessage5, actualErrorMessage5, " Total");


      }

    }

