package TesteExameAnterior;

import ElementosExameAnterior.ElementosExameAnterior;
import MetodosExameAnterior.MetodosExameAnterior;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class TesteExameAnterior {

	
	ElementosExameAnterior e = new ElementosExameAnterior();
	MetodosExameAnterior m = new MetodosExameAnterior ();
	
	@Dado("que eu esteja na tela de exames")
	public void que_eu_esteja_na_tela_de_exames() throws InterruptedException {
		m.abrirnavegador("https://homolog.mobilemed.com.br/exames");
		m.tempo(950);
		m.preencher(e.getEmail(), "medico3@mobilemed.com.br");
		m.tempo(200);
		m.clicar(e.getProximo());
		m.tempo(1000);
		m.preencher(e.getSenha(), "Mobile@Med23");
		m.tempo(1550);
		m.clicar(e.getEntrar());
	}
	@Quando("seleciono o exame")
		public void seleciono_o_exame() throws InterruptedException {
		m.tempo(9300);
		m.atualizar(null);
		m.preencher(e.getBuscarpornome(), "Jose");
		m.tempo(4520);
		m.preencher(e.getBuscarpornome(), "");
		m.tempo(5000);
		m.clicar(e.getLupa());
		m.atualizar(null);
		}
	@Quando("clico no estudo")
	public void clico_no_estudo() throws InterruptedException {
		m.tempo(4000);
		m.clicar(e.getEstudo());
	}
	@Quando("seleciono “adicionar exame anterior”")
	public void seleciono_adicionar_exame_anterior() throws InterruptedException {
	    m.tempo(6260);
	    m.clicar(e.getAddexaant());
	}
	@Quando("faço a seleção de filtros")
	public void faço_a_seleção_de_filtros() throws InterruptedException {
	    m.tempo(3000);
	    m.clicar(e.getMesmonome());
	    m.tempo(2750);
	    m.clicar(e.getMesmadtaniv());
	    m.tempo(2450);
	    m.clicar(e.getMesmamod());
	    m.tempo(2370);
	    m.clicar(e.getTodos());
	    m.tempo(2700);
	    m.clicar(e.getBuscar());
	}
	@Quando("seleciono exame anterior")
	public void seleciono_exame_anterior() throws InterruptedException {
		m.tempo(18000);
	    m.clicar(e.getCaixa());
	}
	@Então("posso adicionar exame ou arquivo clicando nos ícones de clips")
	public void posso_adicionar_exame_ou_arquivo_clicando_nos_ícones_de_clips() throws InterruptedException {
	    m.tempo(5000);
	    m.clicar(e.getClipsexa());
	    m.tempo(4000);
	    m.fechar(null);
	}

}
