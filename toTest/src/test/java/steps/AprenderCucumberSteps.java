package steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberSteps {
	private int contador = 0;
	Date entrega = new Date();

	/**
	 * Cenario 1
	 */
	@Dado("que criei o arquivo corretamente")
	public void queCrieiOArquivoCorretamente() {
	}

	@Quando("executa-lo")
	public void executaLo() {
	}

	@Então("a especificação deve finalizar com sucesso")
	public void aEspecificaçãoDeveFinalizarComSucesso() {
	}

	/**
	 * Cenario 2
	 */
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(int int1) {
		contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(int int1) {
		contador = contador + int1;
	}

	@Então("o valor do contador será {int}")
	public void oValorDoContadorSerá(int int1) {
		Assert.assertEquals(int1, contador);
	}

	/**
	 * Cenario 3
	 */
	@Dado("que o prazo é dia {int}\\/{int}\\/{int}")
	public void queOPrazoÉDia(int dia, int mes, int ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int int1, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if(tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, int1);
		}
		if(tempo.equals("meses")) {
			cal.add(Calendar.MONTH, int1);
		}
		entrega = cal.getTime();
	}

	@Então("a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) {
	/*	Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		
		SimpleDateFormat sm1 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sm2 = new SimpleDateFormat("dd-MM-yyyy");

		Date tempo1 = cal.getTime();
		
		String strDate1 = sm1.format(tempo1);
		String strDate2 = sm2.format(entrega);
		
		System.out.println(strDate1+"\n" + strDate2);
		 Assert.assertEquals(strDate1, strDate2);
	 */
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data , dataFormatada);
		}

}
