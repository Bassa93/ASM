package lidel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy;

import cucumber.api.java.lu.a;

public class deconnexion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lidl.fr/?gclid=EAIaIQobChMIir6Im4CngAMVvItoCR06IQW-EAAYASAAEgIICPD_BwE");
		driver.manage().window().maximize();
	
		   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();  // accepter les cookies
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[1]/div[1]/div/div[1]/nav/ol/li[4]/ol/li[1]/a/span/span")).click();  // cliquer sur connexion
		   Thread.sleep(1000);
		   driver.findElement(By.name("EmailOrPhone")).sendKeys("hannachi.basmas93@gmail.com");    // entrer email
			driver.findElement(By.xpath("//*[@id=\"button_btn_submit_email\"]")).click();  // cliquer sur suivant
			  Thread.sleep(1000);
			driver.findElement(By.name("Password")).sendKeys("AZer12345:");    // mot de passe
			  Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"button_submit\"]")).click();  // cliquer sur suivant
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"button_logout_button\"]")).click();  // cliquer sur deconnexion
			System.out.println("vous pouvez aceder a votre compte");
			
			
			
	
	

}
}
