package Caixa_preta_teste;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caixa_preta {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void teste() {
		driver.get("https://www.terabyteshop.com.br/?gclid=Cj0KCQjw2cWgBhDYARIsALggUho_x07m49qIOzoOHIGooIadIUU-Z2OlFTFV1_mdXGbHwfml7VU0FxgaAsH4EALw_wcB");
		driver.findElement(By.id("isearch")).sendKeys("3060");
		driver.findElement(By.id("isearch")).sendKeys(Keys.RETURN);
	}
	
}
