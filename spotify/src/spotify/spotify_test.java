package spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class spotify_test {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("MGR CHENNAI CTL - MAS (CHENNAI)");
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("METUPALAIYAM - MTP");
		driver.findElement(By.cssSelector("#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > app-jp-input > div > form > div:nth-child(5) > div.col-md-3.col-sm-12.col-xs-12.remove-pad > button")).click();
		
		}

}
