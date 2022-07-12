package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By campoPesquisar = By.xpath("//*[@class='android.widget.EditText']");

	private By botaoEnviar = By.xpath("//*[@text='Fazer a procura pelo termo digitado na busca']");

	private By cookie = By.xpath("//android.widget.Button[@bounds='[656,788][680,826]']");

	private By validarPesquisa1 = By.xpath("//android.widget.TextView[@bounds='[30,420][690,470]']");

	private By validarPesquisa2 = By.xpath("//android.widget.TextView[@bounds='[30,420][690,520]']");

	public By getCampoPesquisar() {
		return campoPesquisar;
	}

	public By getBotaoEnviar() {
		return botaoEnviar;
	}

	public By getCookie() {
		return cookie;
	}

	public By getValidarPesquisa1() {
		return validarPesquisa1;
	}

	public By getValidarPesquisa2() {
		return validarPesquisa2;
	}

}
