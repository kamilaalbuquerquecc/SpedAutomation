package br.com.sped.testes;

import java.io.IOException;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.sped.jornada.AtivarEmpresa;
import br.com.sped.jornada.Base_Test;
import br.com.sped.jornada.Login;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa_senhaInvalida.csv")

public class TesteAtivarEmpresaComSenhaInvalida extends Base_Test {
	
	@Test
	public void testeAtivarEmpresaComSenhaInvalidaSemCaractereEspecial(@Param(name = "emailAdmin") String emailAdmin,
			@Param(name = "senhaAdmin") String senhaAdmin, @Param(name = "cnpjEmpresa") String cnpjEmpresa, @Param(name = "novaSenha") String novaSenha,@Param(name = "confirmaSenha") String confirmaSenha) throws InterruptedException, IOException {
		
		Login l = new Login(driver, properties.getProperty("url.sped.admin"), emailAdmin, senhaAdmin);
		l.login();
		
		AtivarEmpresa empresa = new AtivarEmpresa();
		empresa.ativarEmpresaComSenhaInvalidaSemCaractereEspecial(Login.driver, cnpjEmpresa , novaSenha, confirmaSenha);
		driver.close();
	}
	
	@Test
	public void testeAtivarEmpresaComSenhaInvalidaSemCaractereMaiusculo(@Param(name = "emailAdmin") String emailAdmin,
			@Param(name = "senhaAdmin") String senhaAdmin, @Param(name = "cnpjEmpresa") String cnpjEmpresa, @Param(name = "novaSenha") String novaSenha,@Param(name = "confirmaSenha") String confirmaSenha) throws InterruptedException, IOException {
		
		Login l = new Login(driver, properties.getProperty("url.sped.admin"),emailAdmin,senhaAdmin);
		l.login();
		
		AtivarEmpresa empresa = new AtivarEmpresa();
		empresa.ativarEmpresaComSenhaInvalidaSemCaractereMaiusculo(Login.driver, cnpjEmpresa , novaSenha, confirmaSenha);
		driver.close();
	}
	
	@Test
	public void testeAtivarEmpresaComSenhaInvalidaSemCaractereMinusculo(@Param(name = "emailAdmin") String emailAdmin,
			@Param(name = "senhaAdmin") String senhaAdmin, @Param(name = "cnpjEmpresa") String cnpjEmpresa, @Param(name = "novaSenha") String novaSenha,@Param(name = "confirmaSenha") String confirmaSenha) throws InterruptedException, IOException {
		
		Login l = new Login(driver, properties.getProperty("url.sped.admin"),emailAdmin,senhaAdmin);
		l.login();
		
		AtivarEmpresa empresa = new AtivarEmpresa();
		empresa.ativarEmpresaComSenhaInvalidaSemCaractereMinusculo(Login.driver, cnpjEmpresa , novaSenha, confirmaSenha);
		driver.close();
	}
	
	@Test
	public void testeAtivarEmpresaComSenhaInvalidaSemNumero(@Param(name = "emailAdmin") String emailAdmin,
			@Param(name = "senhaAdmin") String senhaAdmin, @Param(name = "cnpjEmpresa") String cnpjEmpresa, @Param(name = "novaSenha") String novaSenha,@Param(name = "confirmaSenha") String confirmaSenha) throws InterruptedException, IOException {
		
		Login l = new Login(driver, properties.getProperty("url.sped.admin"),emailAdmin,senhaAdmin);
		l.login();
		
		AtivarEmpresa empresa = new AtivarEmpresa();
		empresa.ativarEmpresaComSenhaInvalidaSemNumero(Login.driver, cnpjEmpresa , novaSenha, confirmaSenha);
		driver.close();
	}
	
	@Test
	public void testeAtivarEmpresaComSenhaInvalidaCaracteresInsuficientes(@Param(name = "emailAdmin") String emailAdmin,
			@Param(name = "senhaAdmin") String senhaAdmin, @Param(name = "cnpjEmpresa") String cnpjEmpresa, @Param(name = "novaSenha") String novaSenha,@Param(name = "confirmaSenha") String confirmaSenha) throws InterruptedException, IOException {
		
		Login l = new Login(driver, properties.getProperty("url.sped.admin"),emailAdmin,senhaAdmin);
		l.login();
		
		AtivarEmpresa empresa = new AtivarEmpresa();
		empresa.ativarEmpresaComSenhaInvalidaCaracteresInsuficientes(Login.driver, cnpjEmpresa , novaSenha, confirmaSenha);
		driver.close();
	}
	
	@Test
	public void testeAtivarEmpresaComSenhaInvalidaNãoCorrespondem(@Param(name = "emailAdmin") String emailAdmin,
			@Param(name = "senhaAdmin") String senhaAdmin, @Param(name = "cnpjEmpresa") String cnpjEmpresa, @Param(name = "novaSenha") String novaSenha,@Param(name = "confirmaSenha") String confirmaSenha) throws InterruptedException, IOException {
		
		Login l = new Login(driver, properties.getProperty("url.sped.admin"),emailAdmin,senhaAdmin);
		l.login();
		
		AtivarEmpresa empresa = new AtivarEmpresa();
		empresa.ativarEmpresaComSenhaInvalidaNãoCorrespondem(Login.driver, cnpjEmpresa , novaSenha, confirmaSenha);
		driver.close();
	}
}
