import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckOutJourney {
    public String url = "https://practicetestautomation.com/practice-test-login/";
    public String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
    public WebDriver driver;

    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void login(){
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.enterUsername("student");
        login.enterPassword("Password123");
        login.clickLogin();

        //asertions
        home.getTextProducts();
        Assertions.assertEquals(home.getActualUrl(), expectedUrl);
    }

//    @AfterAll
//    public void terminateBrowser(){
//        driver.quit();
//    }
}
