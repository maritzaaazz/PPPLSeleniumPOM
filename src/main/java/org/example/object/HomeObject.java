package org.example.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeObject {
    WebDriver driver;
    public HomeObject(WebDriver driver){
        this.driver = driver;
    }

    public By getTextCongrats(){
        return By.xpath("//*[contains(text(), 'Congratulations')]");
    }
}
