package padroes.projeto.strategy;

public class EnvioExpresso extends StrategyCalculoCustoEnvio {
    public double calcularCustoEnvio(double peso) {
        // Simula o cálculo do custo de envio expresso
        return peso * 0.1; // Exemplo simples: custo baseado apenas no peso
    }
}
