package ex1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample { 
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();       

        // Navigate to eBay
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        
        // Click on the "Sign In" link
        driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
        
        // Click on "Create a personal account"
        driver.findElement(By.cssSelector("#mainContent > div.buyerRegMain > div:nth-child(2) > div:nth-child(5) > div > div > div > label.segmentInactive")).click();
        
        // Enter user details
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("Email")).sendKeys("abc123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("passwd123");
        
        // Click on "Create Account" button
        driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
        
        // Close browser page
        driver.close();
        
    }
}
