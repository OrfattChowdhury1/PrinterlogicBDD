package stepDefinition;

import base.CommonAPI;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hook extends CommonAPI {
    @Before
    public  void initializeTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\orfat\\IdeaProjects\\PrinterlogicBDD\\src\\driver\\chromedriver.exe");

        driver = new ChromeDriver();

        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS); // 20
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS); //35
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.get("https://http.printercloud.com/admin/index.php");
        driver.manage().window().fullscreen();
    }
    @After
    public void tearDownTest(Scenario scenario) {

        driver.quit();
    }
}
