package padroes.projeto.factory;

public class FactoryUIWindows implements FactoryUI {

    public Botao criarBotao() {
        return new BotaoWindows();
    }

    public CaixaDialogo criarCaixaDialogo() {
        return new CaixaDialogoWindows();
    }
}
