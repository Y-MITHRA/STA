package ebay_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ebayHomePage {
 private WebDriver driver;
 private By searchBox = By.className("vl-popular-destinations-evo__name");
 private By searchButton =By.className("b-event__footer-title");

 public ebayHomePage(WebDriver driver) {
     this.driver = driver;
 }

 public void searchFor() {
     driver.findElement(searchBox).click();
     driver.findElement(searchButton).click();
 }
}
