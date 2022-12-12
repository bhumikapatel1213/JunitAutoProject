package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.HomePage;
import util.BrowserFactory;

public class ValidateToggleCheckbox {
	WebDriver driver;

    @Test
    public void ClickAllCheckBoxes() {
        driver = BrowserFactory.init();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickToggleAllElement();
        BrowserFactory.tearDown();
    }
    
    @Test
    public void clickRemoveSingleCheckBox() {
         driver= BrowserFactory.init();
         HomePage homePage = PageFactory.initElements(driver, HomePage.class);
         homePage.clickRemoveButton();
         BrowserFactory.tearDown();
         
    }
    @Test
    public void removeAllButton() {
        driver = BrowserFactory.init();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.removeAll();
        BrowserFactory.tearDown();
        
    }
    
}
