package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class DesafioWebSteps {
	
	private WebDriver driver;
	
	@Dado("que estou acessando a aplicação")
	public void queEstouAcessandoAAplicação() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alan\\webdrivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.get("http://seubarriga.wcaquino.me/");
	}

	@Quando("informo o usuário {string}")
	public void informoOUsuário(String string) {
		WebElement element = this.driver.findElement(By.id("email"));
		element.sendKeys(string);
	}

	@Quando("a senha {string}")
	public void aSenha(String string) {
		WebElement element = this.driver.findElement(By.id("senha"));
		element.sendKeys(string);
	}

	@Quando("seleciono entrar")
	public void selecionoEntrar() {
		WebElement element = this.driver.findElement(By.tagName("button"));
		element.click();
	}

	@Então("visualizo a página inicial")
	public void visualizoAPáginaInicial() {
	}

	@Quando("seleciono Contas")
	public void selecionoContas() {
	}

	@Quando("seleciono Adicionar")
	public void selecionoAdicionar() {
	}

	@Quando("informo a conta {string}")
	public void informoAConta(String string) {
	}

	@Quando("seleciono Salvar")
	public void selecionoSalvar() {
	}

	@Então("a conta é inserida com sucesso")
	public void aContaÉInseridaComSucesso() {
	}}
