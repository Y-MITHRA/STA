package ebay_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ebayProduct {
	private WebDriver driver;
	private By rolexname =By.className("b-visualnav__title");
	public ebayProduct(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickpage() {
		driver.findElement(rolexname).click();
	}

}
