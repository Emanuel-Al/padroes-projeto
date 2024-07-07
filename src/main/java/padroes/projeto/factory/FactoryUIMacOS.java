package padroes.projeto.factory;

public class FactoryUIMacOS implements FactoryUI {

	public Botao criarBotao() {
		return new BotaoMacOS();
	}
	
	public CaixaDialogo criarCaixaDialogo() {
		return new CaixaDialogoMacOS();
	}
}
