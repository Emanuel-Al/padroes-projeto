package padroes.projeto.strategy;

public class Main {
    public static void main(String[] args) {
        CalculadoraCustoEnvio calculadora = new CalculadoraCustoEnvio();

        calculadora.setStrategy(new EnvioExpresso());
        double custoEnvioExpresso = calculadora.calcularCustoEnvio(5.0);
        System.out.println("Custo de envio expresso: $" + custoEnvioExpresso);

        calculadora.setStrategy(new EnvioPadrao());
        double custoEnvioPadrao = calculadora.calcularCustoEnvio(5.0);
        System.out.println("Custo de envio padrão: $" + custoEnvioPadrao);

        calculadora.setStrategy(new EnvioEconomico());
        double custoEnvioEconomico = calculadora.calcularCustoEnvio(5.0);
        System.out.println("Custo de envio econômico: $" + custoEnvioEconomico);
    }
}
