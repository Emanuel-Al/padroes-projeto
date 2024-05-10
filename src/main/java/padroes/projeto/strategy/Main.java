package padroes.projeto.strategy;

public class Main {

    public static void main(String[] args) {
        CalculadoraCustoEnvio calculadora = new CalculadoraCustoEnvio();

        // Configura a estratégia de cálculo de custo de envio como "envio expresso"
        calculadora.setStrategy(new EnvioExpresso());
        double custoEnvioExpresso = calculadora.calcularCustoEnvio(5.0);
        System.out.println("Custo de envio expresso: $" + custoEnvioExpresso);

        // Configure a estratégia de cálculo de custo de envio como "envio padrao"

        // Configure a estratégia de cálculo de custo de envio como "envio economico"
    }
}
