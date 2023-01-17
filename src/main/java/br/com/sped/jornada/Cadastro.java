package br.com.sped.jornada;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.sped.auxiliares.DataHoraScreen;
import br.com.sped.auxiliares.Screen;



public class Cadastro {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	public String nomeEmpresa ="";
	public String cnpj ="";
	public String nomeAdministrador ="";
	public String emailAdministrador ="";
	public String celular = "";
	public String vigenciaInicio ="";
	public String quantidadeDeLicenca ="";
	public String janela = "";
	
	public Cadastro(WebDriver driver, String nomeEmpresa, String nomeAdministrador, String emailAdministrador, String celular, String cnpj) {
		Cadastro.driver = driver;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeAdministrador = nomeAdministrador+"123";
		this.emailAdministrador = emailAdministrador;
		this.celular = celular;
		this.cnpj = cnpj;
	}
	
	public Cadastro(WebDriver driver, String nomeEmpresa, String nomeAdministrador, String emailAdministrador, String celular) {
		Cadastro.driver = driver;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeAdministrador = nomeAdministrador;
		this.emailAdministrador = emailAdministrador;
		this.celular = celular;
	}
	
	public Cadastro(WebDriver driver, String nomeEmpresa, String cnpj, String nomeAdministrador, String emailAdministrador, String celular,
			String vigenciaInicio, String quantidadeDeLicenca) {
		Cadastro.driver = driver;
		
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.nomeAdministrador = nomeAdministrador;
		this.emailAdministrador = emailAdministrador;
		this.celular = celular;
		this.vigenciaInicio = vigenciaInicio;
		this.quantidadeDeLicenca = quantidadeDeLicenca;
	}

	
	public void cadastroEmpresa(WebDriver driver ) throws InterruptedException, IOException {
		Cadastro.driver = driver;
		ArrayList<String> abas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(0));
		driver.findElement(By.xpath((String.valueOf(e.optionCadastrarEmpresaManual)))).click();
		
		System.out.println("Cadastro empresa manual");
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "CADASTRAR_EMPRESA_CONTRATANTE.png");
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.inputNomeEmpresa)))).sendKeys(nomeEmpresa);
		System.out.println(driver.findElement(By.xpath((String.valueOf(e.inputNomeEmpresa)))).getText());
		System.out.println(driver.findElement(By.xpath((String.valueOf(e.inputNomeEmpresa)))).getAttribute("value"));
		Assert.assertEquals(nomeEmpresa,driver.findElement(By.xpath((String.valueOf(e.inputNomeEmpresa)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.inputCNPJ)))).sendKeys(cnpj);
		//Assert.assertEquals(cnpj,driver.findElement(By.xpath((String.valueOf(e.inputCNPJ)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.inputNomeAdministrador)))).sendKeys(nomeAdministrador);
		Assert.assertEquals(nomeAdministrador,driver.findElement(By.xpath((String.valueOf(e.inputNomeAdministrador)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.inputEmailAdministrador)))).sendKeys(emailAdministrador);
		Assert.assertEquals(emailAdministrador,driver.findElement(By.xpath((String.valueOf(e.inputEmailAdministrador)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.inputCelularAdministrador)))).sendKeys(celular);
		//Assert.assertEquals(celular,driver.findElement(By.xpath((String.valueOf(e.inputCelularAdministrador)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.inputSelcionarCanaldeVendas)))).click();
		driver.findElement(By.xpath((String.valueOf(e.inputVendaDireta)))).click();
		//[2]
		//Assert.assertEquals(e.inputVendaDireta,driver.findElement(By.xpath((String.valueOf(e.inputSelcionarCanaldeVendas)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.inputQuantidadeLicenca)))).clear();
		
		driver.findElement(By.xpath((String.valueOf(e.inputQuantidadeLicenca)))).sendKeys("30");
		Assert.assertEquals("30",driver.findElement(By.xpath((String.valueOf(e.inputQuantidadeLicenca)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.optionGerarRelatorio)))).click();
		driver.findElement(By.xpath((String.valueOf(e.selectSim)))).click();
		//true
		//Assert.assertEquals(e.selectSim,driver.findElement(By.xpath((String.valueOf(e.optionGerarRelatorio)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.optionSistemadeGestao)))).click();
		driver.findElement(By.xpath((String.valueOf(e.selectAthenas)))).click();
		//[1]
		//Assert.assertEquals(e.selectAthenas,driver.findElement(By.xpath((String.valueOf(e.optionSistemadeGestao)))).getAttribute("value"));
		
		Thread.sleep(2000);
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "DADOS_EMPRESA.png");

		driver.findElement(By.xpath(String.valueOf(e.btOk))).click();
		
		Thread.sleep(2000);
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "EMPRESA_CADASTRADA.png");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath(String.valueOf(e.btVoltar))).click();
		
	}
	
	
	
	

	
	
	
	
}
