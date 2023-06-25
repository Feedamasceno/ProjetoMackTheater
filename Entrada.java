public abstract class Entrada {
    private int numeroDoAssento;
    private Espetaculo espetaculo;

    public Entrada(int numeroDoAssento, Espetaculo espetaculo) {
        this.numeroDoAssento = numeroDoAssento;
        this.espetaculo = espetaculo;
    }

    public int getNumeroDoAssento() {
        return numeroDoAssento;
    }

    public Espetaculo getEspetaculo() {
        return espetaculo;
    }

    public abstract double calculaValor();

    public double getPreco() {
        return 0;
    }
}
