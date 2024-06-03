import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GoogleTest {
    @Test
    public void login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.enterUsername("student");
        login.enterPassword("Password123");
        login.clickLogin();

        home.getTextProducts();

        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        Assertions.assertEquals(home.getActualUrl(), expectedUrl);
//
//        driver.quit();
    }
}