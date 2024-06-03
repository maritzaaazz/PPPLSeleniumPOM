package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By textCongrats = By.xpath("//*[contains(text(), 'Congratulations')]");

    public void getTextProducts(){
        driver.findElement(textCongrats).isDisplayed();
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }
}
