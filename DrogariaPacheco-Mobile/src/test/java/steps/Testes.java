package steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pages.Metodos;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testes extends Metodos {

	@Before
	public void setUp() throws Exception {

		abrirApp();

	}

	@After
	public void tearDown() throws Exception {

		fecharApp();

	}

	@Test
	public void ct01_Validar_pesquisa_de_remédio_por_nome() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Benegrip");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Benegrip", getValidarPesquisa1());
		estabilizarApp(3000);
		tirarPrint("Pesquisa de remédio por nome");

	}

	@Test
	public void ct02_Validar_apenas_busca_de_genéricos() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Genéricos");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Genéricos", getValidarPesquisa1());
		estabilizarApp(3000);
		tirarPrint("Apenas busca de genéricos");

	}

	@Test
	public void ct03_Validar_busca_por_fabricante() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Colgate");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Colgate", getValidarPesquisa1());
		estabilizarApp(3000);
		tirarPrint("Busca por fabricante");

	}

	@Test
	public void ct04_Validar_pesquisa_de_fralda() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Fralda");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Fralda", getValidarPesquisa1());
		estabilizarApp(3000);
		tirarPrint("Pesquisa de fralda");

	}

	@Test
	public void ct05_Validar_pesquisa_de_Vitamina_C() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Vitamina C");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Vitamina C", getValidarPesquisa1());
		estabilizarApp(3000);
		tirarPrint("Pesquisa de Vitamina C");

	}

	@Test
	public void ct06_Validar_pesquisa_de_Soro_Fisiológico() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Soro Fisiológico");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Soro Fisiológico", getValidarPesquisa2());
		estabilizarApp(3000);
		tirarPrint("Pesquisa de Soro Fisiológico");

	}

	@Test
	public void ct07_Validar_pesquisa_de_Sabonete_Líquido() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Sabonete Líquido");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Sabonete Líquido", getValidarPesquisa2());
		estabilizarApp(3000);
		tirarPrint("Pesquisa de Sabonete Líquido");

	}

	@Test
	public void ct08_Validar_pesquisa_de_Sabonete() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(getCookie()).click();
		driver.findElement(getCampoPesquisar()).click();
		driver.findElement(getCampoPesquisar()).sendKeys("Sabonete");
		driver.findElement(getBotaoEnviar()).click();
		validarTexto("Resultado De Busca: Sabonete", getValidarPesquisa1());
		estabilizarApp(3000);
		tirarPrint("Pesquisa de Sabonete");

	}

}
