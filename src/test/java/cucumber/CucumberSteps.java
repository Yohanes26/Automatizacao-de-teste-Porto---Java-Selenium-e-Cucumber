package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class cucumberSteps {

	private WebDriver driver;

	@Before("@start")
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/yohan/Desktop/WorkSpace/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^que eu estou na pagina inicial da porto seguros$")
	public void abrirPaginaInicial() throws Throwable {
		driver.navigate().to("https://www.portoseguro.com.br");
	}

	@When("^eu clicar no link faca uma cotacao$")
	public void clicarLinkSeguros() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav/div[3]/a")).click();
	}

	@Then("^deverei ser redirecionado para a pagina de cotacao$")
	public void validarSeEstouNaPaginaSeguros() throws Throwable {
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.portoseguro.com.br/calcule-e-contrate");
	}

	@When("^informar um nome \"(.*?)\" Válido$")
	public void clicarLinkSeguroImoveis(String nome) throws Throwable {
		driver.findElement(By.name("proponente.nomeProponente")).sendKeys(nome);
	}

	@And("^informar um cpf \"(.*?)\" Válido$")
	public void clicarLinkSeguroImoveisResidencias(String cpf) throws Throwable {
		driver.findElement(By.name("numeroCpf")).sendKeys(cpf);
	}

	@And("^informar um email \"(.*?)\" Válido$")
	public void informarEmail(String email) {
		driver.findElement(By.name("proponente.descricaoEmailProponente")).sendKeys(email);

	}

}