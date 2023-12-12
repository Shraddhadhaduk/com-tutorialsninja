package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisterners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Components']")
    WebElement componentText;

    public String getComponentText(){
        String message = getTextFromElement(componentText);
        CustomListeners.test.log(Status.PASS, "verify component text");
        return message;
    }

}
