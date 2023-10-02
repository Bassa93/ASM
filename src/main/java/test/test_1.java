package test;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_1 {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			   Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
	        Thread.sleep(3000);
			driver.findElement( By.name("search_query")).sendKeys("voiture");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/yt-icon-shape/icon-shape/div")).click();
			WebElement button = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
button.click();
}
}