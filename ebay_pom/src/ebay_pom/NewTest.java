package ebay_pom;


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
     driver.get("https://www.ebay.com/");
    
 }

 @Test
 public void searchAndAddToCartTest() {
     ebayHomePage homePage = new ebayHomePage(driver);
     homePage.searchFor();
     ebayProduct product =new ebayProduct (driver);
     product.clickpage();

 }

 @AfterClass
 public void tearDown() {
    
         driver.quit();
     
 }
}
