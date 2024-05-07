package pom_test;


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
        
        driver.get("file:///C:/Users/Mithra%20Y/eclipse-workspace/pom_test/src/pom_test/dashboard.html");
    }

    @Test
    public void testLogin() {
        // Create DashboardPage object
        
    	dashboard dashboardPage = new dashboard(driver);

        // Get the welcome message from the dashboard page
        String welcomeMessage = dashboardPage.getWelcomeMessage();
        System.out.println("Welcome Message: " + welcomeMessage);

        dashboardPage.clickLogin();

        // Create LoginPage object
        login loginPage = new login(driver);

        // Enter username and password
        loginPage.enterUsername("abc_xyz");
        loginPage.enterPassword("12345678");

        // Click on login button
        loginPage.clickLoginButton();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
