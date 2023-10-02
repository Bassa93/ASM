package lidel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inscription {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lidl.fr/?gclid=EAIaIQobChMIir6Im4CngAMVvItoCR06IQW-EAAYASAAEgIICPD_BwE");
		driver.manage().window().maximize();
	
		   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();  // accepter les cookies
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[1]/div[1]/div/div[1]/nav/ol/li[4]/ol/li[1]/a/span/span")).click();  // cliquer sur connexion
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/section/div/div/div[2]/div/div[2]/p/a")).click();  // cliquer sur s'enregistrer

		   driver.findElement(By.name("Email")).sendKeys("hannachi.basmas93@gmail.com");    // entrer email
		   driver.findElement(By.name("ConfirmEmail")).sendKeys("hannachi.basmas93@gmail.com");    // confirmer email
		   driver.findElement(By.name("Password")).sendKeys("AZer12345:");   // entrer mot de passe 
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("/html/body/div[1]/form/div/section/div/div/div[1]/div/button")).click();  // cliquer sur  suivant
		   driver.findElement(By.xpath("/html/body/div[1]/form/div/section/div/div/div[2]/div/div/div[2]/div/button[2]")).click();  // cliquer sur recevoir mail
		   driver.findElement(By.name("EmailVerificationCode")).sendKeys("338113");
		   driver.findElement(By.xpath("//*[@id=\"button_email_verification_next\"]")).click();  // cliquer suivant
		  
		 

}
}