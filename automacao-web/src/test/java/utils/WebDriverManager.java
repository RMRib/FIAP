package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

	public static WebDriver driver;

	public static WebDriver getWebDriver() {
		if (driver == null) {
			// Especifique o caminho para o executável do ChromeDriver
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

			// Configurações adicionais, como headless (opcional)
			ChromeOptions chromeOptions = new ChromeOptions();
			// chromeOptions.setHeadless(true); // Descomente esta linha se desejar executar
			// em modo headless

			// Inicialize o ChromeDriver
			driver = new ChromeDriver(chromeOptions);
		}
		return driver;
	}

	public static void quitWebDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}