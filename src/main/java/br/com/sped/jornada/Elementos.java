package br.com.sped.jornada;

public class Elementos {
	
	//class Login v
	public String btEntrar = "/html/body/app-root/app-product-admin-layout/app-login/section/div/form/div[3]/div/button";
	public String inputEmailAdmin = "/html/body/app-root/app-product-admin-layout/app-login/section/div/form/div[1]/div/div/input";
	public String inputPasswordAdmin = "/html/body/app-root/app-product-admin-layout/app-login/section/div/form/div[2]/div/div/input";
	public String headerAreaAdmin= "/html/body/app-root/app-product-admin-layout/app-dashboard/div/main/div/header/h1";
	
	//class cadastro
	public String optionCadastrarEmpresaManual = "/html/body/app-root/app-product-admin-layout/app-dashboard/div/main/div/section/div/ul/li[1]/p";
	public String headerCadastrarEmpresa = "/html/body/app-root/app-product-admin-layout/app-crud-empresa-contratante/div/main/div/header/h1";
	public String inputNomeEmpresa = "//*[@id=\"form\"]/div[1]/div[1]/div/label/input";
	public String inputCNPJ = "//*[@id=\"form\"]/div[1]/div[2]/label/input";
	public String inputNomeAdministrador = "//*[@id=\"form\"]/div[3]/div[1]/div/label/input";
	public String inputEmailAdministrador = "//*[@id=\"form\"]/div[3]/div[2]/div/label/input";
	public String inputCelularAdministrador = "//*[@id=\"form\"]/div[4]/div[1]/div/label/input";
	public String inputSelcionarCanaldeVendas = "//*[@id=\"form\"]/div[4]/div[2]/div/div[1]/label/select";
	public String inputVendaDireta = "//*[@id=\"form\"]/div[4]/div[2]/div/div[1]/label/select/option[3]";
	public String inputData = "//*[@id=\"form\"]/div[5]/div[1]/div/label/input";
	public String inputQuantidadeLicenca = "//*[@id=\"form\"]/div[5]/div[2]/div/label/input";
	public String optionGerarRelatorio = "//*[@id=\"form\"]/div[6]/div[1]/div/label/select";
	public String selectNao = "//*[@id=\"form\"]/div[6]/div[1]/div/label/select/option[1]";
	public String selectSim = "//*[@id=\"form\"]/div[6]/div[1]/div/label/select/option[2]";
	public String optionSistemadeGestao = "//*[@id=\"form\"]/div[6]/div[2]/label/select";
	public String selectAthenas = "//*[@id=\"form\"]/div[6]/div[2]/label/select/option[3]";
	public String btOk = "/html/body/app-root/app-product-admin-layout/app-crud-empresa-contratante/div/main/div/section/div/div/button[2]";
	public String headerListaDeEmpresas = "/html/body/app-root/app-product-admin-layout/app-lista-empresa-contratante/div/main/div/header/h1";
	public String btVoltar = "/html/body/app-root/app-product-admin-layout/app-lista-empresa-contratante/div/main/div/section/div/button[1]";
	
	
	//class Lista de Usuarios
	public String optionListaDeUsuarios = "/html/body/app-root/app-product-admin-layout/app-dashboard/div/main/div/section/div/ul/li[3]";
	public String headerListaDeUsuarios = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/header/h1";
	public String optionEmpresaCOntratante = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/div[1]/div/div[1]/p-dropdown/div/span";
	public String procurarNomeEmpresa = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/div[1]/div/div[1]/p-dropdown/div/div[3]/div[1]/div/input";
	public String optionEmpresa = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/div[1]/div/div[1]/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li";
	public String optionAtivarEmpresa = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/table/tr[2]/td[7]/span";
	public String inputNovaSenha= "//*[@id=\"mat-dialog-0\"]/app-modal-lista-usuarios/div/main/div/section/form/div[1]/div/div/input";
	public String inputConfirmarSenha= "//*[@id=\"mat-dialog-0\"]/app-modal-lista-usuarios/div/main/div/section/form/div[2]/div/div/input";
	public String btsSalvar = "//*[@id=\"mat-dialog-0\"]/app-modal-lista-usuarios/div/main/div/section/form/div[3]/button[2]";
	public String statusAcoes = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/table/tr[2]/td[7]/span";
	public String situacao = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/table/tr[2]/td[4]";
	public String txtPrimeiroPoupSenha = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-modal-lista-usuarios/div/main/div/section/form/div[1]/div/div/ng-component/div/p";
	public String txtSegundoPoupSenha = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-modal-lista-usuarios/div/main/div/section/form/div[2]/div/div/ng-component/div/p";
	public String btVoltarListaUsuarios = "/html/body/app-root/app-product-admin-layout/app-lista-usuarios/div/main/div/section/div[4]/button[1]";
	
	//class GeradorCNPJ
	public String btGerarCnpj = "//*[@id=\"nv-new-generator-cnpj\"]";
	public String txtCnpj = "//*[@id=\"nv-field-generator-cnpj\"]";
	public String btCopiar = "/html/body/main/div/div[2]/div/div[4]/div[1]/div[4]/div[1]/div[2]/span";
	
}
