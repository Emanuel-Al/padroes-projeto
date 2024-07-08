package padroes.projeto.strategy;

public class EnvioPadrao extends StrategyCalculoCustoEnvio {
    public double calcularCustoEnvio(double peso) {
        return peso * 0.05; 
    }
}
