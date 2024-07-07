package padroes.projeto.factory;

public class Main {
    public static void main(String[] args) {
        FactoryUI factoryUI;

       String sistemaOperacional = "MacOS";
       if (sistemaOperacional.equals("Windows")) {
            factoryUI = new FactoryUIWindows();
        } else {
            factoryUI = new FactoryUIMacOS();
        }
       
        Botao botao = factoryUI.criarBotao();
        CaixaDialogo caixaDialogo = factoryUI.criarCaixaDialogo();

        botao.clicar();
        caixaDialogo.renderizar();
    }
}
