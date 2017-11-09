package cucumber;

public class CucumberSteps {

	@Dado("^$") // anota��o para o passo Dado - com a defini��o escrita entre ^ e $
	public void [nome]() throws Throwable { // nome deve fazer sentido com a defini��o de Dado
        // teste para passar
	}

	@Quando("^$") // anota��o para o passo Quando - com a defini��o escrita entre ^ e $
	public void [nome]()throws Throwable{ // nome deve fazer sentido com a defini��o de Quando
        // teste para passar
	}

        @E("^$") // anota��o para o passo Quando - com a defini��o escrita entre ^ e $
	public void [nome]()throws Throwable{ // nome deve fazer sentido com a defini��o de E
        // teste para passar
	}
	
	@Entao("^$") // anota��o para o passo Entao - com a defini��o escrita entre ^ e $
	public void [nome]() throws Throwable{ // nome deve fazer sentido com a defini��o de Entao
        // teste para passar		
	}
	
}