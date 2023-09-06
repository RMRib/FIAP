package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	public WebElement campoUsuario = driver.findElement(By.id("user-name"));
	public WebElement campoSenha = driver.findElement(By.name("password"));
	public WebElement botaoLogin = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
	public WebElement msgErro = driver.findElement(By.cssSelector(".error-message-container > h3:nth-child(1)"));
	public WebElement tituloPagina = driver.findElement(By.cssSelector(".title"));
	
}
