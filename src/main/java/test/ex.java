package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
				driver.get("https://the-internet.herokuapp.com/dropdown");
				driver.manage().window().maximize();
				   Thread.sleep(1000);
				   Select option = new Select(driver.findElement(By.id("dropdown")));
				   option.selectByValue("1");
	}
}
