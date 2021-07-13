package steps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class DesafioRegexSteps {
	@Dado("que o ticket é AF345")
	public void queOTicketÉAF345() {
	}

	@Dado("que o valor da passagem é R$ {double}")
	public void queOValorDaPassagemÉR$(Double double1) {
	}

	@Dado("que o nome do passageiro é {string}")
	public void queONomeDoPassageiroÉ(String string) {
	}

	@Dado("que o telefone do passageiro é {int}-{int}")
	public void queOTelefoneDoPassageiroÉ(Integer int1, Integer int2) {
	}

	@Quando("criar os steps")
	public void criarOsSteps() {
	}

	@Então("o teste vai funcionar")
	public void oTesteVaiFuncionar() {
	}

}
