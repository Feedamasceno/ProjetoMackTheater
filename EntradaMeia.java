public class EntradaMeia extends Entrada {
    public EntradaMeia(int numeroDoAssento, Espetaculo espetaculo) {
        super(numeroDoAssento, espetaculo);
    }
    
    @Override
    public double calculaValor() {
        return getEspetaculo().getPreco() * 0.5;
    }
}
