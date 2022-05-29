import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homepage;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {

    private WebDriver driver;
    protected Homepage homepage;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/");

        driver.manage().window().maximize();

        homepage = new Homepage(driver);
    }

    public void ex(){
        driver.navigate().refresh();
    }
    @AfterAll
    public void closeSite(){
        driver.quit();
    }
}
