//Test the performance of e-commerce application using Selenium, TestNG
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Set up any other configurations (e.g., implicit waits)
    }

    @Test
    public void testSearchPerformance() {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.className("vl-popular-destinations-evo__name")).click();
        driver.findElement(By.className("b-event__footer-title")).click();
    }
    
    @AfterClass
    public void tearDown() {
        // Clean up resources
       
            driver.quit();
    }
}
