package cucumber;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class) // anotação padrão para executar o Cucumber
@SpringBootConfiguration
@WebAppConfiguration  // anotação padrão para spring
@CucumberOptions (features = "classpath:consulta.feature") // a classpath indica o [nome_do_arquivo].feature
public class CucumberExecute {
// deve permanecer vazia
}
