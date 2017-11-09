package cucumber;

public class CucumberSteps {

	@Dado("^$") // anotação para o passo Dado - com a definição escrita entre ^ e $
	public void [nome]() throws Throwable { // nome deve fazer sentido com a definição de Dado
        // teste para passar
	}

	@Quando("^$") // anotação para o passo Quando - com a definição escrita entre ^ e $
	public void [nome]()throws Throwable{ // nome deve fazer sentido com a definição de Quando
        // teste para passar
	}

        @E("^$") // anotação para o passo Quando - com a definição escrita entre ^ e $
	public void [nome]()throws Throwable{ // nome deve fazer sentido com a definição de E
        // teste para passar
	}
	
	@Entao("^$") // anotação para o passo Entao - com a definição escrita entre ^ e $
	public void [nome]() throws Throwable{ // nome deve fazer sentido com a definição de Entao
        // teste para passar		
	}
	
}