package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisterners.CustomListeners;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MyAccountTest extends BaseTest {
    HomePage homePage;
    MyAccountPage myAccountPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
    }

    @Test(groups = {"sanity","smoke","regrassion"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //1.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        myAccountPage.selectMyOptions("Login");
        //1.3 Verify the text “Register Account”.
        String expectedText = "Returning Customer";
        String actualText = myAccountPage.verifyTextReturningCustomer();
        Assert.assertEquals(actualText, expectedText, "Error found");
    }

    @Test(groups = {"smoke", "regrassion"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //2.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        myAccountPage.selectMyOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        String expectedText = "Returning Customer";
        String actualText = myAccountPage.verifyTextReturningCustomer();
        Assert.assertEquals(actualText, expectedText, "Error found");
    }

    @Test(groups = "regrassion")
    public void verifyThatUserRegisterAccountSuccessfully(){
        //3.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        myAccountPage.selectMyOptions("Register");
        //3.3 Enter First Name
        myAccountPage.enterFirstName("Jeet");
        //3.4 Enter Last Name
        myAccountPage.enterLastName("Patel");
        //3.5 Enter Email
        myAccountPage.enterEmailId();
        //3.6 Enter Telephone
        myAccountPage.enterTelephone("07429020202");
        //3.7 Enter Password
        myAccountPage.enterPassword("jeet123456");
        //3.8 Enter Password Confirm
        myAccountPage.enterConfirmPassword("jeet123456");
        //3.9 Select Subscribe Yes radio button
        myAccountPage.clickOnYesRadioButton();
        //3.10 Click on Privacy Policy check box
        myAccountPage.clickOnPrivacyPolicyCheckBox();
        //3.11 Click on Continue button
        myAccountPage.clickOnContinueButton();
        // 3.12 Verify the message “Your Account Has Been Created!”
        String expectedText = "Your Account Has Been Created!";
        String actualText = myAccountPage.verifyMessageAccountCreated();
        Assert.assertEquals(actualText, expectedText, "Error message");

        // 3.13 Click on Continue button
        myAccountPage.clickOnContinueTab();
        // 3.14 Click on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        myAccountPage.selectMyOptions("Logout");
        //3.16 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = myAccountPage.verifyTextAccountLogout();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message");
        //3.17 Click on Continue button
        myAccountPage.clickOnContinue();
    }

    @Test(groups = {"regrassion"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        myAccountPage.selectMyOptions("Login");
        //4.3 Enter Email address
        myAccountPage.enterEmail("jeet123@gmail.com");
        //4.4 Enter Last Name
        myAccountPage.enterLastName("Patel");
        //4.5 Enter Password
        myAccountPage.enterPassword("jeet123456");
        //4.6 Click on Login button
        myAccountPage.clickOnLoginButton();
        //4.7 Verify text “My Account”
        String expectedText = "My Account";
        String actualText = myAccountPage.verifyTextMyAccount();
        Assert.assertEquals(actualText, expectedText, "Error message");
        //4.8 Click on My Account Link.
        myAccountPage.clickOnMyAccount();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        myAccountPage.selectMyOptions("Logout");
        //4.10 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = myAccountPage.getTextAccountLogout();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message");
        //4.11 Click on Continue button
        myAccountPage.clickOnContinueLink();
    }
    }

