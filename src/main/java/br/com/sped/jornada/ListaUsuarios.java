package br.com.sped.jornada;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.sped.auxiliares.DataHoraScreen;
import br.com.sped.auxiliares.Screen;
import junit.framework.Assert;

public class ListaUsuarios {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	
	public ListaUsuarios() {
		
	}
	public void listaEmpresas(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "TELA_INICIAL.png");
		
		driver.findElement(By.xpath((String.valueOf(e.optionListaDeUsuarios)))).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.headerListaDeUsuarios))));
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "LISTA_DE_USUARIOS.png");
	}
	
	/*public void ativarEmpresa(WebDriver driver, String nomeEmpresa, String novaSenha, String confirmaSenha, String cnpj) throws InterruptedException, IOException {
		ListaUsuarios.driver = driver;
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "TELA_INICIAL.png");
		
		driver.findElement(By.xpath((String.valueOf(e.optionListaDeUsuarios)))).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.headerListaDeUsuarios))));
		Thread.sleep(2000);
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "LISTA_DE_USUARIOS.png");
		
	
		driver.findElement(By.xpath((String.valueOf(e.optionEmpresaCOntratante)))).click();
		driver.findElement(By.xpath((String.valueOf(e.procurarNomeEmpresa)))).sendKeys(cnpj);
		driver.findElement(By.xpath(("/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/div[1]/div/div[1]/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li"))).click();
		//String list = driver.findElement(By.id("pr_id_1_list")).getAttribute("p-dropdownitem");
		//System.out.println(list);
		//System.out.println(list.);
		//list.findElement(By.xpath("//span [text()='Teste Automatizando']")).click();
		//driver.findElement(By.xpath((String.valueOf(e.optionEmpresa)))).click();
		System.out.println(driver.findElement(By.xpath((String.valueOf(e.statusAcoes)))).getText());
		System.out.println(driver.findElement(By.xpath((String.valueOf(e.situacao)))).getText());
		Thread.sleep(2000);	
		driver.findElement(By.xpath((String.valueOf(e.optionAtivarEmpresa)))).click();
		driver.findElement(By.xpath((String.valueOf(e.inputNovaSenha)))).sendKeys(novaSenha);
		driver.findElement(By.xpath((String.valueOf(e.inputConfirmarSenha)))).sendKeys(confirmaSenha);
		driver.findElement(By.xpath((String.valueOf(e.btsSalvar)))).click();
		Thread.sleep(2000);	
		System.out.println(driver.findElement(By.xpath((String.valueOf(e.statusAcoes)))).getText());
		System.out.println(driver.findElement(By.xpath((String.valueOf(e.situacao)))).getText());
		Assert.assertEquals("Ativado", driver.findElement(By.xpath((String.valueOf(e.statusAcoes)))).getText());
		
		driver.findElement(By.xpath((String.valueOf(e.btVoltarListaUsuarios)))).click();

		
	}*/
	
	
	
	
}
