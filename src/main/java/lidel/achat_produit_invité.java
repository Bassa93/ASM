package lidel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class achat_produit_invité {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lidl.fr/?gclid=EAIaIQobChMIir6Im4CngAMVvItoCR06IQW-EAAYASAAEgIICPD_BwE");
		driver.manage().window().maximize();
	
		   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();  // accepter les cookies
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"10083588\"]/section/div/ul/li[4]/div")).click();  // choisir mode
		   driver.findElement(By.xpath("//*[@id=\"product_1\"]/div/a")).click();  // choisir article
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/section/article/div[5]/div/div[2]/div/div[1]/div/fieldset/div/label[2]")).click();  // choisir coleur
		   driver.findElement(By.xpath("//*[@id=\"product-P_GROESSE\"]/option[3]")).click();  // choisir taille
		   driver.findElement(By.xpath("//*[@id=\"addToCart\"]")).click();  // valider le produit
		   
		   
		   
	}

}
