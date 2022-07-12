package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By campoPesquisar = By.xpath("//input[@placeholder='O que você está buscando?']");

	private By botaoEnviar = By.xpath("//*[@id='root-search-bar-component']/div/div/form/fieldset/button");

	private By validarTexto = By.xpath("//*[@id='inicio-conteudo']/div[1]/div/div[4]/div/h1");

	public By getCampoPesquisar() {
		return campoPesquisar;
	}

	public By getBotaoEnviar() {
		return botaoEnviar;
	}

	public By getValidarTexto() {
		return validarTexto;
	}

}
