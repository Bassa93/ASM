package projetca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deconnexion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.c-and-a.com/fr/fr/shop");
		driver.manage().window().maximize();
	
		   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();  // accepter les cookies
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/nav/div[4]/button[1]")).click();  // cliquer sur mon espace
		   Thread.sleep(1000);
		   driver.findElement(By.id("myaccount_login_email")).sendKeys("hannachi.basmas93@gmail.com");    // entrer email
			  Thread.sleep(1000);
			driver.findElement(By.id("myaccount_login_password")).sendKeys("AZerty123/");    // entrer mot de passe
			  Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/form/div[4]/button")).click();  // cliquer sur connexion
			 Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/nav/div[4]/button[1]")).click();  // cliquer sur mon espace
			 Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div/button")).click();  // cliquer deconnexion
}
}
