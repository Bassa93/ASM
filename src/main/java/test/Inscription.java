package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inscription {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carrefour.fr/");
		driver.manage().window().maximize();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click(); // clique sur accepter tout
		   driver.findElement(By.xpath("//*[@id=\"data-account\"]/button")).click();   // 
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"headerAccountPanel\"]/div/div/ul/li[2]/a")).click(); // choisir creer mon compte
		   Thread.sleep(2000);

		   driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div[3]/form/div[1]/div[3]/div/div[2]/div[1]/label/span")).click(); // choisir le champ Madame
		   Thread.sleep(1000);
		   driver.findElement(By.name("firstName")).sendKeys("Basma"); // saisir prenom
		   Thread.sleep(1000);
		   driver.findElement(By.name("lastName")).sendKeys("Elkadri"); // saisir nom
		   Thread.sleep(1000);
		   driver.findElement(By.name("email")).sendKeys("hannachi.basma@gmail.com"); // saisir adresse mail
		   driver.findElement(By.name("password")).sendKeys("AZer1234:");  // saisir mot de passe
		   driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();   // cocher "je ne suis un robot"
		   driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div[3]/form/div[6]/div[2]/button")).click();  // cliquer sur "cree compte"
}
}
