package padroes.projeto.strategy;

public class EnvioEconomico extends StrategyCalculoCustoEnvio {
    public double calcularCustoEnvio(double peso) {
        return peso * 0.03; 
    }
}
