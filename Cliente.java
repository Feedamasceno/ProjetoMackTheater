import java.util.ArrayList;

public class Cliente {
    private String nomeCliente;
    private String cpf;
    private ArrayList<Pedido> pedidos;
    
    public Cliente(String nomeCliente, String cpf) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.pedidos = new ArrayList<Pedido>();
    }
    
    public void adicionaPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public void mostrarDados() {
        System.out.println("Cliente cadastrado com sucesso!\n");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("CPF: " + cpf + "\n");
    }
    
    // Getters e Setters
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
