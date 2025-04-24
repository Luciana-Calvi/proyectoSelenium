package Base;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

    public static WebDriver driver = null;

    @BeforeEach
    public void initialize() throws IOException {

        String urlWeb = "https://petstore.octoperf.com/actions/Catalog.action";
        String driverPath = "C:\\SeleniumDrivers\\chromedriver.exe";

        System.out.println("Abriendo URL: " + urlWeb); 
        System.out.println("Driver path: " + driverPath);

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(urlWeb);
    }

    @AfterEach
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}