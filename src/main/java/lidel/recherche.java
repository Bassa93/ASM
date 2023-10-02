package lidel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class recherche {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lidl.fr/?gclid=EAIaIQobChMIir6Im4CngAMVvItoCR06IQW-EAAYASAAEgIICPD_BwE");
		driver.manage().window().maximize();
	
		   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();  // accepter les cookies
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"s-search-input-field\"]")).sendKeys("robe"); // recherche d'un article
		   driver.findElement(By.xpath("//*[@id=\"search-input-hook\"]/div/form/button")).click(); //lancer la recherche
		
	}
	}

