import java.util.ArrayList;
public class Teatro {

    private Pedido carrinho = null;
    private Espetaculo espetaculoSelecionado = null;

    ArrayList<Cliente>clientes;
    
    public Teatro() {
        clientes = new ArrayList<Cliente>();
    }
    
    public void novaCompra() {
        carrinho = new Pedido();
    }
    
    public void apresentaEspetaculos(ArrayList<Espetaculo> listaEspetaculos) {
        System.out.println("\n*** ESPETÁCULOS DISPONÍVEIS ***");
        for (int i = 0; i < listaEspetaculos.size(); i++) {
            System.out.println((i + 1) + ") " + listaEspetaculos.get(i));
        }
    }
    
    public void selecionaEspetaculo(ArrayList<Espetaculo> listaEspetaculos, int numero) {
        if (numero >= 1 && numero <= listaEspetaculos.size()) {
            espetaculoSelecionado = listaEspetaculos.get(numero - 1);
            System.out.println("\nEspetáculo selecionado: " + espetaculoSelecionado);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    public void novoCliente(String nomeCliente, String cpf) {
        Cliente cliente = new Cliente(nomeCliente, cpf);
        clientes.add(cliente);
        System.out.println("\nCliente cadastrado com sucesso!");
    }
    
    public void adicionaEntrada(int tipo, int assento) {
        if (carrinho != null && espetaculoSelecionado != null) {
            Entrada entrada = espetaculoSelecionado.novaEntrada(tipo, assento);
            if (entrada != null) {
                carrinho.adicionaEntrada(entrada);
                System.out.println("\nEntrada adicionada ao carrinho!");
            }
        } else {
            System.out.println("\nEspetáculo ou carrinho não selecionados.");
        }
    }
    
    public void finalizaCompra(String cpfCliente) {
        if (carrinho != null) {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(cpfCliente)) {
                    cliente.adicionaPedido(carrinho);
                    System.out.println("\nCompra finalizada com sucesso!");
                    carrinho = null;
                    espetaculoSelecionado = null;
                    return;
                }
            }
            System.out.println("\nCliente não encontrado.");
        } else {
            System.out.println("\nCarrinho vazio.");
        }
    }
    
    public void listaPedidosCliente(String cpfCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                ArrayList<Pedido> pedidos = cliente.getPedidos();
                if (pedidos.size() > 0) {
                    System.out.println("\n*** PEDIDOS DO CLIENTE ***");
                    for (Pedido pedido : pedidos) {
                        System.out.println(pedido);
                    }
                } else {
                    System.out.println("\nNenhum pedido encontrado.");
                }
                return;
            }
        }
        System.out.println("\nCliente não encontrado.");
    }
}
