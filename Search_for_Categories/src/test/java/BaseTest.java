import com.opencart.driver.DriverRepository;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite()
    public void setup() {
        DriverRepository.downloadWebDriver();
    }

    @BeforeClass
    public void createDriver() {
        DriverRepository.instansWebBrowser();
    }

    @AfterSuite
    public void closeBrowser() {
        DriverRepository.closeBrowser();
    }
}
