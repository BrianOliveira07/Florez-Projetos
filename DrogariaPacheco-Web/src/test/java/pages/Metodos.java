package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import elementos.Elementos;

public class Metodos extends Elementos{

	WebDriver driver;

	public void abrirNavegador(String passo, String site, String navegador) {

		if (navegador.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();

		} else if (navegador.equalsIgnoreCase("Edge")) {

			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(site);
			driver.manage().window().maximize();

		} else {

			System.err.println("Navegador desconhecido");

		}

	}

	public void clicar(By element) {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(element).click();

	}

	public void escrever(String texto, By element) {

		driver.findElement(element).sendKeys(texto);

	}

	public void estabilizarPagina(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void validarUrl(String site) throws MalformedURLException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		assertEquals(site, url);

	}

	public void validarTexto(String textoEsperado, By element) {

		WebElement elemento = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(driver -> driver.findElement(element));
		assertEquals(elemento.getText(), textoEsperado);

	}

	public void tirarPrint(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void fecharNavegador(String passo) {

		driver.quit();

	}

}
