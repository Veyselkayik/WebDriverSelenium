import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {

    protected WebDriver driver;
    static String browser = System.getProperty("browser");
    @BeforeEach
    public void beforeMethod(){
        driver = getDriver(browser);
    }
    @AfterEach
    public void afterMethod(){
        driver.quit();
    }
    @BeforeAll
    public static void setUp(){
        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        }
        System.out.println("Test initiated");
    }
    @AfterAll
    public static void tearDown(){
        //driver.quit();
        System.out.println("Kapatıldı");
    }

    private WebDriver getDriver(String browser){
        WebDriver driver = null;
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
