package br.com.sped.jornada;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.sped.auxiliares.DataHoraScreen;
import br.com.sped.auxiliares.Screen;
import junit.framework.Assert;

public class AtivarEmpresa {
	
	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	ListaUsuarios empresas = new ListaUsuarios();
	
	public AtivarEmpresa() {
		
	}
	
	public void ativarEmpresaComSenhaInvalidaSemCaractereEspecial(WebDriver driver, String nomeEmpresa, String novaSenha, String confirmaSenha) throws IOException, InterruptedException {
		AtivarEmpresa.driver = driver;
		empresas.listaEmpresas(driver);
		procuraEmpresa(nomeEmpresa);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		
		cadastraSenha(novaSenha, confirmaSenha);
		//Sugestão de tentar mais uma vez achar o botao por exemplo
		Thread.sleep(2000);
		Assert.assertEquals("Campo Inválido",driver.findElement(By.xpath((String.valueOf(e.txtPrimeiroPoupSenha)))).getText());	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "SenhaInvalidaSemCaractereEspecial.png");
	}
	
	public void ativarEmpresaComSenhaInvalidaSemCaractereMaiusculo(WebDriver driver, String nomeEmpresa, String novaSenha, String confirmaSenha) throws IOException, InterruptedException {
		AtivarEmpresa.driver = driver;
		empresas.listaEmpresas(driver);
		procuraEmpresa(nomeEmpresa);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		
		cadastraSenha(novaSenha, confirmaSenha);
		
		Thread.sleep(2000);
		Assert.assertEquals("Campo Inválido",driver.findElement(By.xpath((String.valueOf(e.txtPrimeiroPoupSenha)))).getText());
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "SenhaInvalidaSemCaractereMaiusculo.png");
	}
	
	public void ativarEmpresaComSenhaInvalidaSemCaractereMinusculo(WebDriver driver, String nomeEmpresa, String novaSenha, String confirmaSenha) throws IOException, InterruptedException {
		AtivarEmpresa.driver = driver;
		empresas.listaEmpresas(driver);
		procuraEmpresa(nomeEmpresa);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		
		cadastraSenha(novaSenha, confirmaSenha);
		
		Thread.sleep(2000);
		Assert.assertEquals("Campo Inválido",driver.findElement(By.xpath((String.valueOf(e.txtPrimeiroPoupSenha)))).getText());
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "SenhaInvalidaSemCaractereMinusculo.png");
	}
	
	public void ativarEmpresaComSenhaInvalidaSemNumero(WebDriver driver, String nomeEmpresa, String novaSenha, String confirmaSenha) throws IOException, InterruptedException {
		AtivarEmpresa.driver = driver;
		empresas.listaEmpresas(driver);
		procuraEmpresa(nomeEmpresa);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		
		cadastraSenha(novaSenha, confirmaSenha);
		
		Thread.sleep(2000);
		Assert.assertEquals("Campo Inválido",driver.findElement(By.xpath((String.valueOf(e.txtPrimeiroPoupSenha)))).getText());
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "SenhaInvalidaSemNumero.png");
	}
	
	public void ativarEmpresaComSenhaInvalidaCaracteresInsuficientes(WebDriver driver, String nomeEmpresa,
			String novaSenha, String confirmaSenha) throws InterruptedException, IOException {
		AtivarEmpresa.driver = driver;
		empresas.listaEmpresas(driver);
		procuraEmpresa(nomeEmpresa);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		
		cadastraSenha(novaSenha, confirmaSenha);
		driver.findElement(By.xpath((String.valueOf(e.inputNovaSenha)))).click();
		
		Thread.sleep(2000);
		Assert.assertEquals("Quantidade de caracteres insuficiente",driver.findElement(By.xpath((String.valueOf(e.txtPrimeiroPoupSenha)))).getText());
		Assert.assertEquals("Quantidade de caracteres insuficiente",driver.findElement(By.xpath((String.valueOf(e.txtSegundoPoupSenha)))).getText());
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "SenhaInvalidaCaracteresInsuficientes.png");
	}

	public void ativarEmpresaComSenhaInvalidaNãoCorrespondem(WebDriver driver, String nomeEmpresa, String novaSenha,
			String confirmaSenha) throws InterruptedException, IOException {
		
		AtivarEmpresa.driver = driver;
		empresas.listaEmpresas(driver);
		procuraEmpresa(nomeEmpresa);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		
		cadastraSenha(novaSenha, confirmaSenha);
		driver.findElement(By.xpath((String.valueOf(e.inputNovaSenha)))).click();
		
		Thread.sleep(2000);
		Assert.assertEquals("As senhas não correspondem",driver.findElement(By.xpath((String.valueOf(e.txtSegundoPoupSenha)))).getText());
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "SenhaInvalidaNãoCorrespondem.png");
		
	}
	
	public void ativarEmpresa(WebDriver driver, String nomeEmpresa, String novaSenha, String confirmaSenha, String cnpj) throws InterruptedException, IOException {
		AtivarEmpresa.driver = driver;
		empresas.listaEmpresas(driver);
		procuraEmpresa(cnpj);
		
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		
		cadastraSenha(novaSenha, confirmaSenha);
		driver.findElement(By.xpath((String.valueOf(e.btsSalvar)))).click();
		
		Thread.sleep(3000);	
		Assert.assertEquals("Ativado", driver.findElement(By.xpath((String.valueOf(e.statusAcoes)))).getAttribute("value"));
		
	}
	
	
	public void procuraEmpresa(String cnpj) throws InterruptedException, IOException {
		
		driver.findElement(By.xpath((String.valueOf(e.optionEmpresaCOntratante)))).click();
		
		driver.findElement(By.xpath((String.valueOf(e.procurarNomeEmpresa)))).sendKeys(cnpj);
		Assert.assertEquals(cnpj,driver.findElement(By.xpath((String.valueOf(e.procurarNomeEmpresa)))).getAttribute("value"));
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "ENCONTROU_EMPRESA.png");
		
		driver.findElement(By.xpath((e.optionEmpresa))).click();
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "EMPRESA_ENCONTRADA.png");
	}
	
	public void cadastraSenha(String novaSenha, String confirmaSenha) throws IOException, InterruptedException {
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "ATIVAR_USUARIO.png");
		
		driver.findElement(By.xpath((String.valueOf(e.inputNovaSenha)))).sendKeys(novaSenha);
		Assert.assertEquals(novaSenha,driver.findElement(By.xpath((String.valueOf(e.inputNovaSenha)))).getAttribute("value"));
		
		driver.findElement(By.xpath((String.valueOf(e.inputConfirmarSenha)))).sendKeys(confirmaSenha);
		Assert.assertEquals(confirmaSenha,driver.findElement(By.xpath((String.valueOf(e.inputConfirmarSenha)))).getAttribute("value"));
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "SENHA_INSERIDA.png");
	}

	
	

}
