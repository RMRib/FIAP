package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", // Caminho para seus arquivos .feature
		glue = "automation.stepdefinitions", // Pacote onde estão suas classes de passos
		tags = "@testesWeb", // Tags para os cenários que você deseja executar
		plugin = {"pretty", "html:target/cucumber-reports"} // Relatórios de saída (opcional)
		)
public class TestRunner {

}
