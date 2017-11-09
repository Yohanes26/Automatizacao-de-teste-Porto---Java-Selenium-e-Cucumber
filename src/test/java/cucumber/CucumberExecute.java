package cucumber;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class) // anota��o padr�o para executar o Cucumber
@SpringBootConfiguration
@WebAppConfiguration  // anota��o padr�o para spring
@CucumberOptions (features = "classpath:consulta.feature") // a classpath indica o [nome_do_arquivo].feature
public class CucumberExecute {
// deve permanecer vazia
}
