package br.com.sped.jornada;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.sped.auxiliares.DataHoraScreen;
import br.com.sped.auxiliares.Screen;

public class Login {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	public String emailAdmin = "";
	public String senhaAdmin = "";
	public String janela = "";

	public Login() {

	}

	public Login(WebDriver driver, String url, String emailAdmin, String senhaAdmin) {
		Login.driver = driver;
		this.url = url;
		this.emailAdmin = emailAdmin;
		this.senhaAdmin = senhaAdmin;
	}

	public void login() throws InterruptedException, IOException {
		Login.driver = driver;
		
		System.out.println("Fazendo login na área do administrador");
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "LOGIN.png");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.inputEmailAdmin)))).sendKeys(emailAdmin);
		driver.findElement(By.xpath((String.valueOf(e.inputPasswordAdmin)))).sendKeys(senhaAdmin);
		driver.findElement(By.xpath((String.valueOf(e.btEntrar)))).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.headerAreaAdmin))));
		
		Thread.sleep(2000);
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "AREA_ADMINISTRADOR.png");
		
		
		

		
	}
		
}
