package padroes.projeto.strategy;

public class CalculadoraCustoEnvio {
    private StrategyCalculoCustoEnvio strategy;

    public void setStrategy(StrategyCalculoCustoEnvio strategy) {
        this.strategy = strategy;
    }

    public double calcularCustoEnvio(double peso) {
        return strategy.calcularCustoEnvio(peso);
    }
}
