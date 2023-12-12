package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisterners.CustomListeners;
import com.tutorialsninja.demo.pages.ComponentPage;
import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopAndNotebooksPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
      HomePage homePage;
      DesktopsPage desktopsPage;
      LaptopAndNotebooksPage laptopAndNotebooksPage;
      ComponentPage componentPage;
      @BeforeMethod
      public void inIt(){
        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
        laptopAndNotebooksPage = new LaptopAndNotebooksPage();
        componentPage = new ComponentPage();

      }
    @Test(groups = {"sanity","smoke","regrassion"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverOnDesktopsLink();
        // 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.clickOnShoeAllOptions();
        //1.3 Verify the text ‘Desktops’
        String actualText = desktopsPage.verifyDesktopsText();
        Assert.assertEquals(actualText, "Desktops");
    }

    @Test(groups = {"smoke","regrassion"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
          //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
           homePage.mouseHoverOnLaptopAndNotebooksLink();
          // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
           homePage.clickOnShowAllLaptopAndNotebooksLink();
          //2.3 Verify the text ‘Laptops & Notebooks’
           String actualText = laptopAndNotebooksPage.getLaptopAndNotebooksLinkText();
           Assert.assertEquals(actualText, "Laptops & Notebooks");
    }

    @Test(groups = {"regrassion"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
          //3.1 Mouse hover on “Components” Tab and click
           homePage.mouseHoverOnComponentLink();
          // 3.2 call selectMenu method and pass the menu = “Show All Components”
           homePage.clickOnShowAllComponentLink();
          //3.3 Verify the text ‘Components’
           String actualText = componentPage.getComponentText();
           Assert.assertEquals(actualText, "Components");
    }

}
