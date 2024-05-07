package pom_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class dashboard 
{
    private WebDriver driver;
    private By welcomeMessage = By.className("welcome-message");
    private By login = By.className("login-btn");
    public dashboard(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessage).getText();
    }
    
    public void clickLogin(){
        driver.findElement(login).click();
    }
}
