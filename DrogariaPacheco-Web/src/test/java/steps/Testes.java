package steps;

import java.io.IOException;
import java.net.MalformedURLException;

import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.Metodos;

public class Testes extends Metodos{
	
	@Dado("que eu acesso o site {string}")
	public void que_eu_acesso_o_site(String site) {
		
		abrirNavegador("Iniciando teste", site, "chrome");
	    
	}

	@E("que eu clique no campo de busca")
	public void que_eu_clique_no_campo_de_busca() {
		
		clicar(getCampoPesquisar());
	    
	}

	@E("digite {string}")
	public void digite(String pesquisa) {
		
		escrever(pesquisa, getCampoPesquisar());
	    
	}

	@Quando("clicar em pesquisar")
	public void clicar_em_pesquisar() throws InterruptedException {
		
		clicar(getBotaoEnviar());
	    
	}

	@Entao("valido a url {string}")
	public void valido_a_url(String site) throws InterruptedException, MalformedURLException {
		
		estabilizarPagina(2000);
		validarUrl(site);
	    
	}

	@E("valido texto {string}")
	public void valido_texto(String textoEsperado) throws InterruptedException {
		
		estabilizarPagina(1000);
		validarTexto(textoEsperado, getValidarTexto());
	    
	}

	@E("tiro print {string}")
	public void tiro_print(String foto) throws IOException, InterruptedException {
		
		estabilizarPagina(500);
		tirarPrint(foto);
	    
	}

	@Entao("fecho navegador")
	public void fecho_navegador() {
	    
		fecharNavegador("Finalizando teste");
		
	}
	
}
