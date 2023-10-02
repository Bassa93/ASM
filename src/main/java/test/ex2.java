package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
				driver.get("https://demoqa.com/alerts");
				driver.manage().window().maximize();
	
				Thread.sleep(1000);
				
//etape1:
 //driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
 //Thread.sleep(3000);
 //driver.switchTo().alert().accept();	
 
 
 //etape2
 //driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
 //Thread.sleep(3000);
 //driver.switchTo().alert().accept();	
 
 //Thread.sleep(1000);
 
 //etape3
 
// driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
 //Thread.sleep(3000);
 //driver.switchTo().alert().accept();	
    //etape4
 
 //Thread.sleep(3000);
				
driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();

Thread.sleep(3000);
 Alert alert4 = driver.switchTo().alert();
 String alert4t = alert4.getText();
 System.out.println(alert4t);
 String txt = "basma";
 alert4.sendKeys(txt);
 
				   
	}
				   

}
