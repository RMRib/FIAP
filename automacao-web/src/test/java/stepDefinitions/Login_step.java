package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.WebDriverManager;
import pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class Login_step {

	private WebDriver driver;
	private LoginPage loginPage;
	
	public Login_step() {
		loginPage = new LoginPage();
	}
	
	@Given("que estou na pagina de login")
	public void que_estou_na_pagina_de_login() {
		driver = WebDriverManager.getWebDriver();
		driver.get("http://saucedemo.com");
		
	}

	@When("preencher usuario e senha validos")
	public void preencher_usuario_e_senha_validos() {
	    WebElement campoUsuario = driver.findElement(By.id("user-name"));
	    WebElement campoSenha = driver.findElement(By.name("password"));
	    
	    campoUsuario.sendKeys("standard_user");
	    campoSenha.sendKeys("secret_sauce");
	}

	@When("clicar no botao login")
	public void clicar_no_botao_login() {
		WebElement botaoLogin = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		botaoLogin.click();
	}

	@Then("a pagina inicial sera exibida")
	public void a_pagina_inicial_sera_exibida() {
		WebElement tituloPagina = driver.findElement(By.cssSelector(".title"));
		String titulo = tituloPagina.getText();
		Assert.assertEquals("titulo",titulo);
	}
	
	@When("preencher usuario {string} e senha {string}")
	public void preencher_usuario_e_senha(String usuario, String senha) {
	    /*
	    WebElement campoUsuario = driver.findElement(By.id("user-name"));
	    WebElement campoSenha = driver.findElement(By.name("password"));
		campoUsuario.sendKeys(usuario);
		campoSenha.sendKeys(senha);
	     */
		
	    loginPage.campoUsuario.sendKeys(usuario);
	    loginPage.campoSenha.sendKeys(senha);
	}

	@Then("sera exibida a mensagem {string}")
	public void sera_exibida_a_mensagem(String mensagem) {
	    String mensagemErro = driver.findElement(By.cssSelector(".error-message-container > h3:nth-child(1)")).getText();
	    Assert.assertEquals(mensagem, mensagemErro);
	}

	@After
    public void tearDown() {
        // Encerrar o WebDriver quando não for mais necessário
        WebDriverManager.quitWebDriver();
    }
}
