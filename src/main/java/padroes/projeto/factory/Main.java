package padroes.projeto.factory;

public class Main {
    public static void main(String[] args) {
        // Escolha da fábrica de acordo com o sistema operacional
        FactoryUI factoryUI;

       // String sistemaOperacional = "Windows"; // Pode ser "macOS"
       // if (sistemaOperacional.equals("Windows")) {
            factoryUI = new FactoryUIWindows();
       // } else {
            // deve haver a opcao do mac os aqui
       // }

        // Criar botão e caixa de diálogo usando a fábrica selecionada
        Botao botao = factoryUI.criarBotao();
        CaixaDialogo caixaDialogo = factoryUI.criarCaixaDialogo();

        // Usar os objetos criados
        botao.clicar();
        caixaDialogo.renderizar();
    }
}
