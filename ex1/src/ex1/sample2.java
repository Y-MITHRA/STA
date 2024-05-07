package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {
	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.className("vl-popular-destinations-evo__name")).click();
        driver.findElement(By.className("b-event__footer-title")).click();


	}


}
