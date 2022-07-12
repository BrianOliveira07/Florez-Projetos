package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.remote.DesiredCapabilities;

import elementos.Elementos;
import java.net.URL;

public class Metodos extends Elementos {

	protected AndroidDriver<MobileElement> driver;

	public void abrirApp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("app", "C:\\Projetos\\Drogaria Pacheco\\DrogariasPacheco.apk");
		capabilities.setCapability("deviceName", "Motorola Brian");
		capabilities.setCapability("udid", "0047085353");
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);

	}

	public void tirarPrint(String foto) throws IOException {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./src/evidencias/" + foto + ".jpg"));

	}

	public void validarTexto(String textoEsperado, By elemento) {

		MobileElement element = (MobileElement) driver.findElement(elemento);
		String elText = element.getText();
		assertEquals(elText, textoEsperado);

	}

	public void estabilizarApp(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void fecharApp() {

		driver.quit();

	}

}
