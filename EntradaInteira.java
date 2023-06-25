public class EntradaInteira extends Entrada {
    public EntradaInteira(int numeroDoAssento, Espetaculo espetaculo) {
        super(numeroDoAssento, espetaculo);
    }
    
    @Override
    public double calculaValor() {
        // Lógica específica para o cálculo do valor da entrada inteira
        return getEspetaculo().getPreco();
    }
}
