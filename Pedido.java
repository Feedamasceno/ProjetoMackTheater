import java.util.ArrayList;

public class Pedido {
    private ArrayList<Entrada> entradas;
    
    public Pedido() {
        entradas = new ArrayList<Entrada>();
    }
    
    public void adicionaEntrada(Entrada entrada) {
        entradas.add(entrada);
    }
    
    @Override
    public String toString() {
        return "Pedido [entradas=" + entradas + "]";
    }
}
