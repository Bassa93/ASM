package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class recherche_produit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.carrefour.fr/");
				driver.manage().window().maximize();
				   Thread.sleep(1000);
				   driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
				driver.findElement( By.xpath("//*[@id=\"search-bar\"]/form/div/div[1]/div/input")).sendKeys("lait");
				Thread.sleep(1000);
				
				WebElement button = driver.findElement(By.xpath("//*[@id=\"search-bar\"]/form/div/div[2]/button"));
	button.click();  // recherche article
	driver.findElement(By.xpath("//*[@id=\"3560070437405\"]/div[1]")).click(); //choisir article
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"data-produit-acheter\"]/button")).click();   //ajout d'article au panier
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"sub-header\"]/div/div/div[2]/div/div/ul/li[2]/div/label")).click();  // choisir mode de livraison
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"sub-header\"]/div/div/div[2]/div/div/div[1]/div/section/div/section/div/section/div/div/div[2]/div/input")).sendKeys(" 13 place des cerclades 95000 Cergy");// choisir la zone
	driver.findElement(By.xpath("//*[@id=\"sub-header\"]/div/div/div[2]/div/div/div[1]/div/section/div/section/div/section/div/div/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"sub-header\"]/div/div/div[2]/div/div/div[1]/div/section/div/section/div/section/div/div/div[1]/button/span/span/svg")).click();  // choisir l'option autour de moi
	
	}
}
