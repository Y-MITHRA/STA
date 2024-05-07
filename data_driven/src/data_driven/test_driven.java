package data_driven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_driven {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        // Navigate to login page
        driver.get("file:///C:/Users/Mithra%20Y/Desktop/STA_Model/pom_test/src/pom_test/login.html");

        // Find username and password fields
        driver.findElement(By.id("username")).sendKeys("hnhcf");
        driver.findElement(By.id("password")).sendKeys("ubsdfme");
        driver.findElement(By.id("login-button")).click();
        
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Login failed!");
    }


	@AfterClass
    public void tearDown() {
        
            driver.quit();
        
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"user1", "password1"},
            {"user2", "password2"},
            // Add more test data as needed
        };
    }
}
