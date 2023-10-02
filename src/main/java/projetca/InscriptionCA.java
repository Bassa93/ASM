package projetca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InscriptionCA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.c-and-a.com/fr/fr/shop");
		driver.manage().window().maximize();
	
		   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();  // accepter les cookies
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/nav/div[4]/button[1]")).click();  // cliquer sur mon espace
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[1]/a/span")).click();  // cliquer s'inscrire
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("basmaa933@gmail.com");    // entrer email
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/form/button")).click();  // cliquer sur suivant
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/form/div[1]/div/label[1]/button")).click();  // choisir le genre
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Basma");    // entrer prenom
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Hannachi");    // entrer nom
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("AZer12345:");    // entrer mot de passe
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/form/label/div")).click();  // cocher la case
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/form/button")).click();  // cliquer sur ddevenir membre


}
}
