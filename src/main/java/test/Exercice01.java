package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercice01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://iys-france.fr/");
		driver.manage().window().maximize();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id=\"menu-item-919\"]/a")).click();
		   driver.findElement(By.xpath("//*[@id=\"wt-cli-accept-all-btn\"]")).click();
		   driver.findElement(By.xpath("//*[@id=\"ff_1_names_first_name_\"]")).sendKeys("Elkadri");
		   driver.findElement(By.xpath("//*[@id=\"ff_1_names_last_name_\"]")).sendKeys("Basma");
		   driver.findElement(By.xpath("//*[@id=\"ff_1_email\"]")).sendKeys("hannachi.basmas93@gmail.com");
		   driver.findElement(By.xpath("//*[@id=\"ff_1_subject\"]")).sendKeys("Formation");
		   driver.findElement(By.xpath("//*[@id=\"ff_1_message\"]")).sendKeys("Bonjour à tous");
		   driver.findElement(By.xpath("//*[@id=\"terms-n-condition_79345891eeb6ca632624e4f353cca81d\"]")).click();
		   Thread.sleep(1000);
		   WebElement button = driver.findElement(By.xpath("//*[@id=\"fluentform_1\"]/div[6]/button"));
		   button.click();
		   
		
	}

}
