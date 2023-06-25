public class EntradaProfessor extends Entrada {
    public EntradaProfessor(int numeroDoAssento, Espetaculo espetaculo) {
        super(numeroDoAssento, espetaculo);
    }
    
    @Override
    public double calculaValor() {
        return getEspetaculo().getPreco() * 0.4;
    }
}

