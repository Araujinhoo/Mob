package ElementosExameAnterior;

import org.openqa.selenium.By;

public class ElementosExameAnterior {

	
	private By email = By.xpath("//*[@id=\"input_1\"]");
	private By senha = By.id("password");
	private By entrar = By.xpath("//*[@id=\"content\"]/section/div/div/div[1]/div/div/div[3]/button[1]");
	private By proximo = By.xpath("//*[@id=\"content\"]/section/div/div/div[1]/div/div/div[3]/button[2]");
	private By assiandos = By.xpath("//*[@id=\"barra-modalidades\"]/li[2]/button[4]");
	private By paciente = By.xpath("//*[@id=\"listaExames\"]/tr[1]/td[5]/button");
	private By addexaant = By.xpath("//*[@id=\"dialogContent_43\"]/form/div/div[3]/div[3]/div[1]/button");
	private By mesmonome = By.xpath("//*[@id=\"dialogContent_60\"]/form[1]/div/div[2]/div[1]/md-checkbox[1]");
	private By mesmadtaniv = By.xpath("//*[@id=\"dialogContent_60\"]/form[1]/div/div[2]/div[1]/md-checkbox[3]");
	private By mesmamod = By.xpath("//*[@id=\"dialogContent_60\"]/form[1]/div/div[2]/div[2]/md-checkbox[3]");
	private By todos = By.xpath("//*[@id=\"radio_59\"]");
	private By buscar = By.xpath("//*[@id=\"dialogContent_60\"]/form[1]/div/div[1]/div[2]/button");
	private By caixa = By.xpath("//*[@id=\"dialogContent_60\"]/form[2]/div/div[1]/div/table/tbody/tr[1]/td[1]/md-checkbox");
	private By clipsexa = By.xpath("//*[@id=\"dialogContent_60\"]/form[2]/div/div[1]/div/table/tbody/tr[2]/td/div/div[6]/anexo[1]/button");
	private By buscarpornome = By.id("nomePaciente");
	private By lupa = By.xpath("//*[@id=\"barra-modalidades\"]/li[4]/button[1]");
	private By filtrosavançados = By.xpath("//*[@id=\"barra-modalidades\"]/li[4]/button[3]");
	private By estudo = By.id("estudoBtn");
	public By getCaixa() {
		return caixa;
	}
	public By getClipsexa() {
		return clipsexa;
	}
	public By getMesmonome() {
		return mesmonome;
	}
	public By getMesmadtaniv() {
		return mesmadtaniv;
	}
	public By getMesmamod() {
		return mesmamod;
	}
	public By getBuscar() {
		return buscar;
	}
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	}
	public By getEntrar() {
		return entrar;
	}
	public By getProximo() {
		return proximo;
	}
	public By getAssiandos() {
		return assiandos;
	}
	public By getPaciente() {
		return paciente;
	}
	public By getAddexaant() {
		return addexaant;
	}
	public By getTodos() {
		return todos;
	}
	public By getBuscarpornome() {
		return buscarpornome;
	}
	public By getLupa() {
		return lupa;
	}
	public By getFiltrosavançados() {
		return filtrosavançados;
	}
	public By getEstudo() {
		return estudo;
	}

}
