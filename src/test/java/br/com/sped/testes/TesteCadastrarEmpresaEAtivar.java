package br.com.sped.testes;

import java.io.IOException;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.sped.auxiliares.GeradorDeCNPJ;
import br.com.sped.jornada.AtivarEmpresa;
import br.com.sped.jornada.Base_Test;
import br.com.sped.jornada.Cadastro;
import br.com.sped.jornada.Login;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa.csv")

public class TesteCadastrarEmpresaEAtivar extends Base_Test {

	@Test
	public void testeCadastro(@Param(name = "emailAdmin") String emailAdmin,
			@Param(name = "senhaAdmin") String senhaAdmin, @Param(name = "nomeEmpresa") String nomeEmpresa,
			@Param(name = "nomeAdministrador") String nomeAdministrador,
			@Param(name = "emailAdministrador") String emailAdministrador, @Param(name = "celular") String celular,@Param(name = "novaSenha") String novaSenha,@Param(name = "confirmaSenha") String confirmaSenha) throws InterruptedException, IOException {

		Login l = new Login(driver, properties.getProperty("url.sped.admin"), emailAdmin, senhaAdmin);
		l.login();

		// Gera e cadastra CNPJ
		GeradorDeCNPJ cnpj = new GeradorDeCNPJ();

		cnpj.geraCNPJ( Login.driver,properties.getProperty("url.cnpj"));

		// Criar empresa contratante
		Cadastro c = new Cadastro(Login.driver, nomeEmpresa, nomeAdministrador, emailAdministrador, celular, cnpj.cnpj);

		c.cadastroEmpresa(Login.driver);

		Thread.sleep(2000);
		// Ativa empresa
		AtivarEmpresa ativar = new AtivarEmpresa();
		ativar.ativarEmpresa(Login.driver, nomeEmpresa, novaSenha, confirmaSenha, cnpj.cnpj);
		driver.close();

		

	}

}
